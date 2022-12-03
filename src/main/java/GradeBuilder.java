public class GradeBuilder {
    final String ime;
    double kvizovi = 0;
    double zadace = 0;
    double parcijalni = 0;
    double zavrsni = 0;
    double projekat = 0;
    double usmeni = 0;
    double prisustvo = 0;
    double aktivnost = 0;

    public GradeBuilder(String val){
        ime = val;
    }

    public Grade build() {
        return new Grade(this);
    }

    public GradeBuilder kvizovi(double val) {
        kvizovi = val;
        return this;
    }

    public GradeBuilder zadace(double val) {
        zadace = val;
        return this;
    }

    public GradeBuilder parcijalni(double val) {
        parcijalni = val;
        return this;
    }

    public GradeBuilder zavrsni(double val) {
        zavrsni = val;
        return this;
    }

    public GradeBuilder projekat(double val) {
        projekat = val;
        return this;
    }

    public GradeBuilder usmeni(double val) {
        usmeni = val;
        return this;
    }

    public GradeBuilder prisustvo(double val) {
        prisustvo = val;
        return this;
    }

    public GradeBuilder aktivnost(double val) {
        aktivnost = val;
        return this;
    }
}
