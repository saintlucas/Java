package zadaniaPierwszyPakiet;

public class PierwszeZadania {
    public static void main (String[] args) {

        //System.out.println("Jestem programistą");

        String imie = "Lukasz";
        int wiek = 37;
        int liczba1 = 5;
        int liczba2 = 10;

        System.out.println("Czesc, moje imie to" + " " + imie);
        System.out.println("Mam" + " " + wiek + " lat.");
        System.out.println(liczba1 + liczba2);
        System.out.println(liczba1 * liczba2);
        System.out.println(liczba2 / liczba1);

        int i = 15;

        if (i % 2 == 0) {
            System.out.println("Liczba jest parzysta");
        } else {
            System.out.println("Liczba jest nieparzysta");
        }

        if (i % 3 == 0 && i % 5 == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }


        //        public int suma(int a, int b){
//            return a + b;  //ta metoda zwraca sumę dwóch parametrów
//        }
//
//        public int roznica(int a, int b){
//            return a - b;  //ta metoda zwraca róźnicę dwóch parametrów
//        }
//
//        public int suma(int a, int b){
//            return a * b;  //ta metoda zwraca iloczyn dwóch parametrów
//
    }

}
