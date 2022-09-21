package Odev01_hafta;

public class Q10_Arrays {
    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Tansu";
        names[1] = "Rufet";
        names[2] = "Hulya";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("-----------------------------");

        for(String w : names){
            System.out.println(w);
        }
    }
}

