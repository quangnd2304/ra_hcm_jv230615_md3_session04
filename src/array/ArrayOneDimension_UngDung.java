package array;

import java.util.Scanner;

public class ArrayOneDimension_UngDung {
    public static void main(String[] args) {
        /*
         * Nhập số phần tử của mảng (n)
         * Khai báo và khởi tạo mảng 1 chiều số nguyên gồm n phần tử
         * In ra menu và thực hiện các chức năng theo menu
         * ******************MENU**************************
         * 1. Nhập giá trị các phần tử mảng từ bàn phím (Vòng lặp)
         * 2. In ra giá trị các phần tử
         * 3. In ra các phần tử có giá trị là chẵn
         * 4. In ra các phần tử có chỉ số là chẵn
         * 5. Tính tổng các phần tử trong mảng
         * 6. Sắp xếp mảng tăng dần
         * 7. Thoát
         * */
        //Nhập số phần tử của mảng
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng:");
        int cntNumber = Integer.parseInt(scanner.nextLine());
        //Khởi tạo mảng
        int[] arrNumbers = new int[cntNumber];

        //In menu
        do {
            System.out.println("***************MENU*************");
            System.out.println("1. Nhập giá trị các phần tử mảng");
            System.out.println("2. In giá trị các phần tử");
            System.out.println("3. In giá trị các phần tử chẵn");
            System.out.println("4. In giá trị các phần tử chỉ số chẵn");
            System.out.println("5. Tính tổng giá trị các phần tử");
            System.out.println("6. Sắp xếp mảng tăng dần");
            System.out.println("7. Thoát");
            System.out.print("Lựa chọn của bạn:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    for (int i = 0; i < arrNumbers.length; i++) {
                        System.out.println("Nhập phần tử thứ " + (i + 1));
                        arrNumbers[i] = Integer.parseInt(scanner.nextLine());
                    }
                    System.out.println("Nhập xong giá trị các phần tử mảng");
                    break;
                case 2:
                    System.out.println("Giá trị các phần tử trong mảng:");
                    for (int element : arrNumbers) {
                        System.out.printf("%d\t", element);
                    }
                    System.out.printf("\n");
                    break;
                case 3:
                    System.out.println("Các phần tử có giá trị chẵn trong mảng:");
                    for (int element : arrNumbers) {
                        if (element % 2 == 0) {
                            System.out.printf("%d\t", element);
                        }
                    }
                    System.out.printf("\n");
                    break;
                case 4:
                    System.out.println("Các phần tử có chỉ số chăn trong mảng:");
                    for (int i = 0; i < arrNumbers.length; i++) {
                        if (i % 2 == 0) {
                            System.out.printf("%d\t", arrNumbers[i]);
                        }
                    }
                    System.out.printf("\n");
                    break;
                case 5:
                    int sum = 0;
                    for (int element : arrNumbers) {
                        sum+=element;
                    }
                    System.out.println("Tổng các phần tử trong mảng là: "+sum);
                    break;
                case 6:
                    //Sử dụng thuật toán selection sort
                    for (int i = 0; i < arrNumbers.length-1; i++) {
                        for (int j = i+1; j < arrNumbers.length; j++) {
                            if (arrNumbers[i]>arrNumbers[j]){
                                //Đổi chỗ 2 phần tử
                                int temp = arrNumbers[i];
                                arrNumbers[i] = arrNumbers[j];
                                arrNumbers[j] = temp;
                            }
                        }
                    }
                    System.out.println("Đã sắp xếp xong mảng tăng dần");
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng nhập 1-7");
            }
        } while (true);
    }
}
