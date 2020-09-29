package treningEnum;

public class Main {
    public static void main(String[] args) {

        ListaSklepow sklepy = ListaSklepow.BIEDRONKA;
        sklepy = ListaSklepow.LIDL;
        //sklepy = ListaSklepow.ZABKA;

sklepy.switchSklepy();

    }
}
