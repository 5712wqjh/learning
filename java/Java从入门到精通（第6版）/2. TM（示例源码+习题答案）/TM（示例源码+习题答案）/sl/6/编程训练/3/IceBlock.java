
public class IceBlock {
	
	public IceBlock() {
		System.out.println("�̼�Ĭ�Ͽ�����û�б��顭��");
	}
	
	public IceBlock(String name, int number) {
		System.out.println(name + "Ҫ������������" + number + "�����顣");
	}
	
	public static void main(String[] args) {
		IceBlock block = new IceBlock();
		IceBlock iceBlock = new IceBlock("����", 3);
	}
}
