import java.util.Scanner;

import javax.xml.namespace.QName;

public class test {
    public static void main(String[] args) {
        boolean hi = true;
        Scanner uput = new Scanner(System.in);

;        while(hi){
            System.out.println("Whats Your NAme");
            int name = uput.nextInt();
            switch (name) {
                case 1:
                    System.out.println("hi " + name);
                    break;
                case 2:
                    hi = false;
                    break;
                default:
                    break;
            }
            
        }
    } 
}
