import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Vasya", 18));
        students.add(new Student("Masha", 18));
        students.add(new Student("Anya", 14));
        students.add(new Student("Zheka", 14));
        students.add(new Student("Petya", 14));
        students.add(new Student("Vova", 29));

        List<Integer> categories = makeCategories(students);
        List<List<Student>> result = new ArrayList<>();
        for (Integer age: categories) {
             result.add(filterByAge(students, age));
        }

        System.out.println(result);
//        students.sort(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getName().compareToIgnoreCase(o2.getName());
//            }
//        });
//
//        students.forEach(student -> System.out.println(student.getName()));
//
//        students.sort(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return Integer.compare(o1.getAge(), o2.getAge());
//            }
//        });
//
//        students.forEach(student -> System.out.println(student.getName()));
    }

    public static List<Student> filterByAge(List<Student> students, int filter){
        List<Student> result = new ArrayList<>();
        for (Student student: students) {
            if(student.getAge() == filter){
                result.add(student);
            }
        }
        return result;
    }

    public static List<Integer> makeCategories (List<Student> students){
        List<Integer> result = new ArrayList<>();
        for (Student student: students) {
            if(!result.contains(student.getAge())){
                result.add(student.getAge());
            }
        }
        return result;
    }
}
