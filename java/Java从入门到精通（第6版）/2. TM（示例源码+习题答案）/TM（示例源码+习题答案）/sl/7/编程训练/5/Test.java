
/**
 * �γ����������ͣ��ֶ������Զ��������ڽγ����ԣ�����������̤���ɲ��̤�塣������ֶ���������������ȸ���γ���һ�����̤�塣
 * ����˵����Ϊ������ֶ���������ʱ�ܷ��ȡ���Լ������̤�壿
 */
public class Test //����һ��Test��
{
	public static void main(String[] args) 
	{
		AutoCar autoCar = new AutoCar(); //��������autoCar
		System.out.println("�Զ���������" + autoCar.pedalAuto + "��̤�塣"); //����̨���
		autoCar.stepOnGas(); //��������(AutoCar)����д��stepOnGas()����
		autoCar.stepOnBrake(); //��������(AutoCar)����д��stepOnBrake()����
	}
}
