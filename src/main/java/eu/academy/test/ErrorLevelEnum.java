package eu.academy.test;

public enum ErrorLevelEnum {
    HIGH(3),
    MEDIUM(2),
    LOW(1);
    private int level;

    ErrorLevelEnum(int level) {
    }

    public int getLevel() {
        return level;
    }
}
