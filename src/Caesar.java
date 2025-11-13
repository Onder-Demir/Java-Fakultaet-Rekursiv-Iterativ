/**
 *
 * @author Philip Ackermann
 *
 */
public class Caesar {
    public static void main(String[] args) {
        /*
        Exkurs Restwert:
        In Java wird für den Restwert (Modulo) das Zeichen % verwendet.
        Beispiel: 7 modulo 3 ist in Java 7 % 3
        7 % 3 = 1
        7 % 2 = 1
        17 % 3 = 2
        2 % 2 = 0
        3 % 2 = 1
        4 % 2 = 0
        5 % 2 = 1
        12.345.321 % 2 = 1
        23 % 7 = 2
        27 % 7 = 6
        18 % 3 = 0
        3 % 7 = 3
        18 % 17 = 1
        17 % 18 = 17
         */


        /**
         * Wir bauen uns eine eigene ASCii Tabelle um das Beispiel besser nachvollziehen zu können. Bzw. die Verwendung von % zu erläutern.
         * A 0
         * B 1
         * C 2
         * ...
         * Y 24
         * Z 25
         *
         * 1 % 26 = 1
         * 2 % 26 = 2
         * ..
         * 25 % 26 = 25
         * 26 % 26 = 0
         * 27 % 26 = 1
         *
         * A wird zu 0
         * verschiebe um 2 => 0 wird zu 2
         * Rechne 2 % 26 => 2
         * 2 wird zu C
         *
         * Z wird zu 25
         * verschieben um 2 => 25 wird zu 27
         * Rechne 27 % 26 => 1
         * 1 wird zu B
         *
         * Z wird zu 25
         * verschieben um 28 => 25 wird zu 53
         * Rechne 53 % 26 => 1
         * 1 wird zu B
         */


        // char einzelnerBuchstabe = 'A';
        // Wenn ich ein char durch cast auf ein int ändere, wird zugehörige Stelle aus derm ASCii-Tabelle verwendet.
        // int i = (int) einzelnerBuchstabe;
        // System.out.println(i);

        char buchstabe = 'Z';
        // A ist die 65 in ASCii Tabelle
        int buchstabeAlsInt = (int) buchstabe;
        // Um wie viele Buchstaben soll verschoben werden
        int rotation = 28;
        int neuerBuchstabeAlsInt = buchstabeAlsInt + rotation;

        // Funktioniert nur, wenn die Rotation nicht zu groß wird.
        // if (neuerBuchstabeAlsInt >= 91)
        // neuerBuchstabeAlsInt = neuerBuchstabeAlsInt - 26;

        // A befindet sich an Position 65. Diese müssen wird subtrahieren um mit Modulo 26 arbeiten zu können und danach wieder addieren.
        neuerBuchstabeAlsInt = ((neuerBuchstabeAlsInt - 65) % 26) + 65;

        char neuerBuchstabe = (char) neuerBuchstabeAlsInt;

        System.out.println(buchstabe + " -> " + rotation + " => " + neuerBuchstabe);
    }
}
