import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	int l;
	ArrayList<Student> s=new ArrayList<Student>(Arrays.asList(students));
	Iterator<Student> i=s.iterator();
	
	public StudentGroup(int length) {
		l=length;
		this.students = new Student[length];
	}
	
	

	@Override
	public Student[] getStudents() {
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		int j=0;
		while(i.hasNext())
		{
			j++;
			if(j==index)
			{
			System.out.println(j.next());	
			}
		}
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		s.add(index,student);
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		s.add(0,student);
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		s.add(s.size()-1,student);
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		s.add(index,student);
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		s.remove(index);
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		s.remove(student);
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		s.remove(index);
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		s.remove(student);
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		int c=s.indexOf(student);
		int k=0;
		while(i.hasNext())
		{
			k++;
			if(k==c)
			{
				System.out.println(i.next());
			}
		}
		
		return null;
	}
}
