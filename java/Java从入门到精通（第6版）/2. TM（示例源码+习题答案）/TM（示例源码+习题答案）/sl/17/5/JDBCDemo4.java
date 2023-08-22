
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo4 {
	Connection con;// �������ݿ����Ӷ���

	public void initConnection() {// ��ʼ�����ݿ�����
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");// �������ݿ�������
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			// ͨ���������ݿ��URL����ȡ���ݿ����Ӷ���
			con = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=Asia/Shanghai&zeroDateTimeBehavior=CONVERT_TO_NULL&allowPublicKeyRetrieval=true",
					"root", "123456");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void closeConnection() {// �ر����ݿ�����
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void showAllData() {// ��ʾ����ѧ������
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from tb_stu");
			while (rs.next()) { // �����ǰ��䲻�����һ���������ѭ��
				System.out.print("��ţ�" + rs.getString("id")); // ����ֵ���
				System.out.print(" ����:" + rs.getString("name"));
				System.out.print(" �Ա�:" + rs.getString("sex"));
				System.out.println(" ���գ�" + rs.getString("birthday"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void add(int id, String name, String sex, String birthday) {// �����ѧ��
		try {
			String sql = "insert into tb_stu values(?,?,?,?) ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id); // ���ñ��
			ps.setString(2, name); // ��������
			ps.setString(3, sex); // �����Ա�
			ps.setString(4, birthday); // ���ó�������
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void delete(int id) {// ɾ��ָ��ID��ѧ��
		try {
			Statement stmt = con.createStatement();
			stmt.executeUpdate("delete from tb_stu where id =" + id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void update(int id, String newName) {// �޸�ָ��ID��ѧ������
		try {
			String sql = "update tb_stu set name = ? where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, newName); // ��������
			ps.setInt(2, id); // ���ñ��
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		JDBCDemo4 demo = new JDBCDemo4();
		demo.initConnection();
		demo.showAllData();
		System.out.println("---�����ͬѧ---");
		demo.add(5, "������","��","1990-12-30");
		demo.showAllData();
		System.out.println("---�޸ı��Ϊ2��ѧ������---");
		demo.update(2, "������");
		demo.showAllData();
		System.out.println("---ɾ�����Ϊ3��ѧ��---");
		demo.delete(3);
		demo.showAllData();
		demo.closeConnection();
	}
}
