public class Car {							 // ����������
	private String brand; 					 // ����Ʒ��
	public Car(String brand) {				 // ������Ĺ��췽��������Ϊ����Ʒ��
		this.brand = brand; 					 // ������Ʒ�Ƹ�ֵ
	}
	class Engine {							 // �������ࣨ�ڲ��ࣩ
		String model; 						 // �������ͺ�
		public Engine(String model) {			 // ��������Ĺ��췽��������Ϊ�������ͺ�
			this.model = model; 				 // ���������ͺŸ�ֵ
		}
		public void ignite() {				 // ������������𷽷�
			System.out.println("������" + this.model + "���");
		}
	}
	public void start() {						 // ����������������
		System.out.println("����" + this.brand);
	}
	public static void main(String[] args) {
		Car car = new Car("��������");			 // ������������󣬲�Ϊ����Ʒ�Ƹ�ֵ
		car.start();							 // ����������������������������
		// �����������ࣨ�ڲ��ࣩ���󣬲�Ϊ�������ͺŸ�ֵ
		Car.Engine engine = car.new Engine("EA211");
		engine.ignite();						 // �������������ã�����������𷽷�
	}
}
