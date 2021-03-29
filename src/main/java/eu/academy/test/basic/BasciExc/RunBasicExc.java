package eu.academy.test.basic.BasciExc;

import com.fasterxml.jackson.databind.ObjectMapper;
import eu.academy.test.basic.BasciExc.thirdExc.Company;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class RunBasicExc {
    public static void main(String[] args) throws IOException {
        //first part

//        Sender sender = new Sender();
//        sender.setName("aaa");
//        sender.setLastName("bbb");
//        Receiver receiver = new Receiver();
//        receiver.setName("ccc");
//        receiver.setLastName("ddd");
//        Payment payment = new Payment(sender, receiver);
//        ObjectMapper mapper = new ObjectMapper();
//        File serializationFile = new File("target/firstExcSerialization");
//        mapper.writeValue(serializationFile, payment);
//        Payment paymentDeserialization = mapper.readValue(serializationFile, Payment.class);
//        System.out.println(paymentDeserialization.toString());

        //second part

//        Sender sender = new Sender();
//        sender.setName("aaa");
//        sender.setLastName("bbb");
//        Receiver receiver = new Receiver();
//        receiver.setName("ccc");
//        receiver.setLastName("ddd");
//        Payment payment = new Payment(sender, receiver);
//        ObjectMapper mapper = new ObjectMapper();
//        File serializationFile = new File("target/firstExcSerialization.json");
//        mapper.writeValue(serializationFile, payment);
//        Payment paymentDeserialization = mapper.readValue(serializationFile, Payment.class);
//        System.out.println(mapper.writeValueAsString(paymentDeserialization));

        //third part

//        ObjectMapper mapper = new ObjectMapper();
//        List<Company> listOfCompanies = Company.generatedListOfOneHundredCompanies();
//        File file = new File("target/company_list.json");
//        mapper.writeValue(file, listOfCompanies);
    }
}
