package eu.academy.test;

import eu.academy.test.service.JavaStudentGroup;
import eu.academy.test.service.Student;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 * <<<<<<< HEAD
 */
public class App {
    public static void main(String[] args) {
        JavaStudentGroup studentGroup = new JavaStudentGroup();
        studentGroup.addAStudent(new Student("aaa","aaa", 1));
        studentGroup.addAStudent(new Student("www","www", 34));
        studentGroup.addAStudent(new Student("ccc","ccc", 42));
        studentGroup.addAStudent(new Student("ddd","ddd", 2));
        studentGroup.addAStudent(new Student("vvv","vvv", 793));
        studentGroup.addAStudent(new Student("jjj","jjj", 13));
        studentGroup.addAStudent(new Student("fff","fff", 7));
        studentGroup.addAStudent(new Student("ggg","ggg", 4532));
        studentGroup.addAStudent(new Student("hhh","hhh", 4567));
        studentGroup.addAStudent(new Student("eee","eee", 6));
        studentGroup.addAStudent(new Student("lll","lll", 1523));
        studentGroup.addAStudent(new Student("bbb","bbb", 32));
        studentGroup.addAStudent(new Student("mmm","mmm", 1345));
        studentGroup.addAStudent(new Student("nnn","nnn", 3));
        studentGroup.addAStudent(new Student("ooo","ooo", 4));
        studentGroup.addAStudent(new Student("ppp","ppp", 5));
        studentGroup.addAStudent(new Student("qqq","qqq", 6));
        studentGroup.addAStudent(new Student("rrr","rrr", 8));
        studentGroup.addAStudent(new Student("sss","sss", 9));
        studentGroup.addAStudent(new Student("ttt","ttt", 890));
        studentGroup.addAStudent(new Student("uuu","uuu", 876));
        studentGroup.addAStudent(new Student("kkk","kkk", 189));
        Collections.sort(studentGroup.getStudents());
        print(studentGroup.getStudents());
        System.out.println(studentGroup.groups(studentGroup.getStudents(), 7).toString());

    }
    private static void print(List<Student> list){
        for (Student s : list){
            System.out.println(s.toString());
        }
    }
}