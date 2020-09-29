package operacja;

public enum Operacja {
    DODAWANIE, ODEJMOWANIE, DZIELENIE, MNOZENIE;

    public double jakiesDzialanie(double a, double b) {
        switch (this) {
            case DODAWANIE:
                return a + b;
            case ODEJMOWANIE:
                return a - b;
            case DZIELENIE:
                return a / b;
            case MNOZENIE:
                return a * b;
            default:
                return -1;
        }
    }
}
