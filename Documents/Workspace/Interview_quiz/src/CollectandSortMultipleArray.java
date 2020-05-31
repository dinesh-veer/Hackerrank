import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

public class CollectandSortMultipleArray {

	public static void main(String[] args) {
		String[] array1={"Dinesh","AVF","ERD"};
		String[] array2={"VEER","RAJM","ERUN"};
		//getSortedArrayUsinTreeset(array1,array2);
		getSortedusinStream(array1,array2);
  	}

	private static void getSortedusinStream(String[]...array) {

		//Object[] sorted=Stream.of(array).flatMap(Stream::of).sorted().toArray();
		//System.out.println(Arrays.toString(sorted));
		

//		String[] s=Stream.of(array)
//						.flatMap(Stream::of)		// or use Arrays::stream
//						.sorted()
//						.toArray(String[]::new);
//		System.out.println(Arrays.toString(s));
//		
		
//		Stream<String> stream = Stream.of();
//		for (String[] s: array)
//			stream = Stream.concat(stream, Arrays.stream(s)).sorted();
//
//		System.out.println( Arrays.toString(stream.toArray(String[]::new)));
		


		List<String> result = new ArrayList<>();

		Stream.of(array)
				.flatMap(Stream::of)
				.map(x -> (String)x)
				.sorted()
				.forEach(result::add);

		System.out.println(Arrays.toString(result.toArray(new String[0])));
		
//		List<String> list = new ArrayList<>();
//
//		for (String[] arra : array)
//			Collections.addAll(list, arra);
//
//		Collections.sort(list);
//		System.out.println(Arrays.toString( list.toArray(new String[0])));
		
		
		 // Function to merge two arrays of  
//        // same type 
//        return Stream.concat(Arrays.stream(a),  
//                             Arrays.stream(b)) 
//                     .toArray();
		
		
//		return IntStream.concat(Arrays.stream(array1), Arrays.stream(array2))
//        .sorted()
//        .toArray();

	}

	private static void getSortedArrayUsinTreeset(String[]... array) {
		Set<String> set= new TreeSet<>();
		for(String[] a:array) {
			for(String element:a)
				set.add(element);
		}
		System.out.println(set);
	}
}
