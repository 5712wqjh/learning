
public class CreditCard extends BankCard{
	public void drawMoney() {
		System.out.println("����Ϊ" + cardNum + "���п�����ȡǮ��");
	}
	
	public void borrowMoney() {
		System.out.println("����Ϊ" + cardNum + "���п����Խ�Ǯ��");
	}
}
