import java.util.HashMap;

public class StudentDetailsCivil extends CivilStudents
{
    static HashMap<String,CivilAttendance> studentAttendanceDetails=new HashMap<>();
    static HashMap<String,CivilMarks> studentMarksDetails=new HashMap<>();
    public StudentDetailsCivil(){}
    public StudentDetailsCivil(String studentName,int studentMarks,int studentAttendance)
    {
        studentAttendanceDetails.put(studentName,new CivilAttendance(studentAttendance));
        studentMarksDetails.put(studentName,new CivilMarks(studentMarks));
    }
    public static CivilAttendance getStudentAttendanceDetails(String studentName)
    {
        return studentAttendanceDetails.get(studentName);
    }
    public static CivilMarks getStudentMarksDetails(String studentName)
    {
        return studentMarksDetails.get(studentName);
    }
    public int studentsCount()
    {
        return studentMarksDetails.size();
    }
}
