import java.util.ArrayList;

public class Player {
	private String name; //���a�m�W
	private int chips; //���a�����w�X
	private int bet; //�w�p�U�`���B
	private ArrayList<Card> oneRoundCard=new ArrayList<Card>(); //���a�֦����P
	
	public Player(String name, int chips) {
		this.name=name;
		this.chips=chips;
	}
	public String getName() {
		return name;
	}
	public int makeBet() {
		if(chips!=0) {
			bet=1; //�򥻼ȩw1��
			//System.out.println("�z�o�^�X�U�`�F"+bet+"��");
			return bet;
		}
		else {
			//System.out.println("�z�w�S���������w�X����U�`�F~");
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
		int totalValue=0;//�`�@�I��
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
