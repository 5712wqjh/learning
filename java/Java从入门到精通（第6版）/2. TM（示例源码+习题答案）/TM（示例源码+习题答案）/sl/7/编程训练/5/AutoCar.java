
public class AutoCar extends Car //����һ��AutoCar��̳�Car
{
	@Override
	public void stepOnGas() //��д����Car��stepOnGas()����
	{
		System.out.println("�ҽŲ�����̤�壡"); //����̨���
	}
	@Override
	public void stepOnBrake() //��д����Car��stepOnBrake()����
	{
		System.out.println("�ҽŲ�ɲ��̤�壡"); //����̨���
	}
}
