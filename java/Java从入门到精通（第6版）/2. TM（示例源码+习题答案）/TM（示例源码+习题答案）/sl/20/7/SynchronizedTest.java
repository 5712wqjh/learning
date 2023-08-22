public class SynchronizedTest implements Runnable {
    int num = 10; // ���õ�ǰ��Ʊ��

    public void run() {
        while (true) { // ��������ѭ��
            synchronized (this) { // ����ͬ�������
                if (num > 0) { // �жϵ�ǰƱ���Ƿ����0
                    try {
                        Thread.sleep(100); // ʹ��ǰ�߳�����100����
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    // Ʊ����1
                    System.out.println(Thread.currentThread().getName() + "����Ʊ��" + num--);
                }
            }
        }
    }

    public static void main(String[] args) {
        // ʵ���������
        SynchronizedTest t = new SynchronizedTest();
        // �Ը������ֱ�ʵ����4���߳�
        Thread tA = new Thread(t, "�߳�һ");
        Thread tB = new Thread(t, "�̶߳�");
        Thread tC = new Thread(t, "�߳���");
        Thread tD = new Thread(t, "�߳���");
        tA.start(); // �ֱ������߳�
        tB.start();
        tC.start();
        tD.start();
    }
}
