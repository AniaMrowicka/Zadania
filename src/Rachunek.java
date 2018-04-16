import java.util.ArrayList;
import java.util.List;

public class Rachunek {
    List<Produkt> listaZakupionychProduktow = new ArrayList<>();
    Produkt pizzaCapriciosa = new Produkt("pizza Capriciosa", 13.00, PodatekProduktu.VAT8);
    Produkt pizzaHawajska = new Produkt("pizza Hawajska", 15.00, PodatekProduktu.VAT23);
    Produkt pizzaDiavola = new Produkt("pizza Diavola", 20.00, PodatekProduktu.VAT5);
    Produkt pizzaNeapolitana = new Produkt("pizza Neapolitana", 17.00, PodatekProduktu.VAT8);
    Produkt cocaCola = new Produkt("Coca Cola", 5.00, PodatekProduktu.VAT23);
    Produkt dowoz = new Produkt("dowoz", 2.00, PodatekProduktu.NO_VAT);

    public List<Produkt> getListaZakupionychProduktow() {
        return listaZakupionychProduktow;
    }

    public void wypiszRachunek() {
        listaZakupionychProduktow.add(pizzaCapriciosa);
        listaZakupionychProduktow.add(cocaCola);
        listaZakupionychProduktow.add(pizzaDiavola);
        listaZakupionychProduktow.add(dowoz);
        for (Produkt rachunek : listaZakupionychProduktow) {
            System.out.println("Rachunek to: " + rachunek);
        }
    }

    public double podsumujRachunekNetto() {
        int suma = 0;
        for (Produkt rachunekNetoo : listaZakupionychProduktow) {
            rachunekNetoo.getCenaProduktuNetto();
            suma += rachunekNetoo.getCenaProduktuNetto();
        }
        return suma;
    }

    public double podsumujRachunekBrutto() {
        int sumaB = 0;
        for (Produkt rachunekBrutto : listaZakupionychProduktow) {
            rachunekBrutto.podajCeneBrutto();
            sumaB += rachunekBrutto.podajCeneBrutto();
        }
        return sumaB;
    }

    public double zwrocWartoscPodatku() {
        int suma = 0;
        int sumaBrutto = 0;
        int roznicaCen = 0;
        for (Produkt brutto : listaZakupionychProduktow) {
            brutto.podajCeneBrutto();
            sumaBrutto += brutto.podajCeneBrutto();
        }
        for (Produkt cenaNetto : listaZakupionychProduktow) {
            cenaNetto.getCenaProduktuNetto();
            suma += cenaNetto.getCenaProduktuNetto();
        }
        roznicaCen = sumaBrutto - suma;
        return roznicaCen;


    }
}
