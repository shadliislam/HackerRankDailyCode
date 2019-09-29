import java.util.Scanner;

public class Day11TwoDArrays {
    private static final Scanner scanner = new Scanner(System.in);
    static int row;
    static int col;

    public Day11TwoDArrays(int row, int col) {
        this.row = row;
        this.col = col;
    }
    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        Day11TwoDArrays.arrayInput(arr);
        //Day11TwoDArrays.printHourGlass(arr);
        System.out.println(Day11TwoDArrays.findMaxSumOfHourglass(arr));
 }

 public static int[][] arrayInput(int[][] arr){

     for (row = 0; row < 6; row++) {
         for (col = 0; col < 6; col++) {
             arr[row][col] = scanner.nextInt();
         }
     }
     scanner.close();
     return arr;
 }

 public static int findMaxSumOfHourglass(int[][] arr){
     int sum=0;
     int maxSum=-999;
     for (int i = 0; i < 4; i++){
         row=i;
         for (col = 0; col <4; col++) {
             sum=(arr[row][col]+ arr[row][col + 1] + arr[row][col + 2]+
                     arr[row+1][col+1]+
                     arr[row+2][col] + arr[row+2][col + 1] + arr[row+2][col + 2]);
             if(sum>maxSum)
                 maxSum=sum;
         }
     }
     return maxSum;
 }
 public static void printHourGlass(int[][] arr){
     for (int i = 0; i < 4; i++){
         row=i;
         System.out.println(" ");
         for (col = 0; col <4; col++) {
             System.out.println(arr[row][col] + " " + arr[row][col + 1] + " " + arr[row][col + 2]);
             System.out.println("  "+arr[row+1][col+1]);
             System.out.println(arr[row+2][col] + " " + arr[row+2][col + 1] + " " + arr[row+2][col + 2]);
             //System.out.print(" ");
         }
         System.out.print("  ");
     }
 }

}
