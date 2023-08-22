
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo2 {

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
			Statement stmt = con.createStatement();
			ResultSet res = stmt.executeQuery("select * from tb_stu where name like '��%'");
			while (res.next()) { // �����ǰ��䲻�����һ���������ѭ��
				String id = res.getString("id"); // ��ȡ������id���ֶ�ֵ
				String name = res.getString("name"); // ��ȡ������name���ֶ�ֵ
				String sex = res.getString("sex"); // ��ȡ������sex���ֶ�ֵ
				String birthday = res.getString("birthday"); // ��ȡ������birthday���ֶ�ֵ
				System.out.print("��ţ�" + id); // ����ֵ���
				System.out.print(" ����:" + name);
				System.out.print(" �Ա�:" + sex);
				System.out.println(" ���գ�" + birthday);
			}
			con.close();							// �ر����ݿ�����
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
