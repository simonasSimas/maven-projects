package eu.academy.test.model;


public class Person {
    private int id;
    private String name;
    private String lastName;
    private long receivedMoney;
    private long sentMoney;

    public Person(int id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setReceivedMoney(long amount){
        this.receivedMoney = +amount;
    }

    public void setSentMoney(long amount){
        this.sentMoney+=amount;
    }

    public long getReceivedMoney(){
        return receivedMoney;
    }

    public long getSentMoney(){
        return sentMoney;
    }
}
