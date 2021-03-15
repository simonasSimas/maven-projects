package eu.academy.test.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaStudentGroup {

    private List<Student> list = new ArrayList<>();

    public void addAStudent(Student student) {
        list.add(student);
    }

    public List<Student> getStudents() {
        return list;
    }

    public Student getStudentById(long id) {
        for (Student student : list) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }
    public Map groups(List<Student> list, int groupSize){
        Map<Integer, List<Student>> map = new HashMap<>();
        List<Student> groupsList = new ArrayList<>();
        if (list.size()/groupSize!=0){
            int overboardStudents = list.size()%groupSize;
            int j = 0;
            for (int i = 0; i< list.size()/groupSize;i++){
                for (; j<groupSize; j++){
                    groupsList.add(list.get(j));
                }
                map.put(i, groupsList);
            }
            j++;
            if (overboardStudents>0){
                for (int i = 0; i<overboardStudents ; i++){
                    map.get(i).add(list.get(j));
                }
            }
        }
        return map;
    }
}
