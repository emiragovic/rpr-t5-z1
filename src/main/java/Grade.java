public class Grade {
    private final String ime;
    private final double kvizovi;
    private final double zadace;
    private final double parcijalni;
    private final double zavrsni;
    private final double projekat;
    private final double usmeni;
    private final double prisustvo;
    private final double aktivnost;

    public Grade(GradeBuilder builder) {
        ime = builder.ime;
        kvizovi = builder.kvizovi;
        zadace = builder.zadace;
        parcijalni = builder.parcijalni;
        zavrsni = builder.zavrsni;
        projekat = builder.projekat;
        usmeni = builder.usmeni;
        prisustvo = builder.prisustvo;
        aktivnost = builder.aktivnost;
    }

    @Override
    public String toString() {
        double total = kvizovi + zadace + parcijalni + zavrsni + projekat + usmeni + prisustvo + aktivnost;
        return ime + " : " + total + "b";
    }
}
