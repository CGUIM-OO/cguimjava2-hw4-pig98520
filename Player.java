import java.util.ArrayList;

public class Player {
	private String name; //玩家姓名
	private int chips; //玩家有的籌碼
	private int bet; //預計下注金額
	private ArrayList<Card> oneRoundCard=new ArrayList<Card>(); //玩家擁有的牌
	
	public Player(String name, int chips) {
		this.name=name;
		this.chips=chips;
	}
	public String getName() {
		return name;
	}
	public int makeBet() {
		if(chips!=0) {
			bet=1; //基本暫定1元
			//System.out.println("您這回合下注了"+bet+"元");
			return bet;
		}
		else {
			//System.out.println("您已沒有足夠的籌碼能夠下注了~");
			return 0;
		}
	}
	public void setOneRoundCard(ArrayList cards) {
		oneRoundCard=cards;
	}
	public boolean hitMe() {
		if(getTotalValue()<=16) {
			return true;
		}
		else {
			return false;
		}
	}
	public int getTotalValue() {
		int totalValue=0;//總共點數
		for(int i=0;i<oneRoundCard.size();i++) {
			totalValue+=(int)oneRoundCard.get(i).getRank();
		}
		return totalValue;
	}
	public int getCurrentChips() {
		return chips;
	}
	public void increaseChips (int diff) {
		chips=chips+diff;
	}
	public void sayHello() {
		System.out.println("Hello, I am " + name + ".");
		System.out.println("I have " + chips + " chips.");
	} 
}
