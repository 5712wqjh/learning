
public class Acceleration {
	public static void main(String[] args) {
		int startSpeed = 0;
		double endSpeed = 100.0*1000/3600;
		double time = 8.7;
		double acceleration = (endSpeed - startSpeed)/time;
		System.out.println("һ���γ�����8.7���0km/h���ٵ�100km/h�������γ���ƽ�ּ��ٶ� = " + acceleration);
	}
}
