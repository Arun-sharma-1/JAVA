package INTRO;

// import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class PatternExample{
    public static void main(String[] args) {
       String text="This is java course ";
       String patternString="is";
       
       Pattern pattern = Pattern.compile(patternString);
       Matcher matcher = pattern.matcher(text);
       int count=0;

       while(matcher.find()){
           count++;
           System.out.println("Found " + count + " time at "+ matcher.start() + " " +matcher.end() );
       }

       String s=".";
       System.out.println(s.matches("[.]"));
    }
}


/*
class regx {
    public static void main(String[] args) {
        String s="abded 45";
        String s1="abccbbaac";
        System.out.println(s.matches(".*"));
        System.out.println(s.matches("[abc]*"));
        System.out.println(s1.matches("[abc]*"));

        s="ba";
        System.out.println(s.matches("[a-z]*"));
        System.out.println(s.matches("[a-z]{2}"));


        System.out.println(s.matches("[a-z]+"));
        
    }
}
*/
