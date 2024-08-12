import java.sql.SQLOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int a, b, c;

        // for
        for (int i = 0; i < 5; i++) {
            System.out.println("Iterācija: " + i);
        }

        for (int i = 0; i <= 10; i += 2) {
            System.out.println("Pāra skaitlis: " +i);
        }

//        for (int i = 0;  j = 10; i < j; i++; j--) {
//
//        }

        // while
        int count = 0;

        while (count <= 5) {
            System.out.println("Skaits: " + count);
            count++;
        }

        Scanner scan = new Scanner(System.in);

        String input = "";



        while (!input.equals("exit")) {

            System.out.println("Ievadi savu vārdu (vai 'exit', lai beigtu): ");

            input = scan.nextLine();

            if (!input.equals("exit")) {
                System.out.println("Jūs ievadījāt: " + input);
            }
        }


        // do while
        int num = 0;

        do {
            System.out.println("Cipars: " + num);
            num++;
        } while (num < 5);


        int guessNumber;
        int targetNumber = 7;

        do {
            System.out.println("Uzmini skaitli no 1 līdz 10: ");
            guessNumber = scan.nextInt();

            if (guessNumber < targetNumber) {
                System.out.println("Par mazu!");
            } else if (guessNumber > targetNumber) {
                System.out.println("Par lielu");
            }

        } while (guessNumber != targetNumber);

        System.out.println("Apsveicam Jūs uzminējāt skaitli " + targetNumber);

        // array

        int[] numbers = {1, 2, 3, 4};

        String[] names = {"Jānis", "Pēteris"};

        System.out.println(numbers[0]);
        System.out.println(names[1]);

        System.out.println("Numbers array");
        System.out.println(numbers.length);
        System.out.println("Names array");
        System.out.println(names.length);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index: " + i + ": " + numbers[i]);
        }

        // for each loop
        for (int number : numbers) {
            System.out.println("Skaitlis: " + number);
        }

        // div dim mas
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Element of [" + i + "][" + j + "]: " + matrix[i][j]);
            }
        }

        System.out.println(matrix[0][1]);

        // array list
        ArrayList<String> augli = new ArrayList<>();

        augli.add("Ābols");
        augli.add("Banāns");
        augli.add("Apelsīns");

        System.out.println("Array list: " + augli);

        augli.add(1, "Mango");

        System.out.println("Array list: " + augli);

        augli.remove("Banāns");

        System.out.println("Array list: " + augli);

        System.out.println(augli.size());

        for (int i = 0; i < augli.size(); i++) {
            System.out.println("Auglis #" + (i+1) + ": " + augli.get(i));
        }

        // for each
        for (String auglis : augli) {
            System.out.println("Auglis: " + auglis);
        }


        int size = 5;
        // patern
        // kvadrāts

        // rindas
        for (int i = 0; i < size; i++) {
            // kolonas
            for (int j = 0; j < size; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // triujsturis
        // rindu skaits
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }


        for (int i = size; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }


        Human madars = new Human();

        madars.name = "Madars";
        System.out.println(madars.name);
        madars.age = 0;
        System.out.println(madars.age);

        madars.grow();

        Human edgars = new Human();

        edgars.name = "Edgars";
        System.out.println(edgars.name);
        edgars.age = 1;
        System.out.println(edgars.age);

        edgars.grow();


        DBlogic db = new DBlogic();

        db.connect();
    }
}