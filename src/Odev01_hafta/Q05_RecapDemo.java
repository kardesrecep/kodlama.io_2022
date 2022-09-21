package Odev01_hafta;

public class Q05_RecapDemo {
    public static void main(String[] args) {
        int num1 = 57;
        int num2 = 345;
        int num3 = 3;
        int max = num1;

        if (max < num2) {
            max = num2;
        }
        if (max < num3) {
            max = num3;
        }
        System.out.println("Max num = " + max);
    }
}

