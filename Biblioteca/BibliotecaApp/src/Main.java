import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);
    public static Biblioteca biblioteca;

    public static void main(String[] args) throws Exception {

        biblioteca = new Biblioteca();
        
        int scelta;
        do {

            visualizzaOpzioni();

            scelta = leggiIntero();
            riga();

            switch (scelta) {
                case 1:
                    stampaLibriDisponibili();
                    break;
                case 2:
                    prestaLibro();
                    break;
                case 3:
                    restituisciLibro();
                    break;
                case 4:
                    aggiungiLibro();
                    break;
                case 0:
                    System.out.println("Arrivederci!");
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
                    break;

            }

        } while (scelta != 0);

        in.close();
    }

    private static void aggiungiLibro() {
        // TODO Auto-generated method stub
    }

    private static void restituisciLibro() {
        // TODO Auto-generated method stub
    }

    private static void prestaLibro() {
        // TODO Auto-generated method stub
    }

    private static void stampaLibriDisponibili() {
        // TODO Auto-generated method stub
    }

    private static void riga() {
        System.out.println("....................................");
    }

    private static int leggiIntero() {

        int n = 0;

        try {
            n = in.nextInt();
            in.nextLine();
        } catch (InputMismatchException e) {
            in.nextLine();
            System.out.println("ERRORE: valore non valido");
            System.out.println("Inserisci nuovo valore");
            n = leggiIntero();
        }

        return n;
    }

    private static void visualizzaOpzioni() {

        System.out.println("\n--- Menu: ---");
        System.out.println("1. Visualizzare i libri disponibili");
        System.out.println("2. Prendere in prestito un libro");
        System.out.println("3. Restituire un libro");
        System.out.println("4. Aggiungere un libro alla lista dei libri disponibili");
        System.out.println("0. Esci");
        System.out.print("Scegli un'opzione: ");
    }
}
