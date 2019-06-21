package ba.unsa.rs.tutorijal10;

import java.io.Serializable;

public class Grad implements Serializable {

    private String naziv;
    private int brojStanovnika;
    private double [] temperature = new double[1000];
}
