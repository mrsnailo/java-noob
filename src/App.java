import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner uput = new Scanner(System.in);
        boolean Out = false;
        String times = "a";
        while (!Out) {
            System.out.println("a) Create " + times + " Citizen \n" +
                    "b) Quit");
            String answer = uput.nextLine();
            if (answer.equals("a")) {
                System.out
                        .println("What type of Citizen You Want TO create , \n" + "1) Bangladeshi \n" + "2) Nigerian");
                String choice = uput.nextLine();
                if (choice.equals("1")) {
                    System.out.println("Name Of Bangladeshi Citizen");
                    String uname = uput.nextLine();
                    System.out.println("Age OF Bd Citizen");
                    int uage = uput.nextInt();
                    uput.nextLine();

                    Human bd1 = new Bnagladeshi(uname, uage);
                    // Detailed

                    System.out.println("What Do You want to know about the user you created: \n" +
                            "1) How He /she  Moves? \n" +
                            "2) How Much he/she  Sleeps? \n" +
                            "3) What Language He/She Speaks? \n" +
                            "4) What Does He / she Eats? \n");

                    int choice2 = uput.nextInt();
                    uput.nextLine();

                    switch (choice2) {
                        case 1:
                            bd1.move();
                            break;
                        case 2:
                            bd1.sleeps();
                            break;
                        case 3:
                            bd1.speaks();
                            break;
                        case 4:
                            bd1.eats();
                            break;
                        default:
                            break;
                    }
                } else if (choice.equals("2")) {
                    System.out.println("Name Of Nigerian  Citizen");
                    String uname = uput.nextLine();
                    System.out.println("Age OF Nigerian Citizen");
                    int uage = uput.nextInt();
                    uput.nextLine();

                    Human nz1 = new Nigerian(uname, uage);

                    System.out.println("What Do You want to know about the user you created: \n" +
                            "1) How He /she  Moves? \n" +
                            "2) How Much he/she  Sleeps? \n" +
                            "3) What Language He/She Speaks? \n" +
                            "4) What Does He / she Eats? \n");

                    int choice2 = uput.nextInt();
                    uput.nextLine();

                    switch (choice2) {
                        case 1:
                            nz1.move();

                            break;
                        case 2:
                            nz1.sleeps();
                            break;
                        case 3:
                            nz1.speaks();
                            break;
                        case 4:
                            nz1.eats();
                            break;
                        default:
                            break;
                    }

                } else {
                    System.out.println("Uh No!!! Choose between 1/2");
                }
                times = "another";
            } else if (answer.equals("b")) {
                Out = true;
                System.out.println(Out);

            } else {
                System.out.println("Please Enter a/b");
            }
        }
        uput.close();
    }
}
