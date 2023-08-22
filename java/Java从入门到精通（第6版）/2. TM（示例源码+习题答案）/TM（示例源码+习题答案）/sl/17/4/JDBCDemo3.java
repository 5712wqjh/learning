
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCDemo3 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");// �������ݿ�������
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			// ͨ���������ݿ��URL����ȡ���ݿ����Ӷ���
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=Asia/Shanghai&zeroDateTimeBehavior=CONVERT_TO_NULL&allowPublicKeyRetrieval=true",
					"root", "123456");
			PreparedStatement ps = con.prepareStatement("select * from tb_stu where id = ?");
			ps.setInt(1, 3); // ���ò���
			ResultSet rs = ps.executeQuery(); // ִ��Ԥ�������
			// �����ǰ��¼���ǽ�����е����һ�У������ѭ����
			while (rs.next()) {
				String id = rs.getString(1); // ��ȡ������е�һ�е�ֵ
				String name = rs.getString("name"); // ��ȡname�е���ֵ
				String sex = rs.getString("sex"); // ��ȡsex�е���ֵ
				String birthday = rs.getString("birthday"); // ��ȡbirthday�е���ֵ
				System.out.print("��ţ�" + id); // �����Ϣ
				System.out.print(" ������" + name);
				System.out.print(" �Ա�:" + sex);
				System.out.println(" ���գ�" + birthday);
			}
			con.close();							// �ر����ݿ�����
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
