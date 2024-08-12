import java.sql.SQLException;

/**
 * Šī klase demonstrē dažādus Java pamata konceptus, ieskaitot datu tipus,
 * operatorus un vadības struktūras.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Sveika pasaule!");

        // vienas rindas komentārs

        /*
            vairāku
            rindu
            komentārs
         */

        // datu tipi
        // primitīvie

        // byte: 8-bitu
        // diapazons: no -128 līdz 127
        byte mazsSkaitlis = 127;

        System.out.println("byte piemērs " + mazsSkaitlis);

        // short: 16-bitu
        // diapazons: no -32,768 līdz 32,767
        short videjsSkaitlis = 32000;

        System.out.println("short piemērs " + videjsSkaitlis);

        // int: 32-bitu
        // diapazons: no -2B līdz 2B
        int kafijasKruzuSkaits = 320;

        System.out.println("int piemērs " + kafijasKruzuSkaits);

        // long: 64-bitu
        long lielsSkaitlis = 9000000000L;

        System.out.println("long piemērs " + lielsSkaitlis);

        // float: 32-bitu
        float precizitate = 3.14f;

        System.out.println("float piemērs " + precizitate);

        // double: 64-bitu
        double kafijasTemperatura = 85.5;

        System.out.println("double piemērs " + kafijasTemperatura);

        // boolean
        boolean irAdmins = false;

        System.out.println("boolean piemērs " + irAdmins);

        // char: 16-bitu
        char burts = 'A';

        System.out.println("char piemērs " + burts);


        // ne-primitīvie

        String vards = "Madars";

        System.out.println(vards.toLowerCase());

        final double PI = 3.14159;

        System.out.println("Konstantes piemērs: " + PI);


        // operatori

        // aritmētiskie operatori

        int a = 14;
        int b = 5;

        System.out.println("Saskaitīšana: " + (a + b));
        System.out.println("Atņemšana: " + (a - b));
        System.out.println("Reizināšana: " + (a * b));
        System.out.println("Dalīšana: " + (a / b));
        System.out.println("Atlikums: " + (a % b));


        // inkrements

        int c = 5;

        System.out.println("Vispirms palielina: " + (++c));
        System.out.println("Vispirms izmanto un tad palielina: " + (c++));


        // salīdzināšanas operatori
        System.out.println("Vienāds: " + (a == b));
        System.out.println("Nav vienāds: " + (a != b));
        System.out.println("Lielāks nekā: " + (a > b));
        System.out.println("Mazāks nekā: " + (a < b));
        System.out.println("Lielāks vai vienāds: " + (a >= b));
        System.out.println("Mazāks vai vienāds: " + (a <= b));

        // loģiskie operatori
        boolean x = true;
        boolean y = false;

        System.out.println("Loģiskais UN: " + (x && y));
        System.out.println("Loģiskais VAI: " + (x || y));
        System.out.println("Loģiskais NĒ: " + (!x) );


        // piešķiršanas operatori
        int d = 10;
        d += 5; // d = d + 5
        System.out.println("Ar saskaitīšanu: " + d);


        // lēmumu pieņemšana
        int vecums = 18;

        if (vecums >= 18) {
            System.out.println("Jūs esat pilngadīgs");
        } else {
            System.out.println("Tu vēl neesi pilngadīgs");
        }


        int punktuSkaits = 75;

        if (punktuSkaits >= 90) {
            System.out.println("Jūsu atzīme ir A");
        } else if (punktuSkaits >= 80) {
            System.out.println("Jūsu atzīme ir B");
        } else if (punktuSkaits >= 70) {
            System.out.println("Jūsu atzīme ir C");
        } else {
            System.out.println("Jums nepieciešams uzlabot atzīmes");
        }


        int diena = 3;

        switch (diena) {
            case 1:
                System.out.println("Pirmdiena");
                break;
            case 2:
                System.out.println("Otrdiena");
                break;
            case 3:
                System.out.println("Trešdiena");
                break;
            default:
                System.out.println("Nedēļas nogale");
        }
    }
}
