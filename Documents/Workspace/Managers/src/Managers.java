import java.util.function.*;

class Employee{
	Integer eno;
	String name;
	public Employee(Integer eno,String name) {
		this.eno=eno;
		this.name=name;
	}
	@Override
	public String toString() {
		return this.eno+" :"+this.name.toString();
	}
}
public class Managers {

	public static void main(String[] args) {

		BiFunction<Integer,String,Employee> e=(a,b)->new Employee(a,b);
		System.out.println(e.apply(122,"Dinesh"));
		
	}

}
//1-2,3,4
//3-5,6,7
//5-8,9,10