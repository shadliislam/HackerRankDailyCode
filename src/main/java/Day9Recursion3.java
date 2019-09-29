import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Day9Recursion3 {
    // with recursive
    static int factorial(int n) {
        if (n==0)
            return 1;
        else return n*factorial(n-1);

       /* with for loop
       int fact=1;
       for (int i=1;i<=n;i++)
       {   fact=fact*i;}
       return fact;
               */
    }
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("file.txt"));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = factorial(n);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        System.out.println(result);

        scanner.close();
    }
}
