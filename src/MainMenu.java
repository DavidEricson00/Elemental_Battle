import java.util.Scanner;

public class MainMenu {

    public static void main(String[] args) {
        Element e1 = null, e2 = null;
        Battle battle = new Battle();
        Scanner input = new Scanner(System.in);
        int option = -1;

        while (option != 0) {
        	Menu();
            option = input.nextInt();
            
            if (option == 1) {
            	System.out.println("Create the Element 1");
            	e1 = ElementCreate();
            	System.out.println("Element 1 created");
            	System.out.println("Create the Element 2");
            	e2 = ElementCreate();
            	System.out.println("Element 2 created");
            	battle.Fight(e1,e2);
            }
            if (option == 2) {
            	ElementSelection();
            }
        }
        System.out.println("Thank you for playing!");
    }
    
    public static void Menu() {
        System.out.println("\n--- Main Menu ---");
        System.out.println("1. Create Element");
        System.out.println("2. Choose pre-generated Elements");
        System.out.println("3. Exit");
        System.out.print("Enter the option you want: ");
    }

    public static Element ElementCreate() {
        Scanner input = new Scanner(System.in);
        int life, atk, def;
        String name, type;

        System.out.print("Enter your Element name: ");
        name = input.next();
        System.out.print("Enter your Element type [fire, nature, water, normal]: ");
        type = input.next();
        System.out.print("Enter your Element life: ");
        life = input.nextInt();
        System.out.print("Enter your Element attack: ");
        atk = input.nextInt();
        System.out.print("Enter your Element defense: ");
        def = input.nextInt();
        input.close();
        return new Element(name, type, life, atk, def);
    }
    
    public static void ElementSelection() {
        Display display = new Display();
        String[] image = display.getImage1("fire");
        
        System.out.println("--- Element Technical Sheet ---");
        for (String line : image)
            System.out.println(line);
        System.out.println("Name: Byte");
        System.out.println("Type: Fire");
        System.out.println("Health: 80");
        System.out.println("Attack: 60");
        System.out.println("Defense: 30");
        System.out.println("-------------------------------");

        String[] image1 = display.getImage1("nature");
        
        System.out.println("--- Element Technical Sheet ---");
        for (String line : image1)
            System.out.println(line);
        System.out.println("Name: Leaf");
        System.out.println("Type: Nature");
        System.out.println("Health: 150");
        System.out.println("Attack: 40");
        System.out.println("Defense: 50");
        System.out.println("-------------------------------");
        
        String[] image11 = display.getImage1("water");
        
        System.out.println("--- Element Technical Sheet ---");
        for (String line : image11)
            System.out.println(line);
        System.out.println("Name: Stream");
        System.out.println("Type: Water");
        System.out.println("Health: 100");
        System.out.println("Attack: 30");
        System.out.println("Defense: 100");
        System.out.println("-------------------------------");
        
        String[] image111 = display.getImage1("normal");
        
        System.out.println("--- Element Technical Sheet ---");
        for (String line : image111)
            System.out.println(line);
        System.out.println("Name: Null");
        System.out.println("Type: Normal");
        System.out.println("Health: 100");
        System.out.println("Attack: 40");
        System.out.println("Defense: 40");
        System.out.println("-------------------------------");
    }

}
