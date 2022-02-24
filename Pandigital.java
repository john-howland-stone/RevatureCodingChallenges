import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PanDigital {
    public static long highestPandigitial(int range, int product) {
        if (range <= 1) {
            return -1;
        }
        IntStream intStream = IntStream.rangeClosed(1, range).map(n -> n * product);
        Stream<String> stringStream = intStream.mapToObj(arg -> Integer.toString(arg));
        return Long.parseUnsignedLong(stringStream.sorted(Comparator.reverseOrder()).collect(Collectors.joining()));
    }
    public static void main(String[] args) {
        System.out.println(highestPandigitial(3,192));
        System.out.println(highestPandigitial(5,9));
    }
}
