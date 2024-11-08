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
    public void setName(String name) {
        this.name = name;
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
    public void setLife(int life) {
        this.life = life;
    }
	public void Damage(int damage) {
		life -= damage;
	}

    // Attack methods
    public int getAtk() {
        return atk;
    }
    public void setAtk(int atk) {
        this.atk = atk;
    }
    public int Attack() {
    	return rand.nextInt(atk);
    }
    
    // Defense methods
    public int getDef() {
        return def;
    }
    public void setDef(int def) {
        this.def = def;
    }
    public int Defend() {
    	return rand.nextInt(def);
    }
}