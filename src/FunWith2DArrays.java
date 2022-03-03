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

    public static double average(int[][] arr){
        double sum = 0;
        int totalNum = totalElements(arr);
        for(int[] row : arr){
            for(int num : row){
                sum += num;
            }
        }
        return sum / totalNum;
    }

    public static int[] indexFound(String[][] arr, String target){
        int[] output = {-1, -1};
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(arr[i][j].equals(target)){
                    output[0] = i;
                    output[1] = j;
                }
            }
        }
        return output;
    }
}
