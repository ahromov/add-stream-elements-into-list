import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	private static Scanner sc;

	public static void main(String[] args) {
		List<Integer> target = new ArrayList<>(Arrays.asList(1, 2, 3));

		sc = new Scanner(System.in);

		Stream<Integer> source = Stream.of(sc.nextInt());
//			source.collect(Collectors.toCollection(() -> target));
//			source.sequential().collect(Collectors.toCollection(() -> target));
//			source.forEachOrdered(target::add);
//			target.addAll(source.collect(Collectors.toList()));
		target = Stream.concat(target.stream(), source).collect(Collectors.toList());

		System.out.println(target);
	}

}
