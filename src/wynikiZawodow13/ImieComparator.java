package wynikiZawodow13;
import java.util.Comparator;

public class ImieComparator implements Comparator<Wynik> {

    @Override
    public int compare(Wynik o1, Wynik o2) {
    return o1.getFirstName().compareTo(o2.getFirstName());
    }

}
