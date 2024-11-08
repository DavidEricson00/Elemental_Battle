
public class Test {
	
	public static void main(String[] args) {
		Battle battle = new Battle();
		
		Element e1 = new Element("Aqua","Water",1000,30,60);
		Element e2 = new Element("Flame","Water",1000,60,30);
	
		battle.Fight(e1, e2);
	}
	
}
