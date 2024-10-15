package lecture18;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Matrix1");
        System.out.println("Enter number of rows in matrix1");
        int matrix1Rows = sc.nextInt();
        System.out.println("Enter number of columns in matrix1");
        int matrix1Columns = sc.nextInt();
        int[][] arr = new int[matrix1Rows][matrix1Columns];
        for (int i = 0; i<matrix1Rows; i++) {
            System.out.println("Enter " + i + " row elements with space");
            for (int j = 0; j<matrix1Columns; j++) {
                arr[i][j] = sc.nextInt();
            }
        }



        System.out.println("Matrix2");
        System.out.println("Enter number of rows in matrix2");
        int matrix2Rows = sc.nextInt();
        System.out.println("Enter number of columns in matrix2");
        int matrix2Columns = sc.nextInt();
        int[][] arr1 = new int[matrix2Rows][matrix2Columns];
        for (int i = 0; i<matrix2Rows; i++) {
            System.out.println("Enter " + i + " row elements with space");
            for (int j = 0; j<matrix2Columns; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }


        AdditionOfMatrix aa = new AdditionOfMatrix();
        int[][] result = aa.add(arr, arr1);

        if (result==null) {
            System.out.println("Array of different size");
            return;
        }

        for (int[] ints : result) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

    }
}

class AdditionOfMatrix{
    public int[][] add(int[][] arr, int[][] arr1) {
        if (arr.length != arr1.length) {
            return null;
        }

        for (int i = 0; i<arr.length; i++) {
            if (arr[i].length != arr1[i].length) {
                return null;
            }
        }

        int rows = arr.length;
        int columns = arr[0].length;
        int[][] result = new int[rows][columns];


        for (int i = 0; i<rows; i++) {
            for (int j = 0; j<columns; j++) {
                result[i][j] = arr[i][j] + arr1[i][j];

            }
        }
        return result;
    }
}

