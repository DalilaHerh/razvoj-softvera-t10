package ba.unsa.rs.tutorijal10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Tutorijal {
    public static void main(String[] args) {
}

public static ArrayList<Grad> ucitajGradove(){
     ArrayList<Grad> gradovi = new ArrayList<>();
    Scanner tok = null;

    try{
        tok = new Scanner(new FileReader("mjerenja.txt"));

    } catch (FileNotFoundException e) {
        e.printStackTrace();
        return null;
    }

    double [] mjerenja = new double[1000];
    int brojac = 0;
    String str = "";
    String Name = "";
    while(tok.hasNext()) {
        str = tok.nextLine();
        str = str.replace(',', '\n');
        Scanner Parser = new Scanner(str);
        Name = Parser.nextLine();
        for (int i = 0; Parser.hasNext() && i < 1000; i++, brojac++) {
            mjerenja[i] = Parser.nextDouble();
        }
        gradovi.add(new Grad(Name, mjerenja, brojac));
        brojac = 0;
    }
    return  gradovi;
    }
}
}
