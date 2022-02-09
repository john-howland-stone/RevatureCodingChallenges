import java.math.BigInteger;

public class LookAndSay {
    /*public static long lookAndSay(int arg) {
        long retval = -1;
        String argString = Integer.toString(arg);
        StringBuilder stringBuilder = new StringBuilder();
        if (argString.length() % 2 == 0) {
            for (int i = 0; i < argString.length(); i+=2) {
                int count = Integer.parseInt(argString.substring(i,i+1));
                for (int j = 0; j < count; j++) {
                    stringBuilder.append(argString.substring(i+1, i+2));
                }
            }
            retval = Long.parseLong(stringBuilder.toString());
        }
        return retval;
    }*/
public static BigInteger lookAndSay(long arg) {
    BigInteger retval;
    String argString = Long.toString(arg);
    StringBuilder stringBuilder = new StringBuilder();
    if (argString.length() % 2 == 0) {
        for (int i = 0; i < argString.length(); i+=2) {
            int count = Integer.parseInt(argString.substring(i,i+1));
            for (int j = 0; j < count; j++) {
                stringBuilder.append(argString.substring(i+1, i+2));
            }
        }
        retval = new BigInteger(stringBuilder.toString());
    } else {
        retval = new BigInteger("-1");
    }
    return retval;
}
    public static void main(String[] args) {
        System.out.println(lookAndSay(3132));
        //System.out.println(lookAndSay(1213200012171979));
        System.out.println(lookAndSay(54544666));
        System.out.println(lookAndSay(95));
        //System.out.println(lookAndSay(1213141516171819));
        System.out.println(lookAndSay(120520));
        System.out.println(lookAndSay(231));

    }
}
