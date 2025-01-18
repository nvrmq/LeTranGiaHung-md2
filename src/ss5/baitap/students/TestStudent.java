package ss5.baitap.students;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("--------Initial--------");
        System.out.println("Name: "+student.getName());
        System.out.println("Classes: "+student.getClasses());
        System.out.println("-------Changes--------");
        student.setName("Dahmer");
        student.setClasses("C69");
        System.out.println("Name: " + student.getName());
        System.out.println("Classes: " + student.getClasses());
    }
}
