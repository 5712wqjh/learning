interface VariableInterface2 {								// ���Խӿ�
    void method(); 										// ���Է���
}

public class VariableDemo2 {								// ������
    int value = 100;										// �������Ա����
    public void action() { 								// �������Ա����
        VariableInterface2 v = () -> {						// ʵ�ֲ��Խӿ�
            value = -12;									// ���ĳ�Ա������û��ʾ�κδ���
        };
      
        System.out.println("���нӿڷ���ǰvalue=" + value);		// ���нӿڷ���ǰ�������Ա����ֵ
        v.method();										// ���нӿڷ���
        System.out.println("���нӿڷ�����value=" + value); 	// ���нӿڷ������������Ա����ֵ
    }
    public static void main(String[] args) {
        VariableDemo2 demo = new VariableDemo2();			// �������������
        demo.action(); 									// ִ�в����෽��
    }
}
