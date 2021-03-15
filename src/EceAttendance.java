public class EceAttendance implements ElectronicCommunication,Attendance{
    private String studentName;
    private int studentAttendance;
    public EceAttendance(int studentAttendance)
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
