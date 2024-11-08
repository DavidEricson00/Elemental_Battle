public class Battle {

    public void Fight(Element e1, Element e2) {
        Element attacking = e1;
        Element defending = e2;
        Element aux;

        int dmg, def, impact, turn = 1;

        do {
        	System.out.println("Turn " + (turn++));
            dmg = attacking.Attack();
            def = defending.Defend();

            if (def > dmg)
            	System.out.println(defending.getName() + " defended the attack!");
            else {
            	impact = Math.abs(dmg - def);
            	System.out.println(attacking.getName() + " deals " + impact + " damage to " + defending.getName());
            	defending.Damage(impact);
            }

            aux = attacking;
            attacking = defending;
            defending = aux;

        } while (e1.getLife() > 0 && e2.getLife() > 0);

        if (e1.getLife() <= 0) {
            System.out.println(e2.getName() + " won the battle!");
        } else {
            System.out.println(e1.getName() + " won the battle!");
        }
    }
}
