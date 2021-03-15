import java.util.HashMap;

public class StudentDetailsElectronicCommunication extends ElectronicCommunicationStudents{
    static HashMap<String,EceAttendance> studentAttendanceDetails=new java.util.HashMap<>();
    static HashMap<String,EceMarks> studentMarksDetails=new HashMap<>();
    public StudentDetailsElectronicCommunication(){}
    public StudentDetailsElectronicCommunication(String studentName,int studentMarks,int studentAttendance)
    {
        studentAttendanceDetails.put(studentName,new EceAttendance(studentAttendance));
        studentMarksDetails.put(studentName,new EceMarks(studentMarks));
    }
    public static EceAttendance getStudentAttendanceDetails(String studentName)
    {
        return studentAttendanceDetails.get(studentName);
    }
    public static EceMarks getStudentMarksDetails(String studentName)
    {
        return studentMarksDetails.get(studentName);
    }
    public int studentsCount()
    {
        return studentMarksDetails.size();
    }
}
