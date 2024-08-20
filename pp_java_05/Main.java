import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // obj init
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);

        int result;

        // question block
        System.out.println("Izvēlies skaitli x: ");

        int user_x = scan.nextInt();

        // question block
        System.out.println("Izvēlies darbību (+, -, *, /): ");
        String user_op = scan.next();

        // question block
        System.out.println("Izvēlies skaitli y: ");
        int user_y = scan.nextInt();

        // main logic
        switch (user_op) {
            case "+":

                // assign value
                result = calc.sum(user_x, user_y);

                // output
                System.out.println("Rezultāts: " + result);
                break;
            case "-":

                // assign value
                result = calc.sub(user_x, user_y);

                // output
                System.out.println("Rezultāts: " + result);
                break;
            case "*":

                // assign value
                result = calc.mult(user_x, user_y);

                // output
                System.out.println("Rezultāts: " + result);
                break;
            case "/":

                // assign value
                result = calc.div(user_x, user_y);

                // output
                System.out.println("Rezultāts: " + result);
                break;
            default:
                // output
                System.out.println("Error...");

        }

    }


}