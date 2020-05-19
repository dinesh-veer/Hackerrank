import java.util.BitSet;
import java.util.Scanner;

public class BitsetExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int m=sc.nextInt();
	   
		
		BitSet test=new BitSet(n);
		BitSet test1=new BitSet(n);
		for(int i=0;i<m;i++) {
			String operation = sc.next();
			int first =sc.nextInt();
			int second= sc.nextInt();
			
			switch(operation) {
			case "AND": if(first==1)
							test.and(test1);
						else
							test1.and(test);
						break;
			case "OR" :if(first==1)
							test.or(test1);
						else
							test1.or(test);
						break;	
			case "SET" :if(first==1)
							test.set(second);
						else
							test1.set(second);
						break;	
			case "FLIP" :if(first==1)
							test.flip(second);
						else
							test1.flip(second);
						break;	
			case "XOR" :if(first==1)
							test.xor(test1);
						else
							test1.xor(test);
						break;	
			}
			
			System.out.println("\n"+test.cardinality() +" "+test1.cardinality());
			
		}

	}
}
