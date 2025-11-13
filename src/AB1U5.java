public class AB1U5 {

    public static void main(String[] args) {
        // aufgabeA();
        aufgabeB();
    }

    public static void aufgabeA() {
        /*
        Schreiben Sie ein Programm mit zwei Variablen x und y vom Typ int und
        einer Ausgabe mit System.out.println(). Die Variablen können beliebige
        Ganzzahlen enthalten (vorausgesetzt, sie passen in den Wertebereich eines
        int). Das Programm soll die beiden Werte addieren und formatiert auf
        der Konsole ausgeben.

        Beispielausgabe
        1 + 2 = 3
        42 + 13 = 55
        250000 + 43000 = 293000
         */

        // Initialisiere ich die Variable nicht explizit mit einem Wert, so hat sie den Default-Wert 0 (bei int).
        // int a;

        int x = 4;
        int y = 7;
        int sum = summiere(x, y);

        System.out.println(x + " + " + y + " = " + sum);

        // Alternativ ohne separate lokale Variable => wichtig x + y nochmals geklammert, sonst wird x und y als separater String zusammengebaut.
        System.out.println(x + " + " + y + " = " + (x + y));
    }

    // Für Lösung Aufgabe nicht notwendig. Beispiel aus Vorlesung.
    // Eine eigene Methode (Funktion) der ich zwei Parameter übergeben kann und diese mir die Summe zurückgibt.
    public static int summiere(int a, int b) {
        return a + b;
    }

    public static void aufgabeB() {
        String name = "Max Mustermann";
        byte age = 25;
        double size = 1.8;
        String place = "Berlin";

        System.out.println("Name: " + name);
        System.out.println("Alter: " + age);
        System.out.println("Größe: " + size + "m");
        System.out.println("Wohnort: " + place);
    }
}
