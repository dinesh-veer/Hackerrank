import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SynechronCountOfElements {

		public static void main(String[] args) {

			List<String> list = Arrays.asList("B", "A", "A", "C", "B", "A");
			
			

			Set<String> distinct = new HashSet<>(list);
			for (String s: distinct) {
				System.out.println(s + ": " + Collections.frequency(list, s));
			}
			
		//	Map<String, Long> frequencyMap =
		//			list.stream().collect(Collectors.groupingBy(Function.identity(), 
		//Collectors.counting()));

			Map<String, Long> frequencyMap =
				    list.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
				for (Map.Entry<String, Long> entry : frequencyMap.entrySet()) {
					System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
