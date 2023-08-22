interface CheckGrade {
	String check(int grade); // 查询成绩结果
}

public class GradeDemo {
	public static void main(String[] args) {
		CheckGrade g = (n) -> { // lambda实现代码块
			if (n >= 90 && n <= 100) { // 如果成绩在90-100
				return "成绩为优"; // 输出成绩为优
			} else if (n >= 80 && n < 90) { // 如果成绩在80-89
				return "成绩为良"; // 输出成绩为良
			} else if (n >= 60 && n < 80) { // 如果成绩在60-79
				return "成绩为中"; // 输出成绩为中
			} else if (n >= 0 && n < 60) { // 如果成绩小于60
				return "成绩为差"; // 输出成绩为差
			} else { // 其他数字不是有效成绩
				return "成绩无效"; // 输出成绩无效
			}
		}; // 不要丢掉lambda语句后的分号
		System.out.println(g.check(89)); // 输出查询结果
	}
}
