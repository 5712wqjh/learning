
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

	public static void main(String[] args) {

		Connection con = null; // 声明数据库连接对象
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");// 加载数据库驱动类
			// 通过访问数据库的URL，获取数据库连接对象
			con = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=Asia/Shanghai&zeroDateTimeBehavior=CONVERT_TO_NULL&allowPublicKeyRetrieval=true",
					"root", "123456");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		if (con != null) {// 如果数据库不为空
			System.out.println("数据库连接成功！");
			System.out.println(con);
		}
	}
}
