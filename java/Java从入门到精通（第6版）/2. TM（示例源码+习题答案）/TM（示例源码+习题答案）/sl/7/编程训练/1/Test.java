
public class Test {
	public static void main(String[] args) {
		System.out.println("--------------���п����ص�--------------");
		BankCard bankCard = new BankCard();
		bankCard.cardNum = "6224 4569 2421 3677";
		bankCard.saveMoney();
		System.out.println("--------------������ص�--------------");
		SavingCard savingCard = new SavingCard();
		savingCard.cardNum = "6212 2636 0001 2739";
		savingCard.saveMoney();
		savingCard.drawMoney();
		System.out.println("--------------���ÿ����ص�--------------");
		CreditCard creditCard = new CreditCard();
		creditCard.cardNum = "4013 7356 3380 0642";
		creditCard.saveMoney();
		creditCard.drawMoney();
		creditCard.borrowMoney();
	}
}
