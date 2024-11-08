public class Battle {
	public void Fight(Element e1, Element e2) {
		Element attacking = e1;
		Element deffending = e2;
		Element aux;
		
		int dmg, def, impact, turn=1;
		
		do {
			
		} while (e1.getLife() > 0 && e2.getLife()> 0);
		
		if (e1.getLife() <= 0)
			System.out.println(e2.getName() + "Won the battle!");
		else
			System.out.println(e1.getName() + "Won the battle!");

	}
	

}
