// package whatever; // don't place package name!

import java.util.ArrayList;
import java.util.List;
class Employee{
  private int id;
  private String name;
  private int salary;
  public Employee(int id,String name,int salary){
    this.id=id;
    this.name=name;
    this.salary=salary;
  }
  public int getSalary(){
    return this.salary;
  }
  
  public int getId(){
    return this.id;
  }
  
  public String getName(){
    return this.name;
  }
  public void setId(int id){
    this.id=id;
  }
  public void setName(String name){
    this.name=name;
  }
  public void setSalary(int salary){
    this.salary=salary;
  }
  
  public String toString(){
    return "[Employee : id="+this.id+" name: "+this.name+" salary :"+this.salary +"]\n";
  }
}
class MyCode {
	public static void main (String[] args) {
    Employee employee=new Employee(122,"Test",22000);
    Employee employee2= new Employee(211,"sample",25000);
    Employee employee3= new Employee(377,"Rakil",5599);
    Employee employee4= new Employee(444, "sajesh",7777);
    Employee employee5=new Employee(122,"Test",22000);
    List<Employee> list= new ArrayList<>();
    list.add(employee);
    list.add(employee2);
    list.add(employee3);
    list.add(employee4);
    list.add(employee5);
    //list.forEach(System.out::println);
    list.stream().distinct().forEach(System.out::print);
    
    //list.stream().filter(empl->(empl.getId()>300)).forEach(System.out::println);
   // list.stream().filter(empl->(empl.getId()>300) && (empl.getName().endsWith("h"))).forEach(System.out::println);
   //list.stream().filter(emp->emp.getName().startsWith("s")).map(empl->empl.getName().toUpperCase()).forEach(System.out::println);
  
//List<String> empNames= list.stream().filter(emp->emp.getName().startsWith("s")).map(empl->empl.getName().toUpperCase()).collect(Collectors.toList()); 
   //System.out.println(empNames); 
 //   System.out.println(list.stream().count());
// List<Employee> test=   list.stream().sorted((emp1,emp2)->emp1.getId()-emp2.getId()).collect(Collectors.toList());
  //  System.out.println(test);
  list.stream().sorted((emp1,emp2)->- (emp1.getId()-emp2.getId())).forEach(System.out::println);
    //filter((emp1,emp2)->(emp1.id>emp2.id)).forEach(System.out::println);
    //list.stream().collect(System.out::prinlnt);
    Thread thread=new Thread(new Sample());
    thread.start();
  }
}


class Sample implements Runnable{
  
  public void run(){
    System.out.println("Thread: "+Thread.currentThread());
  }
}
