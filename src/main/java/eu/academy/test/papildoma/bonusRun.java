package eu.academy.test.papildoma;

import java.util.function.Consumer;

public class bonusRun {
    public static void main(String[] args) {
        Consumer<FIleReader> consumer = new Consumer<FIleReader>() {
            @Override
            public void accept(FIleReader fIleReader) {
                for (Person p : fIleReader.copyList()){
                    System.out.println("Id: " + p.getId() + ", Name: " + p.getName() + ", Last name: " + p.getLastName());
                }
            }
        };
        FIleReader fIleReader = new FIleReader();
        consumer.accept(fIleReader);
    }
}
