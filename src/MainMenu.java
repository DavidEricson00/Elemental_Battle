import java.util.Scanner;

public class MainMenu {

    public static void main(String[] args) {
        Element e1 = null, e2 = null;
        Battle battle = new Battle();
        Scanner input = new Scanner(System.in);
        int option = -1;

        while (option != 3) {
            Menu();
            option = input.nextInt();
            
            if (option == 1) {
                System.out.println("-------------------------------");
                System.out.println("Create the Element 1");
                e1 = ElementCreate(input);
                System.out.println("Element 1 created");
                System.out.println("Create the Element 2");
                e2 = ElementCreate(input);
                System.out.println("Element 2 created");
                battle.Fight(e1, e2);
            } else if (option == 2) {
                System.out.println("-------------------------------");
                System.out.println("Select the Element 1");
                e1 = ElementSelection(input);
                System.out.println("Element 1 selected");
                System.out.println("Select the Element 2");
                e2 = ElementSelection(input);
                System.out.println("Element 2 selected");
                battle.Fight(e1, e2);
            } else if (option != 3) {
                System.out.println("Invalid option, please try again.");
            }
        }
        System.out.println("-------------------------------");
        System.out.println("Thank you for playing!");
        input.close();
    }
    
    public static void Menu() {
        System.out.println("\n--- Main Menu ---");
        System.out.println("1. Create Element");
        System.out.println("2. Choose pre-generated Elements");
        System.out.println("3. Exit");
        System.out.print("Enter the option you want: ");
    }

    public static Element ElementCreate(Scanner input) {
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

        return new Element(name, type, life, atk, def);
    }
    
    public static Element ElementSelection(Scanner input) {
        Display display = new Display();
        int option;
        
        String[] fireImage = display.getImage1("fire");
        System.out.println("--- Element Technical Sheet ---");
        for (String line : fireImage)
            System.out.println(line);
        System.out.println("Name: Byte");
        System.out.println("Type: Fire");
        System.out.println("Health: 80");
        System.out.println("Attack: 70");
        System.out.println("Defense: 20");
        System.out.println("-------------------------------");

        String[] natureImage = display.getImage1("nature");
        System.out.println("--- Element Technical Sheet ---");
        for (String line : natureImage)
            System.out.println(line);
        System.out.println("Name: Leaf");
        System.out.println("Type: Nature");
        System.out.println("Health: 120");
        System.out.println("Attack: 50");
        System.out.println("Defense: 40");
        System.out.println("-------------------------------");

        String[] waterImage = display.getImage1("water");
        System.out.println("--- Element Technical Sheet ---");
        for (String line : waterImage)
            System.out.println(line);
        System.out.println("Name: Stream");
        System.out.println("Type: Water");
        System.out.println("Health: 90");
        System.out.println("Attack: 30");
        System.out.println("Defense: 70");
        System.out.println("-------------------------------");

        String[] normalImage = display.getImage1("normal");
        System.out.println("--- Element Technical Sheet ---");
        for (String line : normalImage)
            System.out.println(line);
        System.out.println("Name: Null");
        System.out.println("Type: Normal");
        System.out.println("Health: 100");
        System.out.println("Attack: 40");
        System.out.println("Defense: 40");
        System.out.println("-------------------------------");


        System.out.println("1. Fire");
        System.out.println("2. Nature");
        System.out.println("3. Water");
        System.out.println("4. Normal");
        System.out.print("Enter the option you want: ");
        option = input.nextInt();
        
        if (option == 1)
            return new Element("Byte", "fire", 80, 70, 20);
        else if (option == 2)
            return new Element("Leaf", "nature", 120, 50, 40);
        else if (option == 3)
            return new Element("Stream", "water", 90, 30, 70);
        else if (option == 4)
            return new Element("Null", "normal", 100, 40, 40);
        else
        	return null;
    }

}
