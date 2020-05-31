import java.util.ArrayList;
import java.util.List;

public class Count {

	public static void main(String[] args) {
		getCount(13);
		getCount(99);
		getCount(205);
		getCount(100000000);
	}

	private static void getCount(int number) {

		//StringBuilder stringBuilder= new StringBuilder();
		int oneCount=0;
		for(long i=1;i<=number;i++) {
			String str=String.valueOf(i);
			if(String.valueOf(i).contains("1")) {
				for(int j=0;j<str.length();j++) {
					if(str.charAt(j)=='1')
						oneCount++;
				}
			}
		}
		System.out.println(oneCount);
		/*int count=0;
		for(int i=1; i <= number; i *= 10) {
			int divider = i * 10;
			count += (number/divider) * i + Math.min(Math.max(number % divider - i + 1, 0), i);
		}
		System.out.println(count);
		*/
//		int count1=0;
//		while(count>0) {
//			++count1;
//			count&=count-1;
//		}
//		System.out.println(count1);
	}
	
	
}
