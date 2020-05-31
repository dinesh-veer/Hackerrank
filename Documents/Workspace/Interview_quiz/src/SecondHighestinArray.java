import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SecondHighestinArray {

	public static void main(String[] args) {
		int[] array=new int[] {33,1,2,57,7,87,32,5,24,68,56,32};
		//inbuiltSort(array);
		//customSort(array);
		usingTreeset(array);
		//othetway(array);
		//System.out.println(Arrays.toString(array));
	}

	private static void usingTreeset(int[] array) {
		SortedSet set= new TreeSet<>();
		for(int i:array)
			set.add(i);
		set.remove(set.last());
		System.out.println(set);
		System.out.println(set.last());
		
	}

	private static void othetway(int[] array) {
		int highest=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		for(int i=0;i<array.length;i++) {
			if(array[i]>highest) {
				second=highest;
				highest=array[i];
			}else if(array[i]>second && highest!=array[i]) {
				second=array[i];
			}
		}
		System.out.println("Higest" +highest +" second"+ second);
		
	}

	private static void customSort(int[] array) {
		int temp=0;
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}

		System.out.println(Arrays.toString(array));
		System.out.println(array[array.length-2]);
		
	}

	private static void inbuiltSort(int[] array) {
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		System.out.println(array[array.length-2]);
		
		
	}
}
