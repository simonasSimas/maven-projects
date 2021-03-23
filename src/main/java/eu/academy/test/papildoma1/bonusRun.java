package eu.academy.test.papildoma1;

import java.util.function.Consumer;

public class bonusRun {
    public static void main(String[] args) {
        Consumer<FileReader> consumer = fileReader -> {
            for (Person p : fileReader.copyList()){
                System.out.println("Id: " + p.getId() + ", Name: " + p.getName() + ", Last name: " + p.getLastName());
            }
        };
        FileReader fIleReader = new FileReader();
        consumer.accept(fIleReader);
    }
}
