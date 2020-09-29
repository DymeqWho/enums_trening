package pierwiastkiChemiczne;

public enum PierwiastekChemiczny {
    WODOR, TLEN, RTEC;

    private final char wodor = 'H';
    private final char tlen = 'O';
    private final String rtec = "Hg";


    public void convert() {
        for (PierwiastekChemiczny pierwiastek : PierwiastekChemiczny.values()) {
            String pierwiasteczek = Character.toString(wodor);
            if (pierwiastek == WODOR) {
                System.out.println(pierwiasteczek + " = " + pierwiastek);
            } else if (pierwiastek == TLEN) {
                pierwiasteczek = Character.toString(tlen);
                System.out.println(pierwiasteczek + " = " + pierwiastek);
            } else {
                System.out.println(rtec + " = " + pierwiastek);
            }
        }
    }
}
