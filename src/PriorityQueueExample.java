import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

class Student implements Comparable<Student>{
	int id;
	String name=new String();
	double cgpa;

	Student(int id, String name, double cgpa) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the cgpa
	 */
	public double getCgpa() {
		return cgpa;
	}

	@Override
	public int compareTo(Student o) {
		int nameCompValue= this.name.compareTo(o.name);
		if(this.cgpa<o.cgpa)
			return 1;
		else if(this.cgpa>o.cgpa)
			return -1;
		else if(nameCompValue!=0)
			return nameCompValue;
		else 
			return this.id-o.id;
		/* if(this.cgpa == o.getCgpa())
	        {
	            if(this.name.equals(o.getName()) )
	            {
	            	return this.id-o.getId();
	                }
	            else
	                return this.name.compareTo(o.getName());
	        }
	        else if(this.cgpa > o.getCgpa())
	            return -1;
	        else
	            return 1;*/
	}
	/*
	@Override
    public int compareTo(Student that) {
        int cgpaComp = Double.compare(that.cgpa, this.cgpa);
        if (cgpaComp == 0) {
            int nameComp = this.name.compareTo(that.name);

            if (nameComp == 0) {
                return Integer.compare(this.id, that.id);
            }
            return nameComp;
        }
        return cgpaComp;
    }*/

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", cgpa=" + cgpa + "]";
	}	
	
	
}

class Priorities {

	public List<Student> getStudents(List<String> events) {
		Queue<Student> listStudent= new PriorityQueue<Student>();
		/*Queue<Student> listStudent= new PriorityQueue<Student>(
														Comparator.comparing(Student::getCgpa)
														.reversed()
														.thenComparing(Student::getName)
														.thenComparing(Student::getId)
														);*/
		for(String string: events) {
			String[] split=string.split("\\s");
			if(split.length!=1) {
				Student student= new Student(Integer.valueOf(split[3]),split[1],Double.valueOf(split[2]));
				listStudent.add(student);
			}else {
				//System.out.println(listStudent.peek().getName());
				listStudent.poll();
			}
		}
		List<Student> students = new ArrayList<>();
		
		System.out.println(listStudent);
		Student first = listStudent.poll();
		if (first == null) {
			return students;
		} else {
			while (first != null) {

				students.add(first);
				first = listStudent.poll();

			}
			return students;
		}
		
		
		//return new ArrayList<Student>(listStudent);
	}

}

public class PriorityQueueExample {
	private final static Scanner scan = new Scanner(System.in);
	private final static Priorities priorities = new Priorities();

	public static void main(String[] args) {
		int totalEvents = Integer.parseInt(scan.nextLine());
		List<String> events = new ArrayList<>();

		while (totalEvents-- != 0) {
			String event = scan.nextLine();
			events.add(event);
		}

		List<Student> students = priorities.getStudents(events);

		if (students.isEmpty()) {
			System.out.println("EMPTY");
		} else {
			for (Student st : students) {
				System.out.println(st);
			}
		}
	}
}
