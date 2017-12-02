package CzwartyZjazd;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KodTekstowyRunner {

    public static void main(String[] args) {

        String regex = "\\s\\w{3,12}\\s";//możemy wstawić spacje explicite
        String text = "Secret John 007, kom.: 777-999-000, lives at SchwabStrasse 7 @Stutgart)";
        String regex2 = "[0-9]{2}-[0-9]{3} ";
        String regex3 = "\\w+@\\w+\\.[A-Za-z]{2,3}"; //"[A-Za-z0-9._-]+@[A-Za-z0-9._-]+\\.[A-Za-z]{2,4}";
        String regex4 = "A[KLRZ]|C[AOT]";//"""[A-Z]{2}";PRZESZUKIWANIE KONKRETNEGO ZBIORU
        String regex5 = "hobby: .*";
        String text2 ="Jan Kowalski, ur. 20.02.1987 r., zam. ul. Jutrzenki 105, 02-716 Warszawa, odwiedził stany: CA i AL, e-mail: janekk87@gmail.com, kom.: (+48) 789-215-618, hobby: kung fu, wieprzowina, Xiaomi";

        //printRegexResults(regex, text);
        printRegexResults(regex2,text2);
        printRegexResults(regex3,text2);
        printRegexResults(regex4, text2);
        printRegexResults(regex5,text2);



        //lub
        // printRegexResults("\\s\\w{3,12}\\s", "Secret John 007, kom.: 777-999-000, lives at SchwabStrasse 7 @Stutgart);");
    }

    public static void printRegexResults(String regxStr, String testStr) {

        Pattern regex = Pattern.compile(regxStr);

        Matcher matcher = regex.matcher(testStr);

        while(matcher.find()) {
            if(matcher.group().length() !=0) {
                System.out.println(matcher.group().trim());
            }

            System.out.println("Start index: "+matcher.start());
            System.out.println("End index: "+matcher.end());
        }
    }


}

