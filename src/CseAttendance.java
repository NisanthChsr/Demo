import java.util.HashMap;

public class CseAttendance implements ComputerScience,Attendance{
   // HashMap<String,Integer> studentAttendance=new HashMap<>();
    private String studentName;
    private int studentAttendance;
    public CseAttendance(int studentAttendance)
    {
        this.studentAttendance=studentAttendance;
    }
    public void setStudentAttendance(int studentAttendance)
    {
        this.studentAttendance=studentAttendance;
    }
    public int getStudentAttendance()
    {
        return studentAttendance;
    }
}
