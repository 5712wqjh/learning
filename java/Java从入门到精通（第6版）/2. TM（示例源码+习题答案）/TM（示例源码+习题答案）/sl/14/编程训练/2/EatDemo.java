interface Eatable {
	void eat();
}

public class EatDemo {

	public static void main(String[] args) {
		Eatable dog = ()->{
			System.out.println("С�����Թ�ͷ");
		};
		
		Eatable cat = ()->{
			System.out.println("Сè������");
		};
		
		Eatable chick = ()->{
			System.out.println("С������ëë��");
		};
		
		dog.eat();
		cat.eat();
		chick.eat();
	}

}
