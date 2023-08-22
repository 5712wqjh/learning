
import java.awt.BorderLayout;
import javax.swing.*;

public class JoinTest extends JFrame {
	private Thread threadA; // 定义两个线程
	private Thread threadB;
	private JProgressBar progressBar = new JProgressBar(); // 定义两个进度条组件
	private JProgressBar progressBar2 = new JProgressBar();

	public static void main(String[] args) {
		JoinTest test = new JoinTest();
		test.setVisible(true);
	}

	public JoinTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 200, 100);
		getContentPane().add(progressBar, BorderLayout.NORTH); // 将进度条设置在窗体最北面
		getContentPane().add(progressBar2, BorderLayout.SOUTH); // 将进度条设置在窗体最南面
		progressBar.setStringPainted(true); // 设置进度条显示数字字符
		progressBar2.setStringPainted(true);
		// 使用匿名内部类形式初始化Thread实例
		threadA = new Thread(new Runnable() {
			int count = 0;

			public void run() { // 重写run()方法
				while (true) {
					progressBar.setValue(++count); // 设置进度条的当前值
					try {
						Thread.sleep(100); // 使线程A休眠100毫秒
						threadB.join(); // 使线程B调用join()方法
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		threadA.start(); // 启动线程A
		threadB = new Thread(new Runnable() {
			int count = 0;

			public void run() {
				while (true) {
					progressBar2.setValue(++count); // 设置进度条的当前值
					try {
						Thread.sleep(100); // 使线程B休眠100毫秒
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					if (count == 100) // 当count变量增长为100时
						break; // 跳出循环
				}
			}
		});
		threadB.start(); // 启动线程B
	}
}
