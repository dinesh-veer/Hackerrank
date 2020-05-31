import java.util.ArrayList;
import java.util.List;

class A{
	
}
class B extends A{
	
}
public class SynechronGenerics {

	public static void main(String[] args) {
		//List<A> list=new ArrayList<B>();
		
		List<B> list1=new ArrayList<B>();
		list1.add((B) new A());
		list1.add(new B());
	}
}
