import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        StudentDetailsElectronicCommunication student1=new StudentDetailsElectronicCommunication("Nisanth",90,98);
        StudentDetailsComputerScience student2=new StudentDetailsComputerScience("Tharun",98,89);
        StudentDetailsMechanical student3=new StudentDetailsMechanical("Pavan",87,79);
        StudentDetailsCivil student4=new StudentDetailsCivil("Akhil",89,58);
        CseAttendance studentAttendanceInfo=StudentDetailsComputerScience.getStudentAttendaceDetails("Tharun");
        System.out.println(studentAttendanceInfo.getStudentAttendance());
        EceMarks studentMarksInfo=StudentDetailsElectronicCommunication.getStudentMarksDetails("Nisanth");
        System.out.println(studentMarksInfo.getStudentMarks());
        System.out.println(new StudentDetailsCivil().studentsCount());
        scan.close();
    }
}
