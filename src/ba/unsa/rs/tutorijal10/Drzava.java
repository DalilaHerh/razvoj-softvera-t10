package ba.unsa.rs.tutorijal10;

import java.io.Serializable;

public class Drzava implements Serializable {
    private String naziv;
    private int brojstanovnika;
    private double povrsina;
    private String jedinicaZaPovrsinu;
    private Grad glavniGrad;

    public Drzava() {
    }

    public Drzava(String naziv, int brojstanovnika, double povrsina, String jedinicaZaPovrsinu, Grad glavniGrad) {
        this.naziv = naziv;
        this.brojstanovnika = brojstanovnika;
        this.povrsina = povrsina;
        this.jedinicaZaPovrsinu = jedinicaZaPovrsinu;
        this.glavniGrad = glavniGrad;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getBrojstanovnika() {
        return brojstanovnika;
    }

    public void setBrojstanovnika(int brojstanovnika) {
        this.brojstanovnika = brojstanovnika;
    }

    public double getPovrsina() {
        return povrsina;
    }

    public void setPovrsina(double povrsina) {
        this.povrsina = povrsina;
    }

    public String getJedinicaZaPovrsinu() {
        return jedinicaZaPovrsinu;
    }

    public void setJedinicaZaPovrsinu(String jedinicaZaPovrsinu) {
        this.jedinicaZaPovrsinu = jedinicaZaPovrsinu;
    }

    public Grad getGlavniGrad() {
        return glavniGrad;
    }

    public void setGlavniGrad(Grad glavniGrad) {
        this.glavniGrad = glavniGrad;
    }

    @Override
    public String toString() {
        return naziv + " " + povrsina + " " + brojstanovnika + " " + glavniGrad;
    }
}
