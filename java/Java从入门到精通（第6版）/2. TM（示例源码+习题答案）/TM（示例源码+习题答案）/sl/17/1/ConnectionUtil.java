
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

	public static void main(String[] args) {

		Connection con = null; // �������ݿ����Ӷ���
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");// �������ݿ�������
			// ͨ���������ݿ��URL����ȡ���ݿ����Ӷ���
			con = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=Asia/Shanghai&zeroDateTimeBehavior=CONVERT_TO_NULL&allowPublicKeyRetrieval=true",
					"root", "123456");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		if (con != null) {// ������ݿⲻΪ��
			System.out.println("���ݿ����ӳɹ���");
			System.out.println(con);
		}
	}
}
