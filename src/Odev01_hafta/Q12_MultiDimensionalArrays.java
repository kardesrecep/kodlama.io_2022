package Odev01_hafta;

public class Q12_MultiDimensionalArrays {
    public static void main(String[] args) {
        String[][] cities = new String[3][3];
        cities[0][0] = "Konya";
        cities[0][1] = "Istanbul";
        cities[0][2] = "Ankara";
        cities[1][0] = "Trabzon";
        cities[1][1] = "Aydin";
        cities[1][2] = "Kocaeli";

        cities[2][0] = "Bartin";
        cities[2][1] = "SanliUrfa";
        cities[2][2] = "Ordu";
        for (int i = 0; i <cities.length ; i++) {
            for (int j =0 ; j < cities[i].length ; j++) {
                System.out.println(cities[i][j]);
            }
        }

            System.out.println("----------------------------");
        }
    }


