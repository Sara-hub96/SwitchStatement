import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner consoleInput = new Scanner(System.in);

        //System.out.println(numero);

        while(true){
            int numero = consoleInput.nextInt();
            switch (numero){
                case 1 :
                    System.out.println("one");
                case 2 :
                    System.out.println("two");
                case 3:
                    System.out.println("three");
            }

        }


    }
}
