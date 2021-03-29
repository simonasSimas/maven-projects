package eu.academy.test.basic.basicPvz;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class Adress {
    @JsonIgnoreProperties(ignoreUnknown = true)
    private  Country country;
    private  String city;
    private String houseNr;

    public Adress() {
    }

    public Adress(Country country, String city, String houseNr) {
        this.country = country;
        this.city = city;
        this.houseNr = houseNr;
    }

    public Country getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getHouseNr() {
        return houseNr;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "country=" + country +
                ", city='" + city + '\'' +
                ", houseNr='" + houseNr + '\'' +
                '}';
    }
}
