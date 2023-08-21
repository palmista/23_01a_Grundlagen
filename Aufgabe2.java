/* In dieser Aufgabe geht es um Boolesche Ausdrücke und if-Verzweigungen. Bei den Programmieraufgaben passe auf, 
 * ob eine Rückgabe (eines Werts an die aufrufende Zeile) oder eine Ausgabe (auf der Konsole) verlangt wird.
 * 
 * a) Schreibe eine Methode sort(), die drei Werte a, b, c entgegennimmt und der Grösse nach sortiert auf der
 * Konsole ausgibt.
 * 
 * b) Welche Werte werden den Variablen a, b und c in der Methode booleans() zugeordnet, wenn sie
 * mit den Argumenten x = -1, 0, 5 bzw. 10  * aufgerufen wird?
 * Du kannst (musst aber nicht) deine fertige Lösung mit Testcode überprüfen.
 * 
 * c) Vereinfache die folgenden Ausdrücke nach den Regeln von DeMorgan:
 *      !(x < y && y < z)
 *      (x != y) || !(y == z && y == x)
 *      !(x >= -3 && x <= 0) && 5 < x
 * 
 * d) Schreibe eine Methode triangle(), die die Seitenlängen a, b, c eines Dreiecks entgegennimmt und prüft, ob es
 *      - ein gültiges Dreieck
 *      - gleichseitig
 *      - gleichschenklig
 *      - rechtwinklig
 * ist. Beachte, dass ein Dreieck mehrere Bedingungen gleichzeitig erfüllen kann.
 * 
 * e) Datumsprüfung: Schreibe eine Methode isValidDate(), das ein Datum in Form dreier Zahlen day, month und year
 * entgegennimmt und als boolean zurückgibt, ob es sich um ein gültiges Datum handelt. Berücksichtige dabei auch
 * Schaltjahre. Ein Jahr ist ein Schaltjahr, wenn die Jahreszahl durch 4 teilbar ist. (Ausnahme: Jahre, die durch 100, 
 * aber nicht durch 400 teilbar sind, sind keine Schaltjahre.)
 */


public class Aufgabe2 {

    static void booleans(int x, int y, int z) {
        boolean a = x > 0 && x <= 10;
        boolean b = x < 5 || x > 9;
        boolean c = !(b || a);
    }

    public static void main(String[] args) {
        // Test-Code für Teilaufgabe a)

        // Test-Code für Teilaufgabe d)
    }

    

}
