
/**
 * 轿车有两种类型：手动挡和自动挡。对于轿车而言，至少有油门踏板和刹车踏板。如果是手动挡的汽车，它会比父类轿车多一个离合踏板。
 * 请编程说明作为子类的手动挡汽车此时能否调取它自己的离合踏板？
 */
public class Test //创建一个Test类
{
	public static void main(String[] args) 
	{
		AutoCar autoCar = new AutoCar(); //创建对象autoCar
		System.out.println("自动挡汽车有" + autoCar.pedalAuto + "块踏板。"); //控制台输出
		autoCar.stepOnGas(); //调用子类(AutoCar)中重写的stepOnGas()方法
		autoCar.stepOnBrake(); //调用子类(AutoCar)中重写的stepOnBrake()方法
	}
}
