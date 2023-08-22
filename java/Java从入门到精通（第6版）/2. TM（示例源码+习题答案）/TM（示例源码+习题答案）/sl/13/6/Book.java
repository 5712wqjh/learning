public class Book<T> {								// 定义带泛型的Book<T>类
	private T bookInfo;								// 类型形参：书籍信息
	public Book(T bookInfo) {							// 参数为类型形参的构造方法
		this.bookInfo = bookInfo;						// 为书籍信息赋值
	}
	public T getBookInfo() {							// 获取书籍信息的值
		return bookInfo;
	}
	public static void main(String[] args) {
		// 创建参数为String类型的书名对象
		Book<String> bookName = new Book<String>("《Java从入门到精通》");
		// 创建参数为String类型的作者对象
		Book<String> bookAuthor = new Book<String>("明日科技");
		// 创建参数为Double类型的价格对象
		Book<Double> bookPrice = new Book<Double>(69.8);
		// 创建参数为Boolean类型的附赠源码
		Book<Boolean> hasSource = new Book<Boolean>(true);
		// 控制台输出书名、作者、价格和是否附赠光盘
		System.out.println("书名：" + bookName.getBookInfo());
		System.out.println("作者：" + bookAuthor.getBookInfo());
		System.out.println("价格：" + bookPrice.getBookInfo());
		System.out.println("是否附赠源码？" + hasSource.getBookInfo());
	}
}
