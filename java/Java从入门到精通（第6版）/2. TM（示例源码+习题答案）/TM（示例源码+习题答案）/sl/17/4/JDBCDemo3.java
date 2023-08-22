
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCDemo3 {
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
			PreparedStatement ps = con.prepareStatement("select * from tb_stu where id = ?");
			ps.setInt(1, 3); // 设置参数
			ResultSet rs = ps.executeQuery(); // 执行预处理语句
			// 如果当前记录不是结果集中的最后一行，则进入循环体
			while (rs.next()) {
				String id = rs.getString(1); // 获取结果集中第一列的值
				String name = rs.getString("name"); // 获取name列的列值
				String sex = rs.getString("sex"); // 获取sex列的列值
				String birthday = rs.getString("birthday"); // 获取birthday列的列值
				System.out.print("编号：" + id); // 输出信息
				System.out.print(" 姓名：" + name);
				System.out.print(" 性别:" + sex);
				System.out.println(" 生日：" + birthday);
			}
			con.close();							// 关闭数据库连接
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
