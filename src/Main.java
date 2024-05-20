public class Main {
  public static void main(String[] args) {
    System.out.println("Ciao a tutti");
    System.out.println("Bla bla bla");

    // ----------------------------------- TIPI PRIMITIVI -------------------------------
    boolean myBoolean = true;
    myBoolean = false;
    // myBoolean = "asdiojasdjoasd"; <-- Non posso assegnare un valore String ad una variabile
    // Booleana

    // ------------------------------ NUMERI INTERI -----------------------------

    byte numeroPiccolo = 100;
    short numeroUnPoMenoPiccolo = 1000;
    int numeroIntero = Integer.parseInt("10000");
    long numeroInteroMaGrandissimo = 10000000;

    // numeroInteroMaGrandissimo = numeroPiccolo;
    System.out.println(numeroInteroMaGrandissimo);
    // <-- Java fa una conversione automatica tra byte e long. Es di CASTING
    // IMPLICITO, ovvero
    // una conversione automatica fatta direttamente da Java stesso quando i formati sono
    // compatibili.

    numeroPiccolo = (byte) numeroInteroMaGrandissimo;
    System.out.println(numeroPiccolo);
    // <-- Il viceversa non può gestirlo Java convertendo perché
    // non ha molto senso mettere un numero enorme in una scatola piccolissima. (byte) si chiama
    // CASTING ESPLICITO, ovvero una conversione forzata tra 2 formati non compatibili tra di loro
    // Non sempre però rappresenta una buona idea: in questo caso ad esempio abbiamo una perdita di
    // dati

    // ------------------------------ NUMERI DECIMALI -----------------------------
    double numDecimale = 0.5;
    float altroDecimale = 0.5f;
    // Entrambi rappresentano numeri decimali però come "regola" utilizzeremo sempre i double in
    // quanto sono ottimizzati per i processori attuali
    System.out.println(numDecimale);

    // ------------------------------ SRINGHE -----------------------------
    char carattereSingolo = 'A'; // Per memorizzare un carattere singolo meglio usare i char
    String piuCaratteri = "Ciao a tutti";
    System.out.println("La lunghezza della stringa è: " + piuCaratteri.length());
    System.out.println(piuCaratteri.toUpperCase());
    System.out.println("La stringa inizia con:" + piuCaratteri.charAt(0));
  }
}
