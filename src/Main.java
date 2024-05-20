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

    // ------------------------------ ARRAYS -----------------------------

    String[] stringArray = {"La", "lunghezza", "della", "stringa", "è"}; // Array di 5 stringhe
    // già inizializzato
    // String[] stringArray = new String[5];
    // Array di 5 stringhe non inizializzato ("vuoto", cioè tutti gli elementi sono
    // null)
    int[] numbersArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    System.out.println("Il primo elemento è: " + numbersArray[0]);
    System.out.println("Il secondo elemento è: " + numbersArray[1]);
    System.out.println("Il terzo elemento è: " + numbersArray[2]);
    System.out.println("L'ultimo elemento è: " + numbersArray[9]);
    System.out.println("L'ultimo elemento è: " + numbersArray[numbersArray.length - 1]);
    // Se cerco di accedere ad un elemento al di fuori della dimensione dell'array otterrò una
    // brutta eccezione

    for (int i = 0; i < stringArray.length; i++) {
      System.out.println("Elemento corrente è: " + stringArray[i]);
      System.out.println("L'indice corrente è: " + i);
    }
  }
}
