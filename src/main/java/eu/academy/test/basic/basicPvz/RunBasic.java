package eu.academy.test.basic.basicPvz;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;

public class RunBasic {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        Adress adress = new Adress(Country.LIETUVA,"Vilnius", "33");

        File addressJsonFile = new File("target/addressJsonFile.json");
        mapper.writeValue(addressJsonFile, adress);

        Adress adressFromJsonFile = mapper.readValue(new File("target/ReadFromJson.json"),Adress.class);
        System.out.println(adressFromJsonFile.toString());
    }
}
