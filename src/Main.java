import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;
        System.out.println("Enter your Birth month [1-12]: ");
        if (in.hasNextInt()) {
            birthMonth = in.nextInt();
            in.nextLine();
            if (birthMonth >= 1 && birthMonth <= 12) {
                System.out.println("You said your Birth month is: " + birthMonth);
            } else {
                System.out.println("You said your Birth month is: " + birthMonth);
                System.out.println("But, it has to be [1-12] and it isn't.");
            }
        }
    }
}