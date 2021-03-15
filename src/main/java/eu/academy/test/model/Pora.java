package eu.academy.test.model;

public class Pora<T1, T2> {
    private T1 raktas;
    private T2 reiksme;

    public Pora(T1 raktas, T2 reiksme) {
        this.raktas = raktas;
        this.reiksme = reiksme;
    }

    public Object getRaktas() {
        return raktas;
    }

    public void setRaktas(T1 raktas) {
        this.raktas = raktas;
    }

    public Object getReiksme() {
        return reiksme;
    }

    public void setReiksme(T2 reiksme) {
        this.reiksme = reiksme;
    }
}
