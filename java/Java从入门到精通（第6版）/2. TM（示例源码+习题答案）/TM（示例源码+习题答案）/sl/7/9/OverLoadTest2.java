
public class OverLoadTest2 {
    public static int add(int a, int b) { // ����һ������
        return a + b;
    }

    public static double add(double a, double b) { // ���һ��������ͬ���ơ��������Ͳ�ͬ
        return a + b;
    }

    public static int add(int a) { // ���һ����������������ͬ
        return a;
    }

    public static int add(int a, double b) { // ��int��������double����
        return a; // ���int����ֵ
    }

    public static int add(double a, int b) { // ��double��������int����
        return b;// ���int����ֵ
    }

    public static int add(int... a) { // ���岻������������
        int s = 0;
        for (int i = 0; i < a.length; i++) {// ���ݲ���������ѭ������
            s += a[i]; // ��ÿ�������ۼ�
        }
        return s; // ������������
    }

    public static void main(String args[]) {
        System.out.println("����add(int,int)������" + add(1, 2));
        System.out.println("����add(double,double)������" + add(2.1, 3.3));
        System.out.println("����add(int)������" + add(1));
        System.out.println("����add(int,double)������" + add(5, 8.0));
        System.out.println("����add(double,int)������" + add(5.0, 8));

        // ���ò�������������
        System.out.println("���ò���������������" + add(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println("���ò���������������" + add(1));
    }
}
