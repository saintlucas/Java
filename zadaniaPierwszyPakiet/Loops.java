package zadaniaPierwszyPakiet;


public class Loops {
    public static void main(String[] args) {

        printFrom0ToX(10);
        printFrom0ToNWithWhileLoop(9);
        printCharPerLine(12345);
        System.out.println(reverse("pies"));
        printBinary(9);
        System.out.println(isPalindrome("anagrammargana"));

        printArray(new int[]{1,2,3});

        int [] inputaArray = new int []{1,2,3,4,5};
        bubbleSort(inputaArray);
        printArray(inputaArray);


    }

    // metoda odwracająca kolejność elementów w tablicy
    private static String reverse(String word) {

        //nasza tablica, zrzucamy znaki w stringu do tablicy chars
        char[] chars = word.toCharArray();

        /** pętla od 1 do 1/2 tablicy ponieważ zamieniamy raz element
         ostatni z pierwszym, przedostatni z drugim itd aż dojedziemy do środka tablicy
         */
        for (int currentCharIndex = 0; currentCharIndex < chars.length / 2; currentCharIndex++) {


            //zmienna tymczasowa dla tymczasowego przechowywania wartości
            char tempChar = chars[currentCharIndex];

            /** kopiowanie wartości do kolejnych komórek z miejsca chars.length-1-i bo:
             // chars.length: (długość tablicy)
             // -1: bo ostatni indeks w tablicy jest
             // o 1 mniejszy niż nr. ostatniego indeksu
             // -i: przesuwamy się o 1 od końca do środka
             */
            int currentCharFromEndIndex = chars.length - currentCharIndex - 1;

            /**zamiana wartosci pierwszego elementu z wartością ostatniego
             wartości drugiego z wartością przedostatniego itd do środka tablicy
             i skopiowanie tymczasowo wartości do zmiennej tymczasowej
             */
            chars[currentCharIndex] = chars[currentCharFromEndIndex];
            chars[currentCharFromEndIndex] = tempChar;
        }

        String result = "";
        for (int i = 0; i < chars.length; i++) {
            result += chars[i];
        }
        return result;
    }

    private static void printFrom0ToX(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }
    }

    private static void printFrom0ToNWithWhileLoop(int n) {

        int index = 0;

        while (index <= n) {
            System.out.println(index++);
        }
    }

    private static void printCharPerLine(int number) {
        while (number > 0) {
            int reminder = number % 10;
            number /= 10;
            System.out.println(reminder);
        }

    }

    private static boolean isPalindrome(String word) {

        char[] chars = word.toCharArray();

        for (int i = 0; i < chars.length / 2; i++) {
            char currentletter = chars[i];
            char correspondatLetterFromEnd = chars[chars.length - i - 1];
            if (!(currentletter == correspondatLetterFromEnd)) {
                return false;
            }
        }
        //return true;
        return word.equals(reverse(word));
    }

    public static void printBinary(int number) {

        String binaryReversed = "";

        while (number > 0) {
            binaryReversed += number % 2;
            number /= 2;
        }
        System.out.println(reverse(binaryReversed));
    }

    public static void printArray(int[] array) {
        System.out.println("[");
        for (int i = 0; i < array.length; i++) {
            boolean isLastOne = i == array.length - 1;
            if (isLastOne) {
                System.out.println(array[i]);
            } else {
                System.out.println(array[i]);
                System.out.println(", ");
            }
        }
    }
    //sortowanie elementów tablicy od najmniejszegp do największego
    public static void bubbleSort (int [] array){
        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                        int tmp = array[j];
                        array[j] = array [i];
                        array[i] = tmp;
                }
            }
        }
    }


}
