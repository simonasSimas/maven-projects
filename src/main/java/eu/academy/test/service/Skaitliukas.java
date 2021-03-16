package eu.academy.test.service;

public class Skaitliukas {
    protected static String n="000";
    private final String pradineReiksme = n;

    protected void didintiVienetu(){
        int skaitliukoReiksme = Integer.parseInt(n);
        String skaitliukoReiksmeString = "" +skaitliukoReiksme;
        if (skaitliukoReiksme<999) {
            if (skaitliukoReiksmeString.length() == 3) {
                skaitliukoReiksme += 1;
                n=("" + skaitliukoReiksme);
            }else if (skaitliukoReiksmeString.length()==2){
                skaitliukoReiksme += 1;
                n=("0" + skaitliukoReiksme);
            }else if (skaitliukoReiksmeString.length()==1){
                skaitliukoReiksme += 1;
                n=("00" + skaitliukoReiksme);
            }
        }

    }

    protected void nustatytiNumatytajaReiksme(){
        n=(pradineReiksme);
    }

}
