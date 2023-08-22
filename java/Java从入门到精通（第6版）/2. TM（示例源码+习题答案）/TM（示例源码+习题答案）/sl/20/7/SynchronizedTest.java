public class SynchronizedTest implements Runnable {
    int num = 10; // 设置当前总票数

    public void run() {
        while (true) { // 设置无限循环
            synchronized (this) { // 设置同步代码块
                if (num > 0) { // 判断当前票数是否大于0
                    try {
                        Thread.sleep(100); // 使当前线程休眠100毫秒
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    // 票数减1
                    System.out.println(Thread.currentThread().getName() + "——票数" + num--);
                }
            }
        }
    }

    public static void main(String[] args) {
        // 实例化类对象
        SynchronizedTest t = new SynchronizedTest();
        // 以该类对象分别实例化4个线程
        Thread tA = new Thread(t, "线程一");
        Thread tB = new Thread(t, "线程二");
        Thread tC = new Thread(t, "线程三");
        Thread tD = new Thread(t, "线程四");
        tA.start(); // 分别启动线程
        tB.start();
        tC.start();
        tD.start();
    }
}
