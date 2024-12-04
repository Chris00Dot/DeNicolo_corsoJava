/**
 * Classe che rappresenta un libro con attributi relativi al titolo, autore,
 * anno di pubblicazione, numero di copie totali e stato di prestito.
 */
public class Libro {

    /** Il titolo del libro. */
    private String titolo;

    /** L'autore del libro. */
    private String autore;

    /** L'anno di pubblicazione del libro. */
    private int annoPubblicazione;

    /** Il numero totale di copie disponibili del libro. */
    private int numCopieTot;

    /** Il numero di copie attualmente prestate. */
    private int numCopiePrestate;

    /** Indica se il libro è attualmente in prestito. */
    private boolean isPrestato;

    /** Costruttore di default. */
    public Libro() {
    }

    /**
     * Costruttore che inizializza il libro con i dati forniti.
     *
     * @param titolo            il titolo del libro
     * @param autore            l'autore del libro
     * @param annoPubblicazione l'anno di pubblicazione del libro
     * @param numCopieTot       il numero totale di copie disponibili
     */
    public Libro(String titolo, String autore, int annoPubblicazione, int numCopieTot) {
        super();
        this.titolo = titolo;
        this.autore = autore;
        this.annoPubblicazione = annoPubblicazione;
        this.numCopieTot = numCopieTot;
        this.numCopiePrestate = 0;
        this.isPrestato = false;
    }

    /**
     * Restituisce il titolo del libro.
     *
     * @return il titolo del libro
     */
    public String getTitolo() {
        return titolo;
    }

    /**
     * Imposta il titolo del libro.
     *
     * @param titolo il nuovo titolo del libro
     */
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    /**
     * Restituisce l'autore del libro.
     *
     * @return l'autore del libro
     */
    public String getAutore() {
        return autore;
    }

    /**
     * Imposta l'autore del libro.
     *
     * @param autore il nuovo autore del libro
     */
    public void setAutore(String autore) {
        this.autore = autore;
    }

    /**
     * Restituisce l'anno di pubblicazione del libro.
     *
     * @return l'anno di pubblicazione
     */
    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    /**
     * Imposta l'anno di pubblicazione del libro.
     *
     * @param annoPubblicazione il nuovo anno di pubblicazione
     */
    public void setAnnoPubblicazione(int annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    /**
     * Restituisce il numero totale di copie disponibili.
     *
     * @return il numero totale di copie
     */
    public int getNumCopieTot() {
        return numCopieTot;
    }

    /**
     * Imposta il numero totale di copie disponibili.
     *
     * @param numCopieTot il nuovo numero totale di copie
     */
    public void setNumCopieTot(int numCopieTot) {
        this.numCopieTot = numCopieTot;
    }

    /**
     * Verifica se il libro è attualmente in prestito.
     *
     * @return true se il libro è in prestito, false altrimenti
     */
    public boolean isPrestato() {
        return isPrestato;
    }

    /**
     * Imposta lo stato di prestito del libro.
     *
     * @param isPrestato true se il libro è in prestito, false altrimenti
     */
    public void setPrestato(boolean isPrestato) {
        this.isPrestato = isPrestato;
    }

    /**
     * Restituisce il numero di copie attualmente prestate.
     *
     * @return il numero di copie prestate
     */
    public int getNumCopiePrestate() {
        return numCopiePrestate;
    }

    /**
     * Imposta il numero di copie attualmente prestate.
     *
     * @param numCopiePrestate il nuovo numero di copie prestate
     */
    public void setNumCopiePrestate(int numCopiePrestate) {
        this.numCopiePrestate = numCopiePrestate;
    }

    /**
     * Restituisce una rappresentazione in formato stringa dell'oggetto.
     *
     * @return una stringa che rappresenta l'oggetto
     */
    @Override
    public String toString() {
        return super.toString();
    }
}