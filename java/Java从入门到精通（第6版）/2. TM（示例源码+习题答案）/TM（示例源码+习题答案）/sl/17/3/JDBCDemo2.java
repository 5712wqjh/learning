
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo2 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");// 加载数据库驱动类
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			// 通过访问数据库的URL，获取数据库连接对象
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=Asia/Shanghai&zeroDateTimeBehavior=CONVERT_TO_NULL&allowPublicKeyRetrieval=true",
					"root", "123456");
			Statement stmt = con.createStatement();
			ResultSet res = stmt.executeQuery("select * from tb_stu where name like '张%'");
			while (res.next()) { // 如果当前语句不是最后一条，则进入循环
				String id = res.getString("id"); // 获取列名是id的字段值
				String name = res.getString("name"); // 获取列名是name的字段值
				String sex = res.getString("sex"); // 获取列名是sex的字段值
				String birthday = res.getString("birthday"); // 获取列名是birthday的字段值
				System.out.print("编号：" + id); // 将列值输出
				System.out.print(" 姓名:" + name);
				System.out.print(" 性别:" + sex);
				System.out.println(" 生日：" + birthday);
			}
			con.close();							// 关闭数据库连接
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
