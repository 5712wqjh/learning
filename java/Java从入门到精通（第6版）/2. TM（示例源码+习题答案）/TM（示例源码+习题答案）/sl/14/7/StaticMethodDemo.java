interface StaticMethodInterface { 							// ���Խӿ�
    int method(int a, int b);  								// ���󷽷�
}
public class StaticMethodDemo {
    static int add(int x, int y) {								// ��̬��������������������ӵĽ��
        return x + y;                         				//������ӽ��
    }

    public static void main(String[] args) {
        StaticMethodInterface sm = StaticMethodDemo::add; 		//����StaticMethodDemo��ľ�̬����
        int result = sm.method(15, 16);						//ֱ�ӵ��ýӿڷ�����ȡ���
        System.out.println("�ӿڷ��������" + result); 			//������
    }
}
