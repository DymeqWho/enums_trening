package treningEnum;

public enum ListaSklepow {

    LIDL, ZABKA, BIEDRONKA, LEWIATAN, SPOLEM;

    public void getLidl() {
        System.out.println("to jest kurwa lidl");
    }

    public void getZabka() {
        System.out.println("to jest kurwa zabka");
    }

    public void switchSklepy() {
        switch (this) {
            case BIEDRONKA:
                System.out.println("BIEDRONKA =  + BIEDRONKA");
                break;
            case LIDL:
                System.out.print("Lidl ");
                getLidl();
                break;
            case ZABKA:
                System.out.println("ZABKA =  + ZABKA");
                getZabka();
                break;
            case LEWIATAN:
                System.out.println("LEWIATAN = LEWIATAN");
                break;
            case SPOLEM:
                System.out.println("SPOLEM = SPOLEM");
                break;
            default:
                System.out.println("Nie ma tego sklepu na liście");
                break;
        }
    }
}
