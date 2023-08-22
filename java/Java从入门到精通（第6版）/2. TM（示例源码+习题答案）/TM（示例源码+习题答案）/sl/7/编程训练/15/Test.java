
public class Test {
	public static void main(String[] args) {
		AutoPlant autoPlant = new AutoPlant("汽车");
		autoPlant.setName("汽车厂");
		System.out.println(autoPlant.getName() + "生产的是" + autoPlant.productsName);
		ShoeFactory shoeFactory = new ShoeFactory("鞋");
		shoeFactory.setName("鞋厂");
		System.out.println(shoeFactory.getName() + "生产的是" + shoeFactory.productsName);
	}
}
