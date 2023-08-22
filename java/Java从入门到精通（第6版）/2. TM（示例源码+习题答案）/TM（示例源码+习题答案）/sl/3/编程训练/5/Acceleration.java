
public class Acceleration {
	public static void main(String[] args) {
		int startSpeed = 0;
		double endSpeed = 100.0*1000/3600;
		double time = 8.7;
		double acceleration = (endSpeed - startSpeed)/time;
		System.out.println("一辆轿车用了8.7秒从0km/h加速到100km/h，这辆轿车的平局加速度 = " + acceleration);
	}
}
