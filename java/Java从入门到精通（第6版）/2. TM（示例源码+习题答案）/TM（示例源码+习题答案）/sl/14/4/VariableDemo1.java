interface VariableInterface1 { 				// ���Խӿ�
    void method(); 						// ���Է���
}

public class VariableDemo1 { 			// ������
    public static void main(String[] args) {
        int value = 100;					// �����ֲ�����
        VariableInterface1 v = () -> {		// ʵ�ֲ��Խӿ�
            int num = value - 90;			// ʹ�þֲ�������ֵ
            value = 12; 					// ���ľֲ��������˴��ᱨ���޷�ͨ������
        };
    }
}
