package MyCollectionFramework;

import java.util.*;
public class MainClassStudent {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(23, "Ramesh"));
        students.add(new Student(95, "Arunesh"));
        students.add(new Student(84, "Kamlesh"));
        students.add(new Student(78, "Rajesh"));
        students.add(new Student(65, "Sandesh"));
        students.add(new Student(65, "Arunesh"));
        //Collections.sort(students, new SortByNameThenMarks());
        /*Collections.sort(students, new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2){
                if(o1.name.equals(o2.name)) return o1.marks - o2.marks;
                else return o1.name.compareTo(o2.name);
            }
        });*/
        /*Collections.sort(students, (o1,o2)->{
                if(o1.name.equals(o2.name)) return o1.marks - o2.marks;
                else return o1.name.compareTo(o2.name);
        });*/
        Collections.sort(students, (o1,o2)->o1.name.compareTo(o2.name));
        //Collection.sort(students, Comparator.comparing(Student::getName).thenComparing(Student::getMarks));
        //Collection.sort(students, Comparator.comparing(Student::getName).thenComparing(Student::getMarks).reversed());
        
        students.forEach(System.out::println);
    }
}
class SortByNameThenMarks implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2){
        if(o1.name.equals(o2.name)) return o1.marks - o2.marks;
        else return o1.name.compareTo(o2.name);
    }
}