
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo4 {
	Connection con;// 声明数据库连接对象

	public void initConnection() {// 初始化数据库连接
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");// 加载数据库驱动类
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			// 通过访问数据库的URL，获取数据库连接对象
			con = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=Asia/Shanghai&zeroDateTimeBehavior=CONVERT_TO_NULL&allowPublicKeyRetrieval=true",
					"root", "123456");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void closeConnection() {// 关闭数据库连接
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void showAllData() {// 显示所有学生数据
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from tb_stu");
			while (rs.next()) { // 如果当前语句不是最后一条，则进入循环
				System.out.print("编号：" + rs.getString("id")); // 将列值输出
				System.out.print(" 姓名:" + rs.getString("name"));
				System.out.print(" 性别:" + rs.getString("sex"));
				System.out.println(" 生日：" + rs.getString("birthday"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void add(int id, String name, String sex, String birthday) {// 添加新学生
		try {
			String sql = "insert into tb_stu values(?,?,?,?) ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id); // 设置编号
			ps.setString(2, name); // 设置名字
			ps.setString(3, sex); // 设置性别
			ps.setString(4, birthday); // 设置出生日期
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void delete(int id) {// 删除指定ID的学生
		try {
			Statement stmt = con.createStatement();
			stmt.executeUpdate("delete from tb_stu where id =" + id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void update(int id, String newName) {// 修改指定ID的学会姓名
		try {
			String sql = "update tb_stu set name = ? where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, newName); // 设置名字
			ps.setInt(2, id); // 设置编号
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		JDBCDemo4 demo = new JDBCDemo4();
		demo.initConnection();
		demo.showAllData();
		System.out.println("---添加新同学---");
		demo.add(5, "王富贵","男","1990-12-30");
		demo.showAllData();
		System.out.println("---修改编号为2的学生姓名---");
		demo.update(2, "李美丽");
		demo.showAllData();
		System.out.println("---删除编号为3的学生---");
		demo.delete(3);
		demo.showAllData();
		demo.closeConnection();
	}
}
