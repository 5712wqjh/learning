
public class CreditCard {
	double amount;
	public static int times = 0;
	
	public CreditCard(double amount) {
		times++;
		this.amount = amount;
	}
	
	public void output() {
		System.out.println("����һ�ʴ�����ѣ����׽�" + amount + "Ԫ��");
	}
	
	public static void main(String[] args) {
		CreditCard cr = new CreditCard(1550);
		cr.output();
		CreditCard ce = new CreditCard(1920);
		ce.output();
		CreditCard cd = new CreditCard(1979);
		cd.output();
		CreditCard ci = new CreditCard(2259);
		ci.output();
		CreditCard ct = new CreditCard(1835);
		ct.output();
		CreditCard cc = new CreditCard(1799);
		cc.output();
		CreditCard ca = new CreditCard(2688);
		ca.output();
		System.out.println("�������" + CreditCard.times + "�ʽ��ס�");
	}
}
