package 이은지;
class Seller{
	private int MyMoney;
	private int AppleCnt;
	public int Price;
	
	public Seller(int myMoney, int appleCnt, int price) {
		super();
		MyMoney = myMoney;
		AppleCnt = appleCnt;
		Price = price;
	}
	public int Receive(int money) {
		MyMoney+=money;
		int revcnt=money/Price+1;
		AppleCnt-=revcnt;
		return revcnt;
	}
	public void ShowInfo() {
		System.out.println("-----판매자 정보-----");
		System.out.println("보유 금액 : "+ MyMoney);
		System.out.println("사과 개수 : "+ AppleCnt);
		System.out.println("개당 가격 : "+ Price);
	}
}


class Buyer{
	private int MyMoney;
	private int AppleCnt;
	
	public Buyer(int myMoney, int appleCnt) {
		super();
		MyMoney = myMoney;
		AppleCnt = appleCnt;
	}
	public void Payment(Seller seller, int money)
	{
		MyMoney-=money;
		int cnt = seller.Receive(money);
		AppleCnt+=cnt;
	}
	public void ShowInfo() {
		System.out.println("-----구매자 정보-----");
		System.out.println("-buyer-");
		System.out.println("보유금액 : "+ MyMoney);
		System.out.println("사과개수 : "+ AppleCnt);
	}
}

public class Test {

	public static void main(String[] args) {

		Seller 사과장수1 = new Seller(110000,100,1000); 
		Buyer 홍길동 = new Buyer(10000, 0);
		Buyer 엄태웅 = new Buyer(20000,0); 
		Buyer 김상중 = new Buyer(30000,0);
		홍길동.Payment(사과장수1, 2000);
		엄태웅.Payment(사과장수1, 4000);
		김상중.Payment(사과장수1, 3000);
		사과장수1.ShowInfo();
		홍길동.ShowInfo();
		엄태웅.ShowInfo();
		김상중.ShowInfo();
		
	}

}
