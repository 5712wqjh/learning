
interface Colorful {
	void shine();
}

class RedLights implements Colorful {
	@Override
	public void shine() {
		System.out.println("��������");
	}
}

class YellowLights implements Colorful {
	@Override
	public void shine() {
		System.out.println("�Ƶ����ƹ�");
	}
}

class GreenLights implements Colorful {
	@Override
	public void shine() {
		System.out.println("�̵����̹�");
	}
}
