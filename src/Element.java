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
    public void setType(String type) {
        this.type = type;
    }
    
    // Life methods
    public int getLife() {
        return life;
    }
	public void Damage(int damage) {
		life -= damage;
	}

    // Attack methods
    public int Attack() {
    	return rand.nextInt(1, atk);
    }
    
    // Defense methods
    public int Defend() {
    	return rand.nextInt(1, def);
    }

}