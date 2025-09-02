import java.util.Scanner;

public class App {
    private static Scanner scanner = new Scanner(System.in);
    private static final String BORDER = "═══════════════════════════════════════════════════════════════";
    private static final String TITLE = "[*] Human Citizenship Simulator [*]";
    
    public static void main(String[] args) {
        displayWelcome();
        boolean isRunning = true;
        boolean isFirstTime = true;
        
        while (isRunning) {
            try {
                displayMainMenu(isFirstTime);
                String choice = getUserInput("Enter your choice: ").toLowerCase().trim();
                
                switch (choice) {
                    case "a":
                    case "1":
                        createCitizen();
                        isFirstTime = false;
                        break;
                    case "b":
                    case "2":
                        isRunning = false;
                        displayGoodbye();
                        break;
                    default:
                        displayError("Please enter 'a' or 'b' (or '1' or '2')");
                }
            } catch (Exception e) {
                displayError("An unexpected error occurred. Please try again.");
                scanner.nextLine(); // Clear the input buffer
            }
        }
        
        scanner.close();
    }
    
    private static void displayWelcome() {
        clearScreen();
        System.out.println(BORDER);
        System.out.println(centerText(TITLE));
        System.out.println(centerText("Explore Different Cultures and Lifestyles"));
        System.out.println(BORDER);
        System.out.println();
        pauseForUser("Press Enter to continue...");
    }
    
    private static void displayMainMenu(boolean isFirstTime) {
        clearScreen();
        System.out.println(BORDER);
        System.out.println(centerText("[HOME] MAIN MENU [HOME]"));
        System.out.println(BORDER);
        System.out.println();
        System.out.println("  [+] a) Create " + (isFirstTime ? "a" : "another") + " citizen");
        System.out.println("  [X] b) Exit application");
        System.out.println();
        System.out.println(BORDER);
    }
    
    private static void createCitizen() {
        displayNationalityMenu();
        String nationalityChoice = getUserInput("Select nationality (1 or 2): ").trim();
        
        Human citizen = null;
        String nationality = "";
        
        switch (nationalityChoice) {
            case "1":
                citizen = createBangladeshiCitizen();
                nationality = "[BD] Bangladeshi";
                break;
            case "2":
                citizen = createNigerianCitizen();
                nationality = "[NG] Nigerian";
                break;
            default:
                displayError("Please choose 1 for Bangladeshi or 2 for Nigerian.");
                return;
        }
        
        if (citizen != null) {
            displayCitizenCreated(nationality);
            exploreCitizenCharacteristics(citizen);
        }
    }
    
    private static void displayNationalityMenu() {
        clearScreen();
        System.out.println(BORDER);
        System.out.println(centerText("[WORLD] SELECT NATIONALITY [WORLD]"));
        System.out.println(BORDER);
        System.out.println();
        System.out.println("  [BD] 1) Bangladeshi Citizen");
        System.out.println("  [NG] 2) Nigerian Citizen");
        System.out.println();
        System.out.println(BORDER);
    }
    
    private static Human createBangladeshiCitizen() {
        System.out.println("\n[BD] Creating Bangladeshi Citizen...");
        System.out.println("─────────────────────────────────────");
        
        String name = getUserInput("[USER] Enter citizen's name: ");
        if (name.trim().isEmpty()) {
            displayError("Name cannot be empty!");
            return null;
        }
        
        int age = getValidAge();
        if (age == -1) return null;
        
        return new Bangladeshi(name, age);
    }
    
    private static Human createNigerianCitizen() {
        System.out.println("\n[NG] Creating Nigerian Citizen...");
        System.out.println("─────────────────────────────────────");
        
        String name = getUserInput("[USER] Enter citizen's name: ");
        if (name.trim().isEmpty()) {
            displayError("Name cannot be empty!");
            return null;
        }
        
        int age = getValidAge();
        if (age == -1) return null;
        
        return new Nigerian(name, age);
    }
    
    private static void displayCitizenCreated(String nationality) {
        System.out.println();
        System.out.println("[OK] " + nationality + " citizen created successfully!");
        System.out.println();
        pauseForUser("Press Enter to explore their characteristics...");
    }
    
    private static void exploreCitizenCharacteristics(Human citizen) {
        boolean exploring = true;
        
        while (exploring) {
            displayCharacteristicsMenu();
            String choice = getUserInput("What would you like to know? (1-5): ").trim();
            
            clearScreen();
            System.out.println(BORDER);
            System.out.println(centerText("[INFO] CITIZEN CHARACTERISTICS [INFO]"));
            System.out.println(BORDER);
            System.out.println();
            
            switch (choice) {
                case "1":
                    System.out.println("[MOVE] MOVEMENT CHARACTERISTICS:");
                    System.out.println("─────────────────────────────");
                    citizen.move();
                    break;
                case "2":
                    System.out.println("[SLEEP] SLEEPING HABITS:");
                    System.out.println("──────────────────");
                    citizen.sleeps();
                    break;
                case "3":
                    System.out.println("[LANG] LANGUAGE SKILLS:");
                    System.out.println("──────────────────");
                    citizen.speaks();
                    break;
                case "4":
                    System.out.println("[FOOD] DIETARY PREFERENCES:");
                    System.out.println("──────────────────────");
                    citizen.eats();
                    break;
                case "5":
                    exploring = false;
                    System.out.println("[BACK] Returning to main menu...");
                    break;
                default:
                    displayError("Please choose a number between 1 and 5.");
                    continue;
            }
            
            if (exploring) {
                System.out.println();
                pauseForUser("Press Enter to continue exploring or choose 5 to go back...");
            }
        }
    }
    
    private static void displayCharacteristicsMenu() {
        clearScreen();
        System.out.println(BORDER);
        System.out.println(centerText("[EXPLORE] EXPLORE CHARACTERISTICS [EXPLORE]"));
        System.out.println(BORDER);
        System.out.println();
        System.out.println("  [MOVE] 1) How do they move?");
        System.out.println("  [SLEEP] 2) What are their sleeping habits?");
        System.out.println("  [LANG] 3) What language do they speak?");
        System.out.println("  [FOOD] 4) What do they eat?");
        System.out.println("  [BACK] 5) Back to main menu");
        System.out.println();
        System.out.println(BORDER);
    }
    
    private static void displayGoodbye() {
        clearScreen();
        System.out.println(BORDER);
        System.out.println(centerText("[GOODBYE] THANK YOU FOR USING [GOODBYE]"));
        System.out.println(centerText("Human Citizenship Simulator"));
        System.out.println(BORDER);
        System.out.println();
        System.out.println(centerText("We hope you enjoyed exploring different cultures!"));
        System.out.println(centerText("Come back anytime to learn more! [*]"));
        System.out.println();
        System.out.println(BORDER);
    }
    
    // Utility methods
    private static String getUserInput(String prompt) {
        System.out.print("[INPUT] " + prompt);
        return scanner.nextLine();
    }
    
    private static int getValidAge() {
        while (true) {
            try {
                String ageInput = getUserInput("[AGE] Enter citizen's age: ");
                int age = Integer.parseInt(ageInput.trim());
                
                if (age < 0 || age > 150) {
                    displayError("Please enter a valid age between 0 and 150.");
                    continue;
                }
                
                return age;
            } catch (NumberFormatException e) {
                displayError("Please enter a valid number for age.");
            }
        }
    }
    
    private static void displayError(String message) {
        System.out.println();
        System.out.println("[ERROR] " + message);
        System.out.println();
        pauseForUser("Press Enter to continue...");
    }
    
    private static void pauseForUser(String message) {
        System.out.print("[PAUSE] " + message);
        scanner.nextLine();
    }
    
    private static void clearScreen() {
        // Print multiple newlines to simulate clearing screen
        for (int i = 0; i < 3; i++) {
            System.out.println();
        }
    }
    
    private static String centerText(String text) {
        int padding = (BORDER.length() - text.length()) / 2;
        return " ".repeat(Math.max(0, padding)) + text;
    }
}
