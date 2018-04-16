public class Produkt {
    private String nazwaProduktu;
    private double cenaProduktuNetto;
    private PodatekProduktu iloscPodatku;

    public Produkt() {
    }

    public String getNazwaProduktu() {
        return nazwaProduktu;
    }

    public void setNazwaProduktu(String nazwaProduktu) {
        this.nazwaProduktu = nazwaProduktu;
    }

    public double getCenaProduktuNetto() {
        return cenaProduktuNetto;
    }

    public void setCenaProduktuNetto(double cenaProduktuNetto) {
        this.cenaProduktuNetto = cenaProduktuNetto;
    }

    public PodatekProduktu getIloscPodatku() {
        return iloscPodatku;
    }

    public void setIloscPodatku(PodatekProduktu iloscPodatku) {
        this.iloscPodatku = iloscPodatku;
    }

    public Produkt(String nazwaProduktu, double cenaProduktuNetto, PodatekProduktu iloscPodatku) {
        this.nazwaProduktu = nazwaProduktu;
        this.cenaProduktuNetto = cenaProduktuNetto;
        this.iloscPodatku = iloscPodatku;
    }

    public double podajCeneBrutto() {
        if (iloscPodatku == PodatekProduktu.VAT5) {
            return cenaProduktuNetto + (cenaProduktuNetto * iloscPodatku.getWartoscPodatku());
        }
        if (iloscPodatku == PodatekProduktu.VAT8) {
            return cenaProduktuNetto + (cenaProduktuNetto * iloscPodatku.getWartoscPodatku());
        }
        if (iloscPodatku == PodatekProduktu.VAT23) {
            return cenaProduktuNetto + (cenaProduktuNetto * iloscPodatku.getWartoscPodatku());
        }
        if (iloscPodatku == PodatekProduktu.NO_VAT){
            return cenaProduktuNetto + (cenaProduktuNetto * iloscPodatku.getWartoscPodatku());
        }
         return 0.00;

    }

    @Override
    public String toString() {
        return "Produkt{" +
                "nazwaProduktu='" + nazwaProduktu + '\'' +
                ", cenaProduktuNetto=" + cenaProduktuNetto +
                ", iloscPodatku=" + iloscPodatku +
                '}';
    }
}
