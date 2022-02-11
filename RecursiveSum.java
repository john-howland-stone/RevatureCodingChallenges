public class RecursiveSum {
    public static int recursiveSum(int[] arg) {
        if (arg.length == 0) {
            return 0;
        }
        else return recursiveSum(arg, 0);
    }
    public static int recursiveSum(int[] arg, int index) {
        if (arg.length == 0) {
            return 0;
        } else if (index == arg.length-1) {
            return arg[arg.length - 1];
        } else return arg[index] + recursiveSum(arg, index + 1);
    }
    public static void main(String[] args) {
        int[] array = {2,1,2};
        System.out.println(recursiveSum(array));
        int[] array2 = {1,2,3};
        System.out.println(recursiveSum(array2));
    }
}
