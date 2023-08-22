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
		JProgressBar progressBar = new JProgressBar(); // ����������
		getContentPane().add(progressBar, BorderLayout.NORTH); // �������������ڴ������λ��
		JButton button = new JButton("ֹͣ");
		getContentPane().add(button, BorderLayout.SOUTH);
		progressBar.setStringPainted(true); // ���ý���������ʾ����
		Thread t = new Thread(new Runnable() {
			int count = 0;

			public void run() {
				while (true) {
					progressBar.setValue(++count); // ���ý������ĵ�ǰֵ
					try {
						Thread.sleep(100); // ʹ�߳�����100����
					} catch (InterruptedException e) { // ��׽InterruptedException�쳣
						System.out.println("��ǰ�߳����ж�");
						break;
					}
				}
			}
		});

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				t.interrupt(); // �ж��߳�
			}
		});
		t.start(); // �����߳�
	}

	public static void init(JFrame frame, int width, int height) {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(width, height);
		frame.setVisible(true);
	}
}
