import java.util.ArrayList;

/**
 * Classe che rappresenta una biblioteca, gestendo i libri disponibili e quelli
 * in prestito.
 */
public class Biblioteca {

    /** Elenco dei libri disponibili nella biblioteca. */
    private ArrayList<Libro> libriDisponibili;

    /** Elenco dei libri attualmente in prestito. */
    private ArrayList<Libro> libriPrestito;

    /**
     * Costruttore di default che inizializza le liste dei libri.
     */
    public Biblioteca() {
        libriDisponibili = new ArrayList<>();
        libriPrestito = new ArrayList<>();
    }

    /**
     * Restituisce l'elenco dei libri disponibili nella biblioteca.
     *
     * @return una lista di libri disponibili
     */
    public ArrayList<Libro> getLibriDisponibili() {
        return libriDisponibili;
    }

    /**
     * Restituisce l'elenco dei libri attualmente in prestito.
     *
     * @return una lista di libri in prestito
     */
    public ArrayList<Libro> getLibriPrestito() {
        return libriPrestito;
    }

    /**
     * Presta un libro dalla biblioteca.
     *
     * @param libro il libro da prestare
     * @return una stringa che indica il risultato dell'operazione
     */
    public String prestaLibro(Libro libro) {
        String result = "";
        for (int i = 0; i < libriDisponibili.size(); i++) {
            if (libriDisponibili.get(i).equals(libro)) {
                libro.setNumCopieTot(libro.getNumCopieTot() - 1);
                libro.setNumCopiePrestate(libro.getNumCopiePrestate() + 1);
                rimuoviLibro(libro);
                aggiungiLibroPrestato(libro);
                libro.setPrestato(true);
                result = "Il libro è stato prestato con successo";
            } else {
                result = "Il libro non è disponibile";
            }
        }
        return result;
    }

    /**
     * Restituisce un libro alla biblioteca.
     *
     * @param libro il libro da restituire
     * @return una stringa che indica il risultato dell'operazione
     */
    public String restituisciLibro(Libro libro) {
        String result = "";
        for (int i = 0; i < libriPrestito.size(); i++) {
            if (libriPrestito.get(i).equals(libro)) {
                libro.setNumCopieTot(libro.getNumCopieTot() + 1);
                libro.setNumCopiePrestate(libro.getNumCopiePrestate() - 1);
                aggiungiLibro(libro);
                rimuoviLibroPrestato(libro);
                libro.setPrestato(false);
                result = "Il libro è stato restituito con successo";
            } else {
                result = "Il libro non è mai stato preso in prestito";
            }
        }
        return result;
    }

    /**
     * Aggiunge un libro all'elenco dei libri disponibili.
     *
     * @param libro il libro da aggiungere
     */
    public void aggiungiLibro(Libro libro) {
        libriDisponibili.add(libro);
    }

    /**
     * Rimuove un libro dall'elenco dei libri disponibili.
     *
     * @param libro il libro da rimuovere
     */
    public void rimuoviLibro(Libro libro) {
        libriDisponibili.remove(libro);
    }

    /**
     * Aggiunge un libro all'elenco dei libri in prestito.
     *
     * @param libro il libro da aggiungere
     */
    public void aggiungiLibroPrestato(Libro libro) {
        libriPrestito.add(libro);
    }

    /**
     * Rimuove un libro dall'elenco dei libri in prestito.
     *
     * @param libro il libro da rimuovere
     */
    public void rimuoviLibroPrestato(Libro libro) {
        libriPrestito.remove(libro);
    }

    /**
     * Restituisce una stringa contenente l'elenco dei libri disponibili.
     *
     * @return una stringa con i dettagli dei libri disponibili
     */
    public String StampaLibriDisponibili() {
        String res = "";

        if (libriDisponibili.isEmpty())
            res = "Nessun libro nella biblioteca";

        for (int i = 0; i < libriDisponibili.size(); i++)
            if (libriDisponibili.get(i).getNumCopieTot() > 0)
                res += i + ") " + libriDisponibili.get(i).toString();

        return res;
    }

    /**
     * Restituisce una rappresentazione in formato stringa dell'elenco dei libri
     * disponibili.
     *
     * @return una stringa che rappresenta i libri disponibili
     */
    @Override
    public String toString() {
        String res = "";

        if (libriDisponibili.isEmpty())
            return "Nessun libro nella biblioteca";

        for (int i = 0; i < libriDisponibili.size(); i++)
            res += i + ") " + libriDisponibili.get(i).toString();

        return res;
    }
}