public class Circulate { 
	public static void main(String args[]) { 
		int sum = 0; 					//����Ӻ�Ľ��
		for (int i = 1; i <= 100; i += 2) {
			sum = sum + i; 			//ָ��ѭ��������ѭ����
		}
		//����Ӻ�Ľ�����
		System.out.println("2��100֮�������ż��֮��Ϊ��" + sum); 
	}
}
