interface ArraysConsInterface<T> {                   // ���췽���ӿ�
    // ���󷽷����ض������飬�������������������
    T action(int n);
}
public class ArraysConsDemo {
    public static void main(String[] args) {
        // ��������Ĺ��췽��
        ArraysConsInterface<ArraysConsDemo[]> a = ArraysConsDemo[]::new;
        ArraysConsDemo array[] = a.action(3);      // �ӿڴ������飬��ָ���������
        array[0] = new ArraysConsDemo();           // ������Ԫ��ʵ����
        array[1] = new ArraysConsDemo();
        array[2] = new ArraysConsDemo();
        // ������û��array[3]��ֵ����������׳������±�Խ���쳣
        // array[3] = new ArraysConsDemo();
    }
}
