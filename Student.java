public class Student {
    String name;
    String fbId;
    Student[] friends;

    String[] classes;

    public Student(String name) {
        this.name = name;
    }


    public Student(String name, String fbId, Student[] friends) {
        this.name = name;
        this.fbId = fbId;
        this.friends = friends;
    }
}
