interface Eatable {
	void eat();
}

public class EatDemo {

	public static void main(String[] args) {
		Eatable dog = ()->{
			System.out.println("Ð¡¹·°®³Ô¹ÇÍ·");
		};
		
		Eatable cat = ()->{
			System.out.println("Ð¡Ã¨°®³ÔÓã");
		};
		
		Eatable chick = ()->{
			System.out.println("Ð¡¼¦°®³ÔÃ«Ã«³æ");
		};
		
		dog.eat();
		cat.eat();
		chick.eat();
	}

}
