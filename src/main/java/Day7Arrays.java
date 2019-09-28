import java.util.Scanner;

public class Day7Arrays {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int sizeOfArray = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[sizeOfArray];
        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = sizeOfArray-1; i >=0; i--) {
            int arrItem=Integer.parseInt(arrItems[i]);
            arr[i]=arrItem;
            System.out.print(arr[i]+" ");
        }
        scanner.close();
    }
}
