public class BMIexponent {
	public static void main(String[] args) {
		double height = 1.72;					// 身高变量，单位：米
		int weight = 70; 						// 体重变量,单位:千克
		double exponent = weight / (height * height); 	// BMI计算公式
		System.out.println("您的身高为：" + height);
		System.out.println("您的体重为：" + weight);
		System.out.println("您的BMI指数为：" + exponent);
		System.out.print("您的体重属于：");
		if (exponent < 18.5) { 					// 判断BMI指数是否小于18.5
			System.out.println("体重过轻");
		}
		if (exponent >= 18.5 && exponent < 24.9) {	// 判断BMI指数是否在18.5到24.9之间
			System.out.println("正常范围");
		}
		if (exponent >= 24.9 && exponent < 29.9) {	// 判断BMI指数是否在24.9到29.9之间
			System.out.println("体重过重");
		}
		if (exponent >= 29.9) {					// 判断BMI指数是否大于29.9之间
			System.out.println("肥胖");
		}
	}
}
