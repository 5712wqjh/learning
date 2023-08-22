class Dad {
	public final void turnOnTheTV() {
		System.out.println("爸爸打开了电视");
	}
}

class Baby extends Dad {
	public final void turnOnTheTV() {
		System.out.println("宝宝也要打开电视");
	}
}
