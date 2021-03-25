package eu.academy.test;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

public class LithuanianOfficialIdProviderTest {
    @BeforeEach
    void init(){
        Counter.setDefaultCounterNumber();
    }

    @Test
    public void generateOfficialId_returnTrueTest1() {
        //given
        OfficialIdProvider provider = new LithuanianOfficialIdProvider();
        Person person = new Person("Petras", LocalDate.of(1933, Month.SEPTEMBER, 24), Gender.MALE);

        //when
        String personalCode = provider.generateOfficialId(person);
        //then
        assertEquals("33309240001", personalCode);
    }
    @Test
    public void generateOfficialId_returnTrueTest2() {
        //given
        OfficialIdProvider provider = new LithuanianOfficialIdProvider();
        Person person = new Person("Petras", LocalDate.of(1987, Month.MAY, 11), Gender.MALE);
        Person person2 = new Person("Petrone", LocalDate.of(1987, Month.MAY, 11), Gender.FEMALE);

        //when
        String personalCodeMale = provider.generateOfficialId(person);
        String personalCodeFemale = provider.generateOfficialId(person2);
        //then
        assertEquals("48705110020", personalCodeFemale);
    }
}