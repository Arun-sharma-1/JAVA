package INTRO;

class regularExpression {
    public static void main(String[] args) {
        String s1 = "A";
        String s2 = "Ab";
        System.out.println(s1.matches(".")); // . is only for 1 char
        System.out.println(s2.matches("."));

        s2 = "b";
        System.out.println(s2.matches("[Ab]")); // checks for 1 char that is present in the string

        s2 = "p";
        System.out.println(s2.matches("[^Ab]"));
        System.out.println(" a- z and 0-9 " + s2.matches("[a-z 0-9]"));

        s2 = "abx";
        System.out.println(s2.matches("abx")); // check exactly for specified char

        // for two char
        s2 = "a7";
        System.out.println("for two char ->  " + s2.matches("[a-z][0-9]"));

        s2 = "#!";
        System.out.println("for two char ->  " + s2.matches("[^a-z A-Z][^0-9]"));

        // META CHARACTERS
        s2 = "1";
        String s3 = "a";
        System.out.println(s2.matches("\\d"));
        System.out.println(s3.matches("\\d"));

        // string contains /../ or /./ Input: ravindraravula/./
        String str = "ravindraravula/../";
        System.out.println(str.matches(".*/[.]+/"));

    }
}
