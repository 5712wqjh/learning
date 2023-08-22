
interface Colorful {
	void shine();
}

class RedLights implements Colorful {
	@Override
	public void shine() {
		System.out.println("∫Ïµ∆¡¡∫Ïπ‚");
	}
}

class YellowLights implements Colorful {
	@Override
	public void shine() {
		System.out.println("ª∆µ∆¡¡ª∆π‚");
	}
}

class GreenLights implements Colorful {
	@Override
	public void shine() {
		System.out.println("¬Ãµ∆¡¡¬Ãπ‚");
	}
}
