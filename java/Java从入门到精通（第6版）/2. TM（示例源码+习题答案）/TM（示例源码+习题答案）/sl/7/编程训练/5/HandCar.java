
public class HandCar extends Car //����һ��HandCar��̳�Car
{
	@Override
	public void stepOnGas() //��д����Car��stepOnGas()�����������ţ�
	{
		System.out.println("�ҽŲ�����̤�壡"); //����̨���
	}
	@Override
	public void stepOnBrake() //��д����Car��stepOnBrake()��������ɲ����
	{
		System.out.println("�ҽŲ�ɲ��̤�壡"); //����̨���
	}
	
	public void stepOnClutch() //����һ����ͨ��stepOnClutch()����������ϣ�
	{
		System.out.println("��Ų������̤�壡"); //����̨���
	}
}
