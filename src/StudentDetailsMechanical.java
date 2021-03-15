import java.util.HashMap;

public class StudentDetailsMechanical extends MechanicalStudents{
    static HashMap<String,MechAttendance> studentAttendanceDetails=new HashMap<>();
    static HashMap<String,MechMarks> studentMarksDetails=new HashMap<>();
    public StudentDetailsMechanical(){}
    public StudentDetailsMechanical(String studentName,int studentMarks,int studentAttendance)
    {
        studentAttendanceDetails.put(studentName,new MechAttendance(studentAttendance));
        studentMarksDetails.put(studentName,new MechMarks(studentMarks));
    }
    public static MechAttendance getStudentAttendanceDetails(String studentName)
    {
        return studentAttendanceDetails.get(studentName);
    }
    public static MechMarks getStudentMarksDetails(String studentName)
    {
        return studentMarksDetails.get(studentName);
    }
    public int studentsCount()
    {
        return studentMarksDetails.size();
    }
}
