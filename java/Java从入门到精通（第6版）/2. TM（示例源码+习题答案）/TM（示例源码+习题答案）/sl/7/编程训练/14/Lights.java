
class TrafficLights {
	
}

class RedLight extends TrafficLights {
	
}

class YellowLight extends TrafficLights {
	
}

class GreenLight extends TrafficLights {
	
}

public class Lights {
	public static void main(String[] args) {
		TrafficLights red = new RedLight();
		lighten(red);
		TrafficLights yellow = new YellowLight();
		lighten(yellow);
		TrafficLights green = new GreenLight();
		lighten(green);
	}
	
	public static void lighten(TrafficLights light) {
		if(light instanceof RedLight) 
			System.out.println("∫Ïµ∆¡¡45√Î");
		if(light instanceof YellowLight) 
			System.out.println("ª∆µ∆¡¡5√Î");
		if(light instanceof GreenLight) 
			System.out.println("¬Ãµ∆¡¡30√Î");
	}
}
