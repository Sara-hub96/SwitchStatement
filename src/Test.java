import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner consoleInput = new Scanner(System.in);

        boolean run = true;
        while(run){
            int numero = consoleInput.nextInt();

            switch (numero){
                case 1 :
                    System.out.println("one");
                    break;
                case 2 :
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                case 10:
                    System.out.println("ten");
                    break;
                default:
                    run = false;
                    System.out.println("Cannot give you the name");

            }

        }

    }
}
