public class People {
    protected String name;
    protected String lastname;
    protected int age;

    public People(String name, String lastname, int age){
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }
    public void walk(){
        System.out.println(name + " " + lastname + " is walking");
    }
    public void voice(){
        System.out.println(name + " " + lastname + " is talking");
    }
    public void run(){
        System.out.println(name + " " + lastname + " is running");
    }

    public static class Student extends People{
        public Student(String name, String lastname, int age) {
            super(name, lastname, age);
        }
        public void learn(){
            System.out.println(name + " " + lastname + " is learning");
        }
    }
    public static class Teacher extends People{
        public Teacher(String name, String lastname, int age) {
            super(name, lastname, age);
        }
        public void teach(){
            System.out.println(name + " " + lastname + " is teaching");
        }
    }

    public static void main(String[] args) {
        Student student = new Student("Alex", "Shin", 21);
        System.out.println("Student's name: " + student.name + " lastname: " + student.lastname + " age: " + student.age);
        student.run();
        student.learn();
        student.walk();
        Teacher teacher = new Teacher("Kate", "Fam", 43);
        System.out.println("\nTeacher's name: " + teacher.name + " lastname: " + teacher.lastname + " age: " + teacher.age);
        teacher.teach();
        teacher.voice();
    }
}
