public class MechAttendance implements Mechanical,Attendance{
    private String studentName;
    private int studentAttendance;
    public MechAttendance(int studentAttendance)
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
