public class Quersumme {

    public static void main(String[] args) {

        int i = 12;

        // Die Quersumme ist die Summe aller einzelner Ziffern in einer ganzen Zahl
        // Beispiel: Quersumme von 123 ist 1+2+3=6
        // Quersumme von 65783 ist 6+5+7+8+3=29

        // Wie erhalte ich die letzte Ziffer einer Zahl, mit Hilfe des Modulo-Operators?
        // Dafür kann ich % 10 verwenden.
        // Beispiel: 123 % 10 = 3
        // 65783 % 10 = 3

        // Info: wenn ich ein int durch einen int dividiere, ist das Ergebnis wieder ein int.

        int quersumme = 0;
        while (i > 0) {
            quersumme = quersumme + (i % 10);
            i = i / 10;
        }

        System.out.println(quersumme);


    }
}
