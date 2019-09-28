import java.util.Scanner;

public class Day6Review {

        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            int numOfTestCase=sc.nextInt();

            for (int i=0;i<numOfTestCase;i++){
                String text=sc.next();
                char[] characters = text.toCharArray();
                for (int j=0;j<characters.length;j=j+2) {
                    System.out.print(characters[j]);
                }
            System.out.print(" ");
                for (int k=1;k<characters.length;k=k+2){
                    System.out.print(characters[k]);
                }
                System.out.println("");
            }
        }
}



