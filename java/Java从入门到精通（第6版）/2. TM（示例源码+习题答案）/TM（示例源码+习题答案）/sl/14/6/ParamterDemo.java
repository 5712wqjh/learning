interface AdditionInterface {                           // �ӷ��ӿ�
    int add(int a, int b);                              // �ӷ��ĳ��󷽷�
}

public class ParamterDemo {                             // ������
    public static void main(String[] args) {
        // lambda���ʽʵ�ּӷ��ӿڣ����ز�����ӵ�ֵ
        AdditionInterface np = (x, y) -> x + y;
        int result = np.add(15, 26);                   // ���ýӿڷ���
        System.out.println("��ӽ��:" + result);     // �������ӽ��
    }
}
