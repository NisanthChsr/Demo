import java.util.HashMap;

public class StudentDetailsComputerScience extends ComputerScienceStudents{
    static HashMap<String,CseAttendance> studentAttendanceDetails=new HashMap<>();
    static HashMap<String,CseMarks> studentMarksDetails=new HashMap<>();
    public StudentDetailsComputerScience(){}
    public StudentDetailsComputerScience(String studentName,int studentMarks,int studentAttendance)
    {
        studentAttendanceDetails.put(studentName,new CseAttendance(studentAttendance));
        studentMarksDetails.put(studentName,new CseMarks(studentMarks));
    }
    public static CseAttendance getStudentAttendaceDetails(String studentName)
    {
        return studentAttendanceDetails.get(studentName);
    }
    public static CseMarks getStudentMarksDetails(String studentName)
    {
        return studentMarksDetails.get(studentName);
    }
    public int studentsCount()
    {
        return studentMarksDetails.size();
    }
}
