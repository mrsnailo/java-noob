import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Human [] Group1 = {
            new Bnagladeshi("Borsha", 43),
            new Nigerian("Steve Parl", 23)
        };
        for(int i = 0; i<Group1.length; i++){
            Group1[i].speaks();
        }
    }
}
