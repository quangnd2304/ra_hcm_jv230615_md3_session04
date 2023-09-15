package array;

public class ArrayOneDimension {
    public static void main(String[] args) {
        //1. Khai báo mảng số nguyên một chiều: Datatype[] arrayName
        int[] arrInt;
        //2. Khởi tạo mảng arrInt1 gồm 5 phần tử: arrayName = new Datatype[size]
        arrInt = new int[5];
        //3. Khai báo và khởi tạo mảng 1 chiều kiểu số thực gồm 5 phần tử
        double[] arrDouble = new double[5];
        //4. Khai báo và khởi tạo giá trị cho các phần tử chuỗi với các giá trị: Nguyễn Văn A, Nguyễn Văn B, Nguyễn Văn C
        String[] arrString = {"Nguyễn Văn A","Nguyễn Văn B","Nguyễn Văn C"};
        //5. Gán giá trị cho 5 phần tử của mảng arrInt: arrayName[index]
        arrInt[0] = 1;
        arrInt[1] = 9;
        arrInt[2] = 3;
        arrInt[3] = 5;
        arrInt[4] = 7;
       //6. In ra giá trị các phần tử mảng arrInt: Duyệt mảng 1 chiều sử dụng 1 vòng lặp
        System.out.println("Giá trị các phần tử trong mảng là:");
        for (int i = 0; i < arrInt.length; i++) {
            System.out.printf("%d\t",arrInt[i]);
        }
        System.out.printf("\n");
    }
}
