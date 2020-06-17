package nl.capgemini.demo;

import java.util.ArrayList;

public class Stamboom {
    private ArrayList<Kind> kinderen;
    private Vader vader;
    private Moeder moeder;
    private ArrayList<Opa> opas;
    private ArrayList<Oma> omas;

    public Stamboom(ArrayList<Kind> kinderen, Vader vader, Moeder moeder, ArrayList<Opa> opas, ArrayList<Oma> omas) {
        this.kinderen = kinderen;
        this.vader = vader;
        this.moeder = moeder;
        this.opas = opas;
        this.omas = omas;
    }

    public ArrayList<Kind> getKinderen() {
        return kinderen;
    }

    public void setKinderen(ArrayList<Kind> kinderen) {
        this.kinderen = kinderen;
    }

    public Vader getVader() {
        return vader;
    }

    public void setVader(Vader vader) {
        this.vader = vader;
    }

    public Moeder getMoeder() {
        return moeder;
    }

    public void setMoeder(Moeder moeder) {
        this.moeder = moeder;
    }

    public ArrayList<Opa> getOpas() {
        return opas;
    }

    public void setOpas(ArrayList<Opa> opas) {
        this.opas = opas;
    }

    public ArrayList<Oma> getOmas() {
        return omas;
    }

    public void setOmas(ArrayList<Oma> omas) {
        this.omas = omas;
    }
}
