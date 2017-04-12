import java.util.Scanner;
// LabThree GC Java Bootcamp. Sean Dunn and Lydia Latocki
public class Main {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        char userChar = 'Y';
        long userNumber = 0;

        while (userChar == 'Y' ||  userChar =='y') {
            System.out.println("Enter an integer");
            userNumber = scnr.nextInt();

            System.out.printf("%-22s%-22s%-22s\n","Number","Squared","Cubed");

            for(long i = 1; i <= userNumber; i++){
                System.out.printf("%-22d%-22d%-22d\n", i, i*i, i*i*i);
            }

            System.out.println("Continue? (y/n)");
            userChar = scnr.next().charAt(0);
        }
        scnr.close();
        System.out.println("Goodbye.");

        return;

    }
}
