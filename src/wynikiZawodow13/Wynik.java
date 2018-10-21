package wynikiZawodow13;

public class Wynik {
    private String firstName;
    private String lastName;
    private double odleglosc;

    public Wynik(String firstName, String lastName, double odleglosc) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.odleglosc = odleglosc;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getOdleglosc() {
        return odleglosc;
    }

    public void setOdleglosc(double odleglosc) {
        this.odleglosc = odleglosc;
    }

    @Override
    public String toString() {
        return "Wynik{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", odleglosc=" + odleglosc +
                '}' + "\n";
    }
}


