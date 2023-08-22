
import java.awt.BorderLayout;
import javax.swing.*;

public class JoinTest extends JFrame {
	private Thread threadA; // ���������߳�
	private Thread threadB;
	private JProgressBar progressBar = new JProgressBar(); // �����������������
	private JProgressBar progressBar2 = new JProgressBar();

	public static void main(String[] args) {
		JoinTest test = new JoinTest();
		test.setVisible(true);
	}

	public JoinTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 200, 100);
		getContentPane().add(progressBar, BorderLayout.NORTH); // �������������ڴ������
		getContentPane().add(progressBar2, BorderLayout.SOUTH); // �������������ڴ���������
		progressBar.setStringPainted(true); // ���ý�������ʾ�����ַ�
		progressBar2.setStringPainted(true);
		// ʹ�������ڲ�����ʽ��ʼ��Threadʵ��
		threadA = new Thread(new Runnable() {
			int count = 0;

			public void run() { // ��дrun()����
				while (true) {
					progressBar.setValue(++count); // ���ý������ĵ�ǰֵ
					try {
						Thread.sleep(100); // ʹ�߳�A����100����
						threadB.join(); // ʹ�߳�B����join()����
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		threadA.start(); // �����߳�A
		threadB = new Thread(new Runnable() {
			int count = 0;

			public void run() {
				while (true) {
					progressBar2.setValue(++count); // ���ý������ĵ�ǰֵ
					try {
						Thread.sleep(100); // ʹ�߳�B����100����
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					if (count == 100) // ��count��������Ϊ100ʱ
						break; // ����ѭ��
				}
			}
		});
		threadB.start(); // �����߳�B
	}
}
