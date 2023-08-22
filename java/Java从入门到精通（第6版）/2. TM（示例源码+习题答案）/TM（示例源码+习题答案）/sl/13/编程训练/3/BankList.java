
import java.text.DecimalFormat;
import java.util.Date;

public class BankList<T> {
	T bankName; //��������
	T time; //���ʱ��
	T username; //����
	T cardNum; //����
	T currency; //����
	T inAccount; //�����
	T leftAccount; //�˻����
	public static void main(String[] args) {
		BankList<Object> list = new BankList<Object>(); //����һ��String���͵�BankList����
		list.bankName = "�й���������"; //��ʼ�����������ơ�
        list.time = new Date(); //��ʼ�������ʱ�䡱
        list.username = "����"; //��ʼ����������
        list.cardNum = "6666 7777 8888 9996 789"; //��ʼ�������š�
        list.currency = "RMB"; //��ʼ�������֡�
        list.inAccount = 8888.00; //��ʼ��������
        list.leftAccount = 18888.89; //��ʼ�����˻���
        DecimalFormat df = new DecimalFormat("###,###.##"); //����DecimalFormat����������ʽ��Double���͵Ķ���
        System.out.println(
        				     "�������ƣ�" + list.bankName
        				   + "\n���ʱ�䣺" + list.time
        				   + "\n����������" + list.username
        				   + "\n�������ţ�" + list.cardNum
        				   + "\n�ҡ����֣�" + list.currency
        				   + "\n����" + df.format(list.inAccount)
        				   + "\n�˻���" + df.format(list.leftAccount)
        				   ); //���������Ϣ
	}
}
