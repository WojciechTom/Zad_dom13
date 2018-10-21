package wynikiZawodow13;

import java.util.Comparator;

public class NazwiskoComparator implements Comparator<Wynik> {

    @Override
    public int compare(Wynik o1, Wynik o2) {
        return o1.getLastName().compareTo(o2.getLastName());
    }

}
