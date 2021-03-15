public class EceMarks implements ElectronicCommunication,Marks{
    private String studentName;
    private int studentMarks;
    public EceMarks(int studentMarks)
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
