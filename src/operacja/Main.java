package operacja;

public class Main {
    public static void main(String[] args) {

        Operacja dzialanieACosB = Operacja.DODAWANIE;
        dzialanieACosB = Operacja.MNOZENIE;
        dzialanieACosB = Operacja.DZIELENIE;
        dzialanieACosB = Operacja.ODEJMOWANIE;

        System.out.println(dzialanieACosB.jakiesDzialanie(2.59, 3));


    }
}