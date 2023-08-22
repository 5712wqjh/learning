
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TypeWriter extends JFrame { // ���������֡���̳�JFrame

	private JPanel contentPane; // �������
	private JTextArea textArea; // �ı���
	private JButton btnStart; // ����ʼ���֡���ť
	private ReadData readData; // 

	public static void main(String[] args) {
		TypeWriter frame = new TypeWriter(); // ���������֡��������
		frame.setVisible(true); // ʹ�����֡�����������
	}

	/**
	 * ��������
	 */
	public TypeWriter() { // �����֡�����Ĺ��췽��
		init(); // ��ʼ������
		addAction(); // ��Ӵ����еļ����¼�
	}
	
	private void init(){ // ��ʼ������ķ���
		setResizable(false); // ���ɸı䴰��Ĵ�С
		setTitle("ģ��Ӣ�Ĵ���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �رմ���ķ�ʽ
		setBounds(100, 100, 450, 300); // �����λ�á���С
		// ������壨�߽粼�֣�
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		// ��ť��壨�����֣�
		JPanel buttonPane = new JPanel();
		buttonPane.setBackground(Color.WHITE);
		contentPane.add(buttonPane, BorderLayout.SOUTH);
		// ����ʼ���֡���ť
		btnStart = new JButton("��ʼ����");
	
		btnStart.setFont(new Font("΢���ź�", Font.PLAIN, 16));
		buttonPane.add(btnStart);
		// �������
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		// �ı���
		textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);
		
		readData = new ReadData(textArea); // �����̵߳����ࣨ����ȡ�̡߳�������
		
	}
	
	private void addAction(){ // ��������
		btnStart.addActionListener(new ActionListener() { // ��Ӱ�ť�Ķ��������¼�
			public void actionPerformed(ActionEvent e) {
				String buttonName=btnStart.getText();
				if (buttonName.equals("��ʼ����")) { // �����߳�
					readData.start();
					btnStart.setText("�����ˣ�Ъ���...");
				} else if (buttonName.equals("�����ˣ�Ъ���...")) { // �����߳�
					readData.pause();
					btnStart.setText("������δ�ɹ���ͬ־����Ŭ��...");
				} else if (buttonName.equals("������δ�ɹ���ͬ־����Ŭ��...")) { // ���������߳�
					readData.reStart();
					btnStart.setText("�����ˣ�Ъ���...");
				}
			}
		});
	}
}

class ReadData extends Thread { // ����ȡ���ݡ��̳��߳���

	private JTextArea textArea; // �ı���
	static boolean flag = false; // �����̵߳ı�־

	public ReadData(JTextArea textArea) { // ���ı���Ϊ�����Ĺ��췽�������ù��췽����ʼ������
		this.textArea = textArea;
	}

	synchronized void pause() { // �����߳�
		flag = true;
	}

	synchronized void reStart() { // ���������̣߳��������ڵȴ����̣߳�
		notifyAll();
		flag = false;
	}

	@Override
	public void run() { // �߳�Ҫִ�е�����
		FileInputStream fis = null; // �ֽ�������
		try {
			fis = new FileInputStream("��ѩ����.txt"); // �����ֽ�����������
			byte[] b = new byte[1]; // ����������1���ֽڵĻ�����
			StringBuilder sb = new StringBuilder(); // �ַ����洢��
				while (fis.read(b) != -1) { // ѭ����ȡ"��ѩ����.txt"�е��ı�����
					String str = new String(b); // ���ֽ�����ת��Ϊ�ַ���
					sb.append(str); // ���ַ����洢������ַ���
					synchronized (this) { // ������
						while (flag) {
							try {
								wait();
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}
					textArea.setText(sb.toString()); // ���ַ����洢���е��ַ�����ʾ���ı�����
					try {
						Thread.sleep(200); // ��ʾ���ַ���֮���ʱ����Ϊ0.2��
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close(); // �ر��ֽ�������
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}