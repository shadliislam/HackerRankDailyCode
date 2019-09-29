import java.util.Scanner;

public class Day10BinaryNumbers {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int maxOne=0;
        int count=0;
        String binary=Integer.toBinaryString(n);

        for (int i = 0; i<binary.length(); i++){
            if (binary.charAt(i)=='1'){
                ++count;
            }else count=0;

            if(count>maxOne){
                maxOne=count;
            }

        }
        System.out.println(maxOne);

        scanner.close();
    }

}
