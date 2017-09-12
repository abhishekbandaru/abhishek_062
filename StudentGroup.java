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
	 Scanner sc=new Scanner(System.in);
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		/*String fullname;
		double avgmark;
		int i,id;
		Date birthdate;
		for(i=0;i<students.length();i++)
		{
			id=sc.nextInt();
			sc.nextLine();
			fullname=sc.nextLine();
			birthdate=sc.nextLine();
			avgmark=sc.nextLine();
			Student s=new Student(id,fullname,birthdate,avgmark);
			students[i]=s;
		}*/
		
		return students[];
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		if(students==null)
			throw IllegalArgumentException;
		else
			this.students=students;
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if(students.length()<=index || index<0)
			throw IllegalArgumentException;
		else
		{
			/*String fullname;
			double avgmark;
			int i,id;
			Date birthdate;
			id=sc.nextInt();
			sc.nextLine();
			fullname=sc.nextLine();
			birthdate=sc.nextLine();
			avgmark=sc.nextLine();
			Student s=new Student(id,fullname,birthdate,avgmark);
			students[index]=s;
			return s;*/
			return students[index];
		}
		
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		if(students.length()<=index || index<0 || student==null)
			throw IllegalArgumentException;
		else
			students[index]=student;
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		if(student==null)
			throw IllegalArgumentException;
		else
		{
			int i;
			int l=students.length();
			for(i=l;i>0;i--)
			{
				students[i]=students[i-1];
			}
			students[0]=student;
		}
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		if(student==null)
			throw IllegalArgumentException;
		else
		{
			int l=students.length();
			students[l]=student;
		}
			
		
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		if(student==null)
			throw IllegalArgumentException;
		else
			students[index]=student;
			students[index]=student;
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
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
		return null;
	}
}
