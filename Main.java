public class Main {
    public static void main(String[] args) {
        Bazowa b1 = new Bazowa();
        Bazowa b2 = new Potomna();
        Bazowa b3 = new Potomnadwa();


        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println( b3.toString());
        /*
        Mimo iz obiekt jest klasy bazowej wyswietlana jest metoda z klasy pochodnej
         */
    }
}
