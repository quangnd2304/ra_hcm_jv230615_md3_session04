package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTwoDimensions {
    public static void main(String[] args) {
        //1. Nhập vào số dòng và số cột của mảng 2 chiều (row,col)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số dòng:");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào số cột:");
        int col = Integer.parseInt(scanner.nextLine());
        //2. Khai báo mảng số nguyên 2 chiều
        int[][] arrInt;
        //3. Khởi tạo mảng số nguyên 2 chiều gồm row dòng và col cột
        arrInt = new int[row][col];
        //Gộp khai báo và khởi tạo: int[][] arrInt = new int[row][col];
        //4. Nhập giá trị các phần tử trong mảng 2 chiều từ bàn phím
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("arrInt[%d][%d]=",i,j);
                arrInt[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        //5. In giá trị các phần tử mảng 2 chiều theo ma trận
        System.out.println("Giá trị các phần tử trong mảng:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%d\t",arrInt[i][j]);
            }
            System.out.printf("\n");
        }
        //6. Khai báo và khởi tạo giá trị mảng 2 chiều số thực gồm 2 dòng và 3 cột có các giá trị là
        //1.2, 1.7, 1.8, 2.2, 2.5, 2.9
        double[][] arrDouble = {{1.2,1.7,1.8},{2.2,2.5,2.9}};
        System.out.println("Giá trị các phần tử mảng: "+ Arrays.toString(arrDouble));

    }
}
