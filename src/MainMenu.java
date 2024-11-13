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
        }
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

        return new Element(name, type, life, atk, def);
    }
}
