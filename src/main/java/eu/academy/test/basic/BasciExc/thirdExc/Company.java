package eu.academy.test.basic.BasciExc.thirdExc;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Company {
    private String imonesPavadinimas;
    private String imonesKodas;
    private int darbuotojuSkaicius;
    private int vidutinisAtlygis;

    public Company(String imonesPavadinimas, String imonesKodas, int darbuotojuSkaicius, int vidutinisAtlygis) {
        this.imonesPavadinimas = imonesPavadinimas;
        this.imonesKodas = imonesKodas;
        this.darbuotojuSkaicius = darbuotojuSkaicius;
        this.vidutinisAtlygis = vidutinisAtlygis;
    }

    public Company() {
    }

    public String getImonesPavadinimas() {
        return imonesPavadinimas;
    }

    public void setImonesPavadinimas(String imonesPavadinimas) {
        this.imonesPavadinimas = imonesPavadinimas;
    }

    public String getImonesKodas() {
        return imonesKodas;
    }

    public void setImonesKodas(String imonesKodas) {
        this.imonesKodas = imonesKodas;
    }

    public int getDarbuotojuSkaicius() {
        return darbuotojuSkaicius;
    }

    public void setDarbuotojuSkaicius(int darbuotojuSkaicius) {
        this.darbuotojuSkaicius = darbuotojuSkaicius;
    }

    public int getVidutinisAtlygis() {
        return vidutinisAtlygis;
    }

    public void setVidutinisAtlygis(int vidutinisAtlygis) {
        this.vidutinisAtlygis = vidutinisAtlygis;
    }

    public static List<Company> generatedListOfOneHundredCompanies(){
        Random random = new Random();
        Faker faker = new Faker();
        List<Company> list  = new ArrayList<>();
        for (int i = 0; i<100; i++){
            list.add(new Company(faker.company().name(),faker.code().asin(),random.nextInt(100),random.nextInt(4000)));
        }
        return list;
    }
}
