import java.util.Comparator;
import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PanDigital {
    public static long highestPandigitial(int arg) {
        if (arg <= 1) {
            return -1;
        }
        int digitcount = 0;
        int i = 1;
        LinkedList<Integer> linkedList = new LinkedList<>();
        while (digitcount < 9) {
            linkedList.add(arg * i);
            digitcount += Math.floor(Math.log10(arg * i)) + 1;
            i++;
        }
        Stream<String> stringStream = linkedList.stream().map(n -> Integer.toString(n));
        return Long.parseUnsignedLong(stringStream.sorted(Comparator.reverseOrder()).collect(Collectors.joining()));
    }
    public static void main(String[] args) {
        System.out.println(highestPandigitial(327));
    }
}

