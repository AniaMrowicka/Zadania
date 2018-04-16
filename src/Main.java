public class Main {
    public static void main(String[] args) {
        Rachunek nowyRachunek = new Rachunek();
        nowyRachunek.wypiszRachunek();
        System.out.println("Suma rachunku netto wynosi: " + nowyRachunek.podsumujRachunekNetto() + " zł");
        System.out.println("Suma rachunku brutto wynosi: " + nowyRachunek.podsumujRachunekBrutto() + " zł");
        System.out.println("Różnica między ceną brutto a netto wynosi: " + nowyRachunek.zwrocWartoscPodatku() + " zł");
            }
}
