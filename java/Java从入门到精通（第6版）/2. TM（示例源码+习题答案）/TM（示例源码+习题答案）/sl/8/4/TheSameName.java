public class TheSameName {
	private int x = 7; // �ⲿ���x

	private class Inner {
		private int x = 9;// �ڲ����x

		public void doit() {
			int x = 11; // �ֲ�����x
			this.x++; // �����ڲ����x
			TheSameName.this.x++; // �����ⲿ���x
		}
	}
}
