import java.util.Random;

public class Calculation {
    public static void main(String[] args) {
        final int SIZE = 5;
        int[] newArray = new int[SIZE];
        Random rd = new Random();
        for (int i = 0; i < SIZE; i++) {
            newArray[i] = rd.nextInt();
            System.out.println(newArray[i]);
        }

        int[] arrayTen = new int[10];
        for (int j = 0; j < 10; j++) {
            arrayTen[j] = j + 1;
            System.out.println(arrayTen[j]);
        }
        int[] evenArray = new int[10];
        int count = 0;
        for (int i = 0; i < arrayTen.length; i++) {

            if (arrayTen[i] % 2 == 0) {
                evenArray[count] = arrayTen[i];

                System.out.println(evenArray[count]);
                count++;
            }

        }

    }


}

