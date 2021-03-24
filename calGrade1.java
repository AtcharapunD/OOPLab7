import javax.swing.JOptionPane;
public class calGrade1 
{
    public static void main(String[] args) 
    {
        int score, mid, finall;
        String s1, s2;

        s1 = JOptionPane.showInputDialog("Enter Mid score : ");
        mid = Integer.parseInt(s1);
        s2 = JOptionPane.showInputDialog("Enter Final score : ");
        finall = Integer.parseInt(s2);

        score = mid + finall;

        calGrade(score);

    }
    public static void calGrade(int score) 
    {

        if ((score >= 0) && (score <= 100)) 
        {
            String grade;
            if (score >= 80)
                grade = "A";
            else if (score >= 75)
                grade = "B+";
            else if (score >= 70)
                grade = "B";
            else if (score >= 65)
                grade = "c+";
            else if (score >= 60)
                grade = "C";
            else if (score >= 55)
                grade = "D+";
            else if (score >= 50)
                grade = "D";
            else
                grade = "F";

            String output = " Score : " + score + "\n Grade : " + grade;
            JOptionPane.showMessageDialog(null, output, "Grade", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);

        }
    }
}
