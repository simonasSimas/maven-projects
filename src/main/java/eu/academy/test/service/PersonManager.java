package eu.academy.test.service;

import eu.academy.test.model.Person;

import java.io.*;
import java.util.*;

public class PersonManager {
    private Map<Integer, Person> map = new HashMap<>();

    public Scanner fileScannerFromPeople() {
        File file = new File("people.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return sc;
    }

    public Scanner fileScannerFromPayments() {
        File file = new File("C:/Users/ahrim/Desktop/payment");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return sc;
    }

    public PrintWriter addToFileFromBiggest() {
        FileWriter fw = null;
        try {
            fw = new FileWriter("frombiggest");
        } catch (IOException e) {
            e.printStackTrace();
        }
        PrintWriter writer = new PrintWriter(fw);
        return writer;
    }

    public PrintWriter addToFileFromSmallest() {
        FileWriter fw = null;
        try {
            fw = new FileWriter("fromsmallest");
        } catch (IOException e) {
            e.printStackTrace();
        }
        PrintWriter writer = new PrintWriter(fw);
        return writer;
    }

    public int getLineCountInPeopleDataFile() {
        Scanner sc = fileScannerFromPeople();
        int lineCount = 0;
        while (sc.hasNextLine()) {
            lineCount++;
            sc.nextLine();
        }
        return lineCount;
    }

    public void createPersonObjectFromPeopleDataLine() {
        Scanner sc = fileScannerFromPeople();
        sc.nextLine();
        int id;
        String name;
        String lastName;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            int comma = line.indexOf(",");
            int nextComma = line.indexOf(",", comma + 1);
            id = Integer.parseInt(line.substring(0, 4));
            name = line.substring(comma + 1, nextComma);
            lastName = line.substring(nextComma + 1);
            map.put(id, new Person(id, name, lastName));
            sc.nextLine();
        }
    }

    public List<String> refractorFileToStringList() {
        ArrayList<String> listPaymentList = new ArrayList<>();
        String line = "";
        try {
            FileInputStream in = new FileInputStream("payment.txt");
            int c;

            for (int i = 0; i < 33; i++) {
                in.read();
            }
            while ((c = in.read()) != -1) {
                String a = String.valueOf((char) c);
                if (!a.equals("\n")) {
                    line = line.concat(a);
                } else {
                    listPaymentList.add(line);
                    line = "";
                }

            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listPaymentList;
    }

    public void addSentAndReceivedAmountsToObject(List<String> list, Map<Integer, Person> map) {
        ArrayList<String> noSpaces = new ArrayList<>();
        String fixed = "";
        int idReceveier;
        int idSender;
        long amount;
        for (String a : list) {
            int lenght = a.length();
            for (int i = 0; i < lenght; i++) {
                if (!(a.charAt(i) == ' ')) {
                    fixed = fixed + a.charAt(i);
                }
            }
            noSpaces.add(fixed);
        }
        for (String a : noSpaces) {
            int firstComma = a.indexOf(",");
            int secondComma = a.indexOf(",", firstComma + 1);
            int thirdComma = a.indexOf(",", secondComma + 1);
            idReceveier = Integer.parseInt(a.substring(secondComma + 1, thirdComma));
            idSender = Integer.parseInt(a.substring(thirdComma + 1));
            amount = Integer.parseInt(a.substring(firstComma + 1, secondComma));
            System.out.println(idReceveier + " " + idSender + " " + amount);
            System.out.println("id rec : " + idReceveier + ", " + "id sender : " + idSender + ", " + "amount : " + amount);
            map.get(idSender).setSentMoney(amount);
            map.get(idReceveier).setReceivedMoney(amount);
        }
    }

    public Map<Integer, Person> getMap() {
        return map;
    }
}
