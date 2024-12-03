package binary.subpackage;

public class Teacher extends Person {
    private String subjectName;
    private double salary;

    public String getSubjectName() {
        return subjectName;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Student Kamil = new Student();
        Teacher Hemanth = new Teacher();
        Hemanth.name = "hemanth";
        System.out.println(Hemanth.name);

        System.out.println("-------------------------");
        Kamil.id = 127847;
        System.out.println(Kamil.id);
    }

}
