package Odev01_hafta;

public class Q18_FindNumber {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int searchNum = 9;
        boolean foundNum = false;

        for (int num : numbers) {
            if (num == searchNum) {
                foundNum = true;
                break;
            }
        }
        if (foundNum) {
            System.out.println(searchNum + " is found.");
        } else {
            System.out.println(searchNum + " is not found.");
        }
    }
}

