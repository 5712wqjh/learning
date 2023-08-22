import java.util.HashSet;
interface ParadigmInterface<T> {                           // ���Խӿ�
    int method(T[] t);                                      // ���󷽷�
}

public class ParadigmDemo {// ������
    // ��̬������ʹ�÷��Ͳ������ڷ�����֮ǰ���巺�͡��˷������ڲ��������е��ظ�Ԫ�ظ���
    static public <T> int repeatCoount(T[] t) {
        int arrayLength = t.length;                     	// ��¼���鳤��
        java.util.HashSet<T> set = new HashSet<>(); 		// ������ϣ����
        for (T tmp : t) {                        			// ��������
            set.add(tmp);  							// ������Ԫ�ط��뼯����
        }
        return arrayLength - set.size();                    // �������鳤���뼯�ϳ��ȵĲ�
    }

    public static void main(String[] args) {
        Integer a[] = {1, 1, 2, 3, 1, 5, 6, 1, 8, 8};   			// ��������
        
        String s[] = {"��", "��", "��", "��", "��", "��", "��"};		// �ַ�������
        // �����ӿڶ���Integer��Ϊ���ͣ�����ParadigmDemo��ľ�̬����,������Ҫ���巺��
        ParadigmInterface<Integer> p1 = ParadigmDemo::<Integer> repeatCoount;
        // ���ýӿڷ���
        System.out.println("���������ظ�Ԫ�ظ�����" + p1.method(a));
        // �����ӿڶ���String��Ϊ���ͣ�����ParadigmDemo��ľ�̬����
 		// �������������巺�ͣ���Ĭ��ʹ�ýӿ��Ѷ���õĵķ���
        ParadigmInterface<String> p2 = ParadigmDemo::repeatCoount;
        // ���ýӿڶ��󷽷�
        System.out.println("�ַ��������ظ�Ԫ�ظ�����" + p2.method(s));
    }
}
