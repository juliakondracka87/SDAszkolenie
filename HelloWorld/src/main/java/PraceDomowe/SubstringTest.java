package PraceDomowe;

public class SubstringTest {
    public static void main(String[] args) {

        String jakJest = "przefantastycznie";
        System.out.println("Jak jest? "+jakJest);
        System.out.println("Wyciągamy od 4 indeksu do 7, ale bez niego i wychodzi: "+jakJest.substring(4,7));

        System.out.println("Pod indeksem 9 znajduje się litera: "+jakJest.charAt(9));
        jakJest = "super";
        System.out.println("Zamieniłam przefantastycznie na: "+jakJest);
        System.out.println("Litera p ma indeks o numerze : "+jakJest.indexOf("p"));
        System.out.println("Ten wyraz ma : "+jakJest.length()+" znaków.");
        System.out.println("NAPISZMY TEN WYRAZ Z DUŻYCH LITER: "+jakJest.toUpperCase());
        System.out.println("o znów jest z małych: "+jakJest);
        String male ="abc";
        String duze = "ABC";
        System.out.println("Czy ciąg abc jest równy ABC? "+male.equals(duze));//false
        System.out.println("Czy ciąg abc jest równy ABC ignorując wielkość liter? "+male.equalsIgnoreCase(duze));//true
        System.out.println("Czy wyraz zaczyna się na literę l? "+jakJest.startsWith("l"));//rozróżnia wielkość liter
        System.out.println("Czy wyraz zawiera ciąg upe? "+jakJest.contains("upe"));
        System.out.println("Zamieńmy literki z s na d: "+jakJest.replace('s','d'));
        System.out.println(jakJest);
        String bazowe = " anna ";
        String bezspacji = bazowe.trim();
        String dużeLitery = bazowe.toUpperCase();
        char initial = bazowe.charAt(0);
        char zmienione = "anna".trim().toUpperCase().charAt(0);
        System.out.println(" bazowe = "+bazowe);
        System.out.println("bez spacji = "+bezspacji);
        System.out.println("z dużych liter "+dużeLitery);
        System.out.println("duża litera "+initial);
        System.out.println("zmienione = "+zmienione);
    }
}
