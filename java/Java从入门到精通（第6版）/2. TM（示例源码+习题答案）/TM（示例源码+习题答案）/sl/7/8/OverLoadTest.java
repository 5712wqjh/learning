public class OverLoadTest {
    public static int add(int a, int b) { // ����һ������
        return a + b;
    }

    public static double add(double a, double b) { // �������һ��������ͬ���ơ��������Ͳ�ͬ�ķ���
        return a + b;
    }

    public static int add(int a) { // �������һ����������������ͬ�ķ���
        return a;
    }

    public static int add(int a, double b) { // ��int��������double����
        return a; // ���int����ֵ
    }

    public static int add(double a, int b) { // ��double��������int����
        return b;// ���int����ֵ
    }

    public static void main(String args[]) {
        System.out.println("����add(int,int)������" + add(1, 2));
        System.out.println("����add(double,double)������" + add(2.1, 3.3));
        System.out.println("����add(int)������" + add(1));
        System.out.println("����add(int,double)������" + add(5, 8.0));
        System.out.println("����add(double,int)������" + add(5.0, 8));

    }
}
