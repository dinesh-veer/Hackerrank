
public class MinDistanceinArray {

	public static void main(String[] args) {
		int[] array= new int[] {2,3,1,5,7,6,2,3};
		findtheMinDistance(array,3,6);
	}

	private static void findtheMinDistance(int[] array, int first, int second) {

		int minDistance=Integer.MAX_VALUE;
		for(int i=0;i<array.length;i++) 
			for(int j=i+1;j<array.length;j++) {
				if((first==array[i] &&second==array[j] ||second==array[i]&&first==array[j])&&minDistance>Math.abs(i-j)){
					minDistance=Math.abs(i-j);
				}
			}
		System.out.println(minDistance);
	}
}
