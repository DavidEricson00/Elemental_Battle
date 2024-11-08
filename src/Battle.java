public class Battle {
	
	public void Fight(Element e1, Element e2) {
		Element attacking = e1;
		Element defending = e2;
		Element aux;
		
		int dmg, def, impact, turn=1;
		
		do {
			dmg = attacking.Attack();
			def = defending.Defend();
			impact = (dmg - def);
			
			if (dmg > def) {
				System.out.println(attacking.getName() + " deals " + impact + " damege to " + defending.getName());
				defending.Damage(impact);
			}
			else
				System.out.println(defending.getName() + " deffended the attack ");
			
		} while (e1.getLife() > 0 && e2.getLife()> 0);
		
		if (e1.getLife() <= 0)
			System.out.println(e2.getName() + " Won the battle!");
		else
			System.out.println(e1.getName() + " Won the battle!");

	}
	

}
