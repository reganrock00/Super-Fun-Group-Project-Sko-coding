import java.util.Comparator;

public class FirstPeriodSort implements Comparator<Student>
{
	public int compare (Student s1, Student s2)
	{
	return s1.getFirstClass().compareTo(s2.getFirstClass());
	}
}