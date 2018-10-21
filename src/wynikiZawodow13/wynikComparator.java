package wynikiZawodow13;

import java.util.Comparator;

public class wynikComparator implements Comparator<Wynik> {

    @Override
    public int compare(Wynik o1, Wynik o2) {
        if(o1.getOdleglosc() == o2.getOdleglosc()){
        return 0;
        } else if (o1.getOdleglosc() > o2.getOdleglosc()) {
        return 1;
        } else {
        return-1;
        }
    }

}
