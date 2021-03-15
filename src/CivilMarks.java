public class CivilMarks implements Civil,Marks{
    private String studentName;
    private int studentMarks;
    public CivilMarks(int studentMarks)
    {
        this.studentMarks=studentMarks;
    }
    public void setStudentMarks(int studentMarks)
    {
        this.studentMarks=studentMarks;
    }
    public int getStudentMarks()
    {
        return studentMarks;
    }
}
