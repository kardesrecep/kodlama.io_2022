package Odev01_hafta;

public class Q11_RecapDemo02 {
    public static void main(String[] args) {

        double[] myList = {1.2, 2.9, 3.7, 4.8};
        double total = 0;
    double max = myList[0];
        for (double num : myList){
            total = total + num;
            if (max<num ){
                 max= num;
            }
        }
        System.out.println("Total: " + total);
        System.out.println("Max number: " + max);
    }
}


