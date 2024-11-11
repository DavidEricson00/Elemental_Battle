import java.util.Random;

public class Element {

    private String name;
    private String type;
    private int life;
    private int atk;
    private int def;
    

    
    private Random rand = new Random();
    
    public Element(String name, String type, int life, int atk, int def) {
        this.name = name;
        this.type = type;
        this.life = life;
        this.atk = atk;
        this.def = def;
    }
    
    // Name methods
    public String getName() {
        return name;
    }
    
    // Type methods
    public String getType() {
        return type;
    }    
    public boolean Effective(String type1, String type2) {
        if (type1.equals("fire") && type2.equals("nature")) {
            return true;
        } else if (type1.equals("nature") && type2.equals("water")) {
        	return true;
        }else if (type1.equals("water") && type2.equals("fire")) {
        	return true;
        } return false;
    }
    
    // Life methods
    public int getLife() {
        return life;
    }

    public void Damage(int damage) {
        life = Math.max(0, life - damage);
    }


    // Attack methods
    public int Attack(String type1, String type2) {
    	if (Effective(type1, type2)) {
    		return rand.nextInt(1, atk)*2;
    	}return rand.nextInt(1, atk);
    }
    
    // Defense methods
    public int Defend() {
    	return rand.nextInt(1, def);
    }
}