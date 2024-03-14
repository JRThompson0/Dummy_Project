package cohort15;
public class TemperatureCheck{
    public static void main(String[] args)
    {
    int studentScore = (int) Math.round(Math.random()*100);
        char letterGrade = 'F';
        if (studentScore>=60)
        {
            letterGrade = 'D';
            if(studentScore>=70)
            {
                letterGrade = 'C';
                if (studentScore>=80)
                {
                    letterGrade = 'B';
                    if (studentScore>=90)
                    {
                        letterGrade = 'A';
                    }
                }
            }
        }
        if (letterGrade == 'A' | letterGrade == 'F')
            System.out.println(studentScore + ":   You got an " + letterGrade);
        else
        {
            System.out.println(studentScore + ":   You got a " + letterGrade);
        }
    }
}