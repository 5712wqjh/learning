
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MoveCar extends JFrame { // 创建一个“挪车”类，并继承JFrame
	// 声明窗体中的组件
	private JPanel contentPane;
	private JLabel lblCarImage;

	/**
	 * 主方法
	 */
	public static void main(String[] args) {
		MoveCar frame = new MoveCar(); // 创建MoveCar对象
		frame.setVisible(true); // 使frame可视
	}

	/**
	 * 创建JFrame窗体
	 */
	public MoveCar() { // MoveCar的构造方法
		setResizable(false); // 设置窗体不可改变大小
		setTitle("让汽车动起来"); // 设置窗体题目
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置窗体关闭的方式
		setBounds(100, 100, 590, 300); // 设置窗体大小
		/**
		 * 创建JPanel面板contentPane置于JFrame窗体中，并设置面板的背景色、边距和布局
		 */
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		/**
		 * 创建按钮btnFront置于面板contentPane中，设置按钮的大小、按钮中的字体内容和样式
		 */
		JButton btnFront = new JButton("前　进");
		btnFront.addActionListener(new ActionListener() { // 添加动作监听的事件
			@Override
			public void actionPerformed(ActionEvent e) { // 发生操作时
				lblCarImage.setHorizontalAlignment(SwingConstants.TRAILING); // 是标签中的图标移动到尾部
			}
		});
		btnFront.setFont(new Font("幼圆", Font.PLAIN, 14));
		btnFront.setBounds(10, 229, 108, 23);
		contentPane.add(btnFront);
		/**
		 * 创建按钮btnBack置于面板contentPane中，设置按钮的大小、按钮中的字体内容和样式
		 */
		JButton btnBack = new JButton("后　退");
		btnBack.addActionListener(new ActionListener() { // 添加动作监听的事件
			@Override
			public void actionPerformed(ActionEvent e) { // 发生操作时
				lblCarImage.setHorizontalAlignment(SwingConstants.LEADING); // 是标签中的图标移动到首部
			}
		});
		btnBack.setFont(new Font("幼圆", Font.PLAIN, 14));
		btnBack.setBounds(165, 229, 108, 23);
		contentPane.add(btnBack);
		/**
		 * 创建标签lblCarImage置于面板contentPane中，设置标签大小、图标以及图标的位置
		 */
		lblCarImage = new JLabel("");
		lblCarImage.setHorizontalAlignment(SwingConstants.LEFT);
		lblCarImage.setIcon(new ImageIcon(MoveCar.class.getResource("car.png")));
		lblCarImage.setBounds(10, 10, 564, 209);
		contentPane.add(lblCarImage);
		/**
		 * 创建按钮btnUp置于面板contentPane中，设置按钮的大小、按钮中的字体内容和样式
		 */
		JButton btnUp = new JButton("上　移");
		btnUp.addActionListener(new ActionListener() { // 添加动作监听的事件
			@Override
			public void actionPerformed(ActionEvent e) { // 发生操作时
				lblCarImage.setVerticalAlignment(SwingConstants.TOP); // 是标签中的图标移动到上部
			}
		});
		btnUp.setFont(new Font("幼圆", Font.PLAIN, 14));
		btnUp.setBounds(318, 229, 108, 23);
		contentPane.add(btnUp);
		/**
		 * 创建按钮btnDown置于面板contentPane中，设置按钮的大小、按钮中的字体内容和样式
		 */
		JButton btnDown = new JButton("下　移");
		btnDown.addActionListener(new ActionListener() { // 添加动作监听的事件
			@Override
			public void actionPerformed(ActionEvent e) { // 发生操作时
				lblCarImage.setVerticalAlignment(SwingConstants.BOTTOM); // 是标签中的图标移动到底部
			}
		});
		btnDown.setFont(new Font("幼圆", Font.PLAIN, 14));
		btnDown.setBounds(466, 229, 108, 23);
		contentPane.add(btnDown);
	}
}
