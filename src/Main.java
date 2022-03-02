import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        String[][] seatingChart = {{"Abby", "Don", "George", "Kim"},
                                    {"Brian", "Elenor", "Harry", "Lenny"},
                                      {"Cathy", "Fred", "Jill", "Matt"}};
        seatingChart[1][2] = "Paul";
        String temp = seatingChart[2][3];
        seatingChart[2][3] = seatingChart[0][0];
        seatingChart[0][0] = temp;

        String[] temp1 = seatingChart[0];
        seatingChart[0] = seatingChart[1];
        seatingChart[1] = temp1;
        for(String[] student : seatingChart){
            System.out.println(Arrays.toString(student));
        }

        int[][] arr1 = new int[2][3];
        int[][] arr2 = new int[3][2];
        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[0][2] = 3;
        arr1[1][0] = 4;
        arr1[1][1] = 5;
        arr1[1][2] = 6;

        arr2[0][0] = 1;
        arr2[1][0] = 2;
        arr2[2][0] = 3;
        arr2[0][1] = 4;
        arr2[1][1] = 5;
        arr2[2][1] = 6;
        for(int[] item : arr1){
            System.out.println(Arrays.toString(item));
        }
        for(int[] item : arr2){
            System.out.println(Arrays.toString(item));
        }

        int[][] test1 = {{5, 2}, {1, 3}, {7, 9}};
        int[][] test2 = {{1, 2, 3}, {6, 5, 4}};
        int[][] test3 = {{4, 5, 2, 4, 1}, {1, 9, 7, 8, 2}, {8, 10, 13, 4, 3}};

        System.out.println(FunWith2DArrays.totalElements(test1));
        System.out.println(FunWith2DArrays.totalElements(test2));
        System.out.println(FunWith2DArrays.totalElements(test3));

        String[][] test4 = {{"hi", "bye", "stuff", "go"}, {"time", "up", "you", "good"}, {"map", "low", "bow", "mom"}};
        String[][] test5 = {{"phone", "mouse", "keyboard"}};
        String[][] test6 = {{"time"}};

        FunWith2DArrays.fourCorners(test4);
        FunWith2DArrays.fourCorners(test5);
        FunWith2DArrays.fourCorners(test6);
    }
}
