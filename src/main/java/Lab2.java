import java.util.Arrays;
import java.util.Scanner;


public class Lab2 {
    public static void main(String[] args) {
        System.out.print("int i = ");
        Scanner scan = new Scanner(System.in);
        int pyramidHeight = scan.nextInt();
        int pyramidCurrentLevel = pyramidHeight;
        while (pyramidCurrentLevel > 0) {
            String string = " ".repeat(pyramidCurrentLevel) +
                    " *".repeat(Math.max(0, pyramidHeight - pyramidCurrentLevel + 1));
            System.out.print(string);
            System.out.println();
            pyramidCurrentLevel--;
        }



        System.out.print("int array width: ");
        int arrayWidth = scan.nextInt();
        System.out.print("int array height: ");
        int arrayHeight = scan.nextInt();
        int x = 0;
        int[][] myArray = new int[arrayHeight][arrayWidth];
        for (int i = 0; i < arrayHeight; i++) {
            for (int j = 0; j < arrayWidth; j++) {
                x = x + 3;
                myArray[i][j] = x;
                System.out.printf("%4d" + " ", myArray[i][j]);
            }
            System.out.println();

        }

//        for (int[] stringOfArray : myArray) {
//            System.out.println(Arrays.toString(stringOfArray));
//        }


        scan.close();
    }
}
