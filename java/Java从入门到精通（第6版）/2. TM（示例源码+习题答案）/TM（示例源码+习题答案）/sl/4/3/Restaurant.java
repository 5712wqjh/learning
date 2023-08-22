public class Restaurant {
	public static void main(String args[]) {
		System.out.println("欢迎光临，请问有多少人用餐？"); // 输出问题提示
		int count = 9; // 用餐人数
		System.out.println("回答：" + count + "人");// 输出回答
		if (count <= 4) { // 如果人数小于4人
			System.out.println("客人请到大厅4人桌用餐"); // 请到4人桌
		} else if (count > 4 && count <= 8) { // 如果人数在4-8人之间
			System.out.println("客人请到大厅8人桌用餐"); // 请到4人桌
		} else if (count > 8 && count <= 16) { // 如果人数在8-16人之间
			System.out.println("客人请到楼上包厢用餐"); // 请到包厢
		} else { // 当以上条件都不成立时，执行的该语句块
			System.out.println("抱歉，我们店暂时没有这么大的包厢！"); // 输出信息
		}
	}
}
