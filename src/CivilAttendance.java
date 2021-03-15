public class CivilAttendance implements Civil,Attendance{
    private String studentName;
    private int studentAttendance;
    public CivilAttendance(int studentAttendance)
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
