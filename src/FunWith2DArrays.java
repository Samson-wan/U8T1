public class FunWith2DArrays {
    public static int totalElements(int[][] arr){
        int row = arr.length;
        int column = arr[0].length;
        return row * column;
    }

    public static void fourCorners(String[][] arr){
        String topLeft = arr[0][0];
        String topRight = arr[0][arr[0].length - 1];
        String bottomLeft = arr[arr.length - 1][0];
        String bottomRight = arr[arr.length - 1][arr[arr.length - 1].length - 1];
        System.out.println(topLeft);
        System.out.println(topRight);
        System.out.println(bottomLeft);
        System.out.println(bottomRight);
    }
}
