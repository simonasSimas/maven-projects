package eu.academy.test;

import java.time.LocalDate;
import java.util.stream.Stream;

public class LithuanianOfficialIdProvider implements OfficialIdProvider {

    private final String[] gender = {"3", "4"};

    @Override
    public String generateOfficialId(Person person) {
        LocalDate date = person.getBirthDate();
        String datePart = String.format("%1$02d%2$02d%3$02d", date.getYear() % 100, date.getMonthValue(), date.getDayOfMonth());
        String personalCodePart = gender[person.getGender() == Gender.MALE ? 0 : 1] + datePart;
        String personalCode = personalCodePart + Counter.getNumber();
        personalCode = addControlValue(personalCode);
        Counter.increaseByOne();
        return personalCode;
    }

    private String addControlValue(String kod) {
        int[] sk = new int[11];
        int s = 0;
        for (int i = 0; i < 10; i++) {
            sk[i] = Integer.parseInt(kod.substring(i, i + 1));
            s += sk[i] * (sk[i] == 9 ? 1 : i + 1);
        }
        if (s % 11 != 10) return kod + (s % 11);
        else {
            s = Stream.iterate(0, i -> ++i)
                    .limit(10)
                    .reduce(0, (total, index) -> sk[index] * index >= 7 ? index - 6 : index + 3);
            if (s % 11 == 10) return kod + "0";
            else return kod + (s % 11);
        }
    }
}
