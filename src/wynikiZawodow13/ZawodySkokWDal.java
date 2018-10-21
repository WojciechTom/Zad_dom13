package wynikiZawodow13;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class ZawodySkokWDal {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        List<Wynik> wyniki = pobierzDane();
        sortuj(wyniki);
        zapisz("Wyniki", wyniki);

    }




    public static List<Wynik> pobierzDane() {
        List<Wynik> wyniki = new ArrayList<>();

        System.out.println("Prosze wprowadzić zawodnika i jego wynik IMIĘ/NAZWISKO/WYNIK  lub zakończyć wpisując STOP");

        String linia = null;
        while (!(linia = scan.nextLine()).equals("STOP")) {
            String[] wiersz = linia.split("/");
            try {
                wyniki.add(new Wynik(wiersz[0], wiersz[1], Double.parseDouble(wiersz[2])));
                System.out.println("Zawodnik wprowadzony. Prosze wprowadzić zawodnika i jego wynik IMIĘ/NAZWISKO/WYNIK  lub zakończyć wpisując STOP");
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Proszę wprowadzić dane w poprawnym formcaie");
            }

        }
        return wyniki;
    }



    public static void sortuj(List<Wynik> lista) {

        //System.out.println("Proszę podać sposób sorotwania:\nIMIE -> wpisz I\nNAZWISKO -> wpisz N\nWYNIK -> wpisz W ");
        String parametr = null;
        do {
            System.out.println("Proszę podać sposób sorotwania:\nIMIE -> wpisz I\nNAZWISKO -> wpisz N\nWYNIK -> wpisz W ");
        } while (!((parametr = scan.nextLine()).equals("I") || parametr.equals("N") || (parametr.equals("W") )));


        if (parametr.equals("I")) {
            Collections.sort(lista, new imieComparator());
        } else if (parametr.equals("N")) {
            Collections.sort(lista, new nazwiskoComparator());
        } else if (parametr.equals("W")) {
            Collections.sort(lista, new wynikComparator());
        } else {
            System.out.println("Niepoprawny parametr sortowania");
        }
    }



    public static void zapisz(String nazwa, List<Wynik> lista) throws IOException {

        File plik = new File(nazwa + ".csv");

        if (!plik.exists()) {
            plik.createNewFile();
        }

        FileWriter fw = new FileWriter(plik);
        BufferedWriter bw = new BufferedWriter(fw);

        for (int i = 0; i < lista.size(); i++) {
            String wiersz = lista.get(i).getFirstName() + ";" + lista.get(i).getLastName() + ";" + lista.get(i).getOdleglosc() + "\n";
            bw.write(wiersz);
        }
        bw.close();
        System.out.println("Zapisano dane w pliku " + nazwa + ".csv");
    }

}
