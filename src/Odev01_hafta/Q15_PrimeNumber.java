package Odev01_hafta;

public class Q15_PrimeNumber {
    public static void main(String[] args) {
        int number=25;
        int count = 0;

        for(int i = 2; i < number; i++)
        {
            if(number % i == 0) {
                count++;
            }
        }
        if (count==0){
            System.out.println(number+": is a prime number");
        }else
            System.out.println(number+": is not a prime number");

        }

    }

