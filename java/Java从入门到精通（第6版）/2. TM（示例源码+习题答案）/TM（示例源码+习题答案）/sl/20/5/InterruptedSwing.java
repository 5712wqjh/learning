import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class InterruptedSwing extends JFrame {

	public static void main(String[] args) {
		init(new InterruptedSwing(), 100, 100);
	}

	public InterruptedSwing() {
		JProgressBar progressBar = new JProgressBar(); // 创建进度条
		getContentPane().add(progressBar, BorderLayout.NORTH); // 将进度条放置在窗体合适位置
		JButton button = new JButton("停止");
		getContentPane().add(button, BorderLayout.SOUTH);
		progressBar.setStringPainted(true); // 设置进度条上显示数字
		Thread t = new Thread(new Runnable() {
			int count = 0;

			public void run() {
				while (true) {
					progressBar.setValue(++count); // 设置进度条的当前值
					try {
						Thread.sleep(100); // 使线程休眠100毫秒
					} catch (InterruptedException e) { // 捕捉InterruptedException异常
						System.out.println("当前线程序被中断");
						break;
					}
				}
			}
		});

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				t.interrupt(); // 中断线程
			}
		});
		t.start(); // 启动线程
	}

	public static void init(JFrame frame, int width, int height) {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(width, height);
		frame.setVisible(true);
	}
}
