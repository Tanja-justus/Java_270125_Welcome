

public class Testing {

    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(istGerade(10));
        System.out.println(textGross("Test"));
        System.out.println(istPositiv(7));
    }

    //Sum Metdod
    public static int add(int a, int b) {
        return a + b;
    }

    //GeradeZahl Medhod
    public static boolean istGerade(int number) {
        return number % 2 == 0;
    }

    //Zeichenfolge in Großbuchstaben umwandelt
    public static String textGross(String text) {
        return text.toUpperCase();
    }
    //ist PositiveZahl
    public static boolean istPositiv(int zahl) {
        if (zahl>0) {
            return true;
        } else

            return false;
    }


}