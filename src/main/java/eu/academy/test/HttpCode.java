package eu.academy.test;

public class HttpCode {
    private ErrorLevelEnum errorLevelEnum;

    public HttpCode(ErrorLevelEnum errorLevelEnum) {
        this.errorLevelEnum = errorLevelEnum;
    }

    public int getErrorLevel() {
        return errorLevelEnum.getLevel();
    }

    public void seterrorLevel(ErrorLevelEnum errorLevelEnum) {
        this.errorLevelEnum = errorLevelEnum;
    }

    @Override
    public String toString() {
        return "HttpCode{" +
                "errorLevelEnum=" + errorLevelEnum +
                '}';
    }
}
