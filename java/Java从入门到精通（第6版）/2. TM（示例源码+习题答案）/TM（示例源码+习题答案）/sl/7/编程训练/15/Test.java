
public class Test {
	public static void main(String[] args) {
		AutoPlant autoPlant = new AutoPlant("����");
		autoPlant.setName("������");
		System.out.println(autoPlant.getName() + "��������" + autoPlant.productsName);
		ShoeFactory shoeFactory = new ShoeFactory("Ь");
		shoeFactory.setName("Ь��");
		System.out.println(shoeFactory.getName() + "��������" + shoeFactory.productsName);
	}
}
