package Odev01_hafta;

public class Q16_MiniProject_Consonants {
    public static void main(String[] args) {
        char let='O';
        switch (let){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Bold vowels");
                break;
            default:
                System.out.println("thin vowels");
                break;
        }
    }

}
