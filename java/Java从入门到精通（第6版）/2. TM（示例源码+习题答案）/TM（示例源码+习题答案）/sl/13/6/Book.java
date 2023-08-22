public class Book<T> {								// ��������͵�Book<T>��
	private T bookInfo;								// �����βΣ��鼮��Ϣ
	public Book(T bookInfo) {							// ����Ϊ�����βεĹ��췽��
		this.bookInfo = bookInfo;						// Ϊ�鼮��Ϣ��ֵ
	}
	public T getBookInfo() {							// ��ȡ�鼮��Ϣ��ֵ
		return bookInfo;
	}
	public static void main(String[] args) {
		// ��������ΪString���͵���������
		Book<String> bookName = new Book<String>("��Java�����ŵ���ͨ��");
		// ��������ΪString���͵����߶���
		Book<String> bookAuthor = new Book<String>("���տƼ�");
		// ��������ΪDouble���͵ļ۸����
		Book<Double> bookPrice = new Book<Double>(69.8);
		// ��������ΪBoolean���͵ĸ���Դ��
		Book<Boolean> hasSource = new Book<Boolean>(true);
		// ����̨������������ߡ��۸���Ƿ�������
		System.out.println("������" + bookName.getBookInfo());
		System.out.println("���ߣ�" + bookAuthor.getBookInfo());
		System.out.println("�۸�" + bookPrice.getBookInfo());
		System.out.println("�Ƿ���Դ�룿" + hasSource.getBookInfo());
	}
}
