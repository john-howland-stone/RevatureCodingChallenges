import java.text.DecimalFormat;

public class ActualMemorySize {
    public static String actualMemorySize(String arg) {
        int memorySize = Integer.parseInt(arg.replaceAll("\\D*",""));
        if (arg.contains("GB") && (memorySize * 0.93) >= 1.0) {
            DecimalFormat decimalFormat = new DecimalFormat();
            decimalFormat.applyPattern(".##");
            return new StringBuilder(decimalFormat.format(memorySize * 0.93)).append("GB").toString();
        }
        else if (arg.contains("MB")) {
            return new StringBuilder(Long.toString(Math.round(memorySize * 0.93))).append("MB").toString();

        } else {
            return new StringBuilder(Long.toString(Math.round(memorySize * 0.93 * 1000))).append("MB").toString();
        }
    }
    public static void main(String[] args) {
        System.out.println(actualMemorySize("32GB"));
        System.out.println(actualMemorySize("2GB"));
        System.out.println(actualMemorySize("512MB"));
    }
}
