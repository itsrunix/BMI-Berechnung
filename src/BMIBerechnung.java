import java.util.Scanner; // Scanner-Klasse importieren, um die Benutzereingaben zu ermöglichen)

public class BMIBerechnung {
    public static void main(String[] args) {
        // Hier erstelle ich das Scanner-Objekt um die Eingaben zu lesen
        Scanner eingabe = new Scanner(System.in);

        // Benutzerabfrage für das Gewicht in kg
        System.out.print("Ihr Gewicht in kg: ");
        double gewicht = eingabe.nextDouble(); // Liest und speichert die Eingabe als Dezimalzahl durch 'double'

        // Benutzabfrage für die Größe in m
        System.out.print("Ihre Größe in m");
        double groesse = eingabe.nextDouble(); // Liest und speichert die Eingabe als Dezimalzahl durch 'double'

        // BMI Berechnung nach Formel: Gewicht / (Größe x Größe)
        double bmi = gewicht / (groesse * groesse);

        // BMI ausgeben als Dezimalzahl (X,XX)
        System.out.printf("Ihr BMI beträgt: %.2f%n", bmi);

        // Scanner schließen und Aufgabe erledigt
        eingabe.close();
    }
}
