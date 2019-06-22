package ba.unsa.rs.tutorijal10;

import java.io.Serializable;
import java.util.Arrays;

public class Grad implements Serializable {

    private String naziv;
    private int brojStanovnika;
    private double [] temperature = new double[1000];

    private int brojMjerenja = 0;

    public Grad() {
    }

    public Grad(String nazivGrada, int glavniBrojStanovnika, double[] mjerenja, int broj) {

        this.naziv = nazivGrada;
        this.brojStanovnika = glavniBrojStanovnika;
        this.temperature = mjerenja;
        this.brojMjerenja = broj;
    }

    public Grad(String name, double [] mjerenja, int brojac){
        naziv = name;
        brojStanovnika = 0;
        temperature = mjerenja;
        brojMjerenja = brojac;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getBrojStanovnika() {
        return brojStanovnika;
    }

    public void setBrojStanovnika(int brojStanovnika) {
        this.brojStanovnika = brojStanovnika;
    }

    public double[] getTemperature() {
        return temperature;
    }

    public void setTemperature(double[] temperature) {
        this.temperature = temperature;
    }

    public int getBrojMjerenja() {
        return brojMjerenja;
    }

    public void setBrojMjerenja(int brojMjerenja) {
        this.brojMjerenja = brojMjerenja;
    }

    @Override
    public String toString() {
        return "Grad{" + "naziv='" + '\'' + ", brojStanovnika=" + brojStanovnika + ", temperature=" + Arrays.toString(temperature) + ", brojMjerenja=" + brojMjerenja + '}';
    }
}
