public class TheSameName {
	private int x = 7; // 外部类的x

	private class Inner {
		private int x = 9;// 内部类的x

		public void doit() {
			int x = 11; // 局部变量x
			this.x++; // 调用内部类的x
			TheSameName.this.x++; // 调用外部类的x
		}
	}
}
