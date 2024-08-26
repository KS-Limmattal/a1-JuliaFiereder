 
public class Methoden {

    //public static int round(int zahl){
        // TODO: implementiere hier deine Lösung für a)
         // diese Zeile darf verändert werden :-)
    //}

    public static void hours(int seconds){
        // TODO: implementiere hier deine Lösung für b)
        int hours = seconds / 3600;
        int minutes = seconds % 3600 / 60;
        seconds = seconds % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
    
    // TODO: Schreibe hier eine Methode für die Aufgabe c)
    public static void sort(int a, int b ,int c){
        if (a > b){
            int glub = a;
            a = b;
            b = glub;
        }
        if (a > c){
            int glub = a;
            a = c;
            c = glub;
        }
        if (b > c){
            int glub = b;
            b = c;
            c = glub;
        }
    }
    

    
    public static int distance(double x1, double y1, double x2, double y2){
        // TODO: implementiere hier deine Lösung für d)
        return 0; // diese Zeile darf verändert werden
    }

        public static void main(String[] args){
        // Test-Code für Teilaufgabe a)
        //System.out.println("Aufgabe a)");
        //System.out.println(round(149));
        //System.out.println(round(150));
        //System.out.println(round(-50));
        //System.out.println(round(-49));
        //System.out.println();

        // Test-Code für Teilaufgabe b)
        System.out.println("Aufgabe b)");
        // TODO: Schreibe Testcode für die Aufgabe
        hours(1234);

        // Test-Code für Teilaufgabe c)
        System.out.println("Aufgabe c)");
        // Test-Code ent-kommentieren, sobald die Funktion programmiert ist
        // sort(1, 2, 3);
        // sort(1, 3, 2);
        // sort(2, 1, 3);
        // sort(2, 3, 1);
        // sort(3, 1, 2);
        // sort(3, 2, 1);
        // sort(1, 3, 3);
        // sort(-1, -1, -1));
        System.out.println();

        // Test-Code für Teilaufgabe d)
        System.out.println("Aufgabe d)");
        // TODO: Schreibe Testcode für die Aufgabe
        System.out.println();
    }
    
}
