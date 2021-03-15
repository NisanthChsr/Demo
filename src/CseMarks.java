import java.util.HashMap;

public class CseMarks implements ComputerScience,Marks{
    //HashMap<String,Integer>
    private String studentName;
    private int studentMarks;
    public CseMarks(int studentMarks)
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
