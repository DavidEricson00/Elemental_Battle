public class Battle {

    public void Fight(Element e1, Element e2) {
        Display display = new Display();
        Element attacking = e1;
        Element defending = e2;
        Element aux;

        String[] imageE1 = display.getImage1(e1.getType());
        String[] imageE2 = display.getImage2(e2.getType());

        String[] atkE1 = display.getAttack(e1.getType());
        String[] atkE2 = display.getAttack(e2.getType());

        String[] block = display.Block();
        String[] empty = display.Empty();

        int dmg, def, impact, turn = 1;

        do {
            System.out.println("---------------------------------------");
            System.out.println("Turn " + (turn++));
            dmg = attacking.Attack(attacking.getType(),defending.getType());
            def = defending.Defend();

            System.out.println(attacking.getName() + " Attacking with: " + dmg);
            System.out.println(defending.getName() + " Defending with: " + def);

            if (def > dmg) {
            	if (turn % 2 != 0) {
	                for (int i = 0; i < 7; i++) {
	                    System.out.print(imageE1[i]);
	                    System.out.print(block[i]);
	                    System.out.print(atkE2[i]);
	                    System.out.println(imageE2[i]);
	                }
                } else {
	                for (int i = 0; i < 7; i++) {
	                    System.out.print(imageE1[i]);
	                    System.out.print(atkE1[i]);
	                    System.out.print(block[i]);
	                    System.out.println(imageE2[i]);
	                }
                }
                System.out.println(defending.getName() + " defended the attack!");
            } else {
                impact = Math.abs(dmg - def);
            	if (turn % 2 == 0) {
	                for (int i = 0; i < 7; i++) {
	                    System.out.print(imageE1[i]);
	                    System.out.print(empty[i]);
	                    System.out.print(atkE2[i]);
	                    System.out.println(imageE2[i]);
	                }
                } else {
	                for (int i = 0; i < 7; i++) {
	                    System.out.print(imageE1[i]);
	                    System.out.print(atkE1[i]);
	                    System.out.print(empty[i]);
	                    System.out.println(imageE2[i]);
	                }
                }
                System.out.println(attacking.getName() + " deals " + impact + " damage to " + defending.getName());
                defending.Damage(impact);
            }

            aux = attacking;
            attacking = defending;
            defending = aux;

            System.out.println(e1.getName() + " Life: " + e1.getLife());
            System.out.println(e2.getName() + " Life: " + e2.getLife());

        } while (e1.getLife() > 0 && e2.getLife() > 0);

        if (e1.getLife() <= 0) {
            System.out.println(e2.getName() + " won the battle!");
        } else {
            System.out.println(e1.getName() + " won the battle!");
        }
    }
}
