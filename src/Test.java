
public class Test {
	
	public static void main(String[] args) {
		Battle battle = new Battle();
		
		Element e1 = new Element("Aqua","Water",100,30,60);
		Element e2 = new Element("Flame","Fire",100,60,30);
	
		battle.Fight(e1, e2);
	}
	
}
