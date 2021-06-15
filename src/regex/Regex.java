package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        /*  [abc]	Find one character from the options between the brackets
            [^abc]	Find one character NOT between the brackets
            [0-9]	Find one character from the range 0 to 9

            |	Find a match for any one of the patterns separated by | as in: cat|dog|fish
            .	Find just one instance of any character
            ^	Finds a match as the beginning of a string as in: ^Hello
            $	Finds a match at the end of the string as in: World$
            \d	Find a digit
            \s	Find a whitespace character
            \b	Find a match at the beginning of a word like this: \bWORD, or at the end of a word like this: WORD\b
            Find the Unicode character specified by the hexadecimal number xxxx
            Quantifiers
            Quantifiers define quantities:

            Quantifier	Description
            n+	Matches any string that contains at least one n
            n*	Matches any string that contains zero or more occurrences of n
            n?	Matches any string that contains zero or one occurrences of n
            n{x}	Matches any string that contains a sequence of X n's
            n{x,y}	Matches any string that contains a sequence of X to Y n's
            n{x,}	Matches any string that contains a sequence of at least X n's
        */
        String fonte = "mouse da cor azul";
        String queremosIsso = "cor";


        Pattern p = Pattern.compile(queremosIsso);
        Matcher m = p.matcher(fonte);

        while (m.find()) {
            System.out.println(m.start());
            System.out.println(m.start() +" "+ m.group() +" "+ m.end());
        }

        //-------------------------------------------------------------//
        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit W3Schools!");
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
        //----------------------------------------------------------//

        System.out.println (Pattern.matches("geeksforge*ks",
                "geeksforgeeks"));

        System.out.println (Pattern.matches("g*geeks*",
                "geeksfor"));
        //_-----------------------------------------------------------//
        Pattern pattern1 = Pattern.compile("ge*");

        Matcher matcher1 = pattern1.matcher("geeksforgeeks.org");
        while (matcher1.find())
            System.out.println("Pattern found from " + m.start() +
                    " to " + (m.end()-1));
        //------------------------------------------------------------//
        String text = "geeks1for2geeks3";

        // Specifies the string pattern which is to be searched
        String delimiter =  "\\d";
        pattern = Pattern.compile(delimiter,
                Pattern.CASE_INSENSITIVE);

        String[] result = pattern.split(text);

        for (String temp: result)
            System.out.println(temp);

        //--------------------------------------------------------------//
        String patternzied = "^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";


    }
}
