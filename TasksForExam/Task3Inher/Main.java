package Task3Inher;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Farid", "Budapest", "Master", 2022, 6000);
        System.out.println(student);
        System.out.println(student.getName());
        System.out.println(student.getProgram());
        System.out.println(student.getAddress());
        System.out.println(student.getYear());
        System.out.println(student.getFee());

        Staff staff = new Staff("Nizami", "Budapest", "ELTE", 6000);
        System.out.println(staff);

    }
}
