package lecture18;

public class Q3 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3}, {2,3}, {3}
                };

        for (int i = 0; i<arr.length; i++) {
            for (int b = 0; b<arr[i].length; b++) {
                System.out.print(arr[i][b] + " ");
            }
            System.out.println();
        }
    }
}
