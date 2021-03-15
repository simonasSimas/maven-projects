package eu.academy.test;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 * <<<<<<< HEAD
 */
public class App {
    public static void main(String[] args) {
        List<HttpErrorPair> pairList = new ArrayList<>();
        pairList.add(new HttpErrorPair(HttpCodeEnum.CODE_1337, new ForbiddenHttpCode(ErrorLevelEnum.MEDIUM)));
        pairList.add(new HttpErrorPair(HttpCodeEnum.CODE_500, new InternalServerErrorHttpCode(ErrorLevelEnum.HIGH)));
        pairList.add(new HttpErrorPair(HttpCodeEnum.CODE_404, new NotFoundHttpCode(ErrorLevelEnum.LOW)));
        pairList.add(new HttpErrorPair(HttpCodeEnum.CODE_401, new BadRequestHttpCode(ErrorLevelEnum.MEDIUM)));

        System.out.println(pairList.toString());
        Collections.sort(pairList);
        System.out.println(pairList.toString());
    }
}