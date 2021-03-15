public class MechMarks implements Mechanical,Marks{
    private String studentName;
    private int studentMarks;
    public MechMarks(int studentMarks)
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
