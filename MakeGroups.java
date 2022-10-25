import java.util.ArrayList;

public class MakeGroups {
    static String NAME = "Anjalee";
    static String CLASS = "ACCT101";
    public static void main(String[] args) {
        // Accept a student to run query on and populate their Student object using FB data
        Student student = GetData.fbDataForStudent(NAME); // has a list of friends. Their friends have a list of friends

        // Use Canva to get a list of students who are taking the course
        Student[] studentsInClass = GetData.canvaStudentsInClass(CLASS); // Just contains names of students

        // ToDo: <Later Step> Make a Graph of the network which will allow us to do more nuanced analysis

        ArrayList<Student> firstConnectionsInClass = new ArrayList<>();

        //1. Check if I have any first connections in the class
        for (Student s : studentsInClass) {
            for (Student f : student.friends) {
                if (s.name.equalsIgnoreCase(f.name)) {
                    firstConnectionsInClass.add(f);
                }
            }
        }
    }

}
