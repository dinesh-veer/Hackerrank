

import java.util.HashMap;

class EmployeeTest{
	private String name;
	
	public  EmployeeTest(String name) {
		this.name=name;
	}
	public String toString() {
		return this.name;
	}
}

public class HashTests 
{
	public static void main(String[] args) {
		HashMap<EmployeeTest, String> hashmap= new HashMap<>();
		
		EmployeeTest employee= new EmployeeTest("Dinesh");
		EmployeeTest employee2= new EmployeeTest("Dinesh");
		
		hashmap.put(employee, "FirstName");
		hashmap.put(employee2, "SecondName");
	
		System.out.println(hashmap);
		
		//System.out.print(hashmap.get(new EmployeeTest("Dinesh"))+" Got ");//null will return
		System.out.print(hashmap.get(employee)+" Got ");//return FirstName
	}

}
