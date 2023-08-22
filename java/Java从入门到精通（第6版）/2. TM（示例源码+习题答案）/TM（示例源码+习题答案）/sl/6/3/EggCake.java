
public class EggCake {
	int eggCount; // 鸡蛋灌饼里蛋的个数

	public EggCake(int eggCount) { // 参数为鸡蛋灌饼里蛋的个数的构造方法
		this.eggCount = eggCount; // 将参数eggCount的值付给属性eggCount
	}

	public EggCake() { // 无参数构造方法，默认给饼加一个蛋
		// 调用参数为鸡蛋灌饼里蛋的个数的构造方法，并设置鸡蛋灌饼里蛋的个数为1
		this(1);
	}

	public static void main(String[] args) {
		EggCake cake1 = new EggCake();
		System.out.println("顾客不要求加蛋的数量，饼里会有" + cake1.eggCount + "个蛋。");
		EggCake cake2 = new EggCake(2);
		System.out.println("顾客要求加2个蛋，饼里会有" + cake2.eggCount + "个蛋。");
	}
	
}



