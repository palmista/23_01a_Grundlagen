public class Powers {
    
    /**
     * squares an integer number
     * @param base
     * @return the square of base
     */
    static int square(int base) {
        return base * base; //base ** 2 funktioniert in Java (im Gegensatz zu z.B. Python) nicht.
    }
    
    public static void main(String[] args) {
        //Test-Code für Methode square()
        int a = 5;
        System.out.println("The square of " + a + " is " + square(a));
    }
}
