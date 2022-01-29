package STRINGS;
class stringBuilder {
    public static void main(String[] args) 
    {
        StringBuilder sb = new StringBuilder("Arun");
        System.out.println(sb.charAt(0));

        // set char at 0 index
        sb.setCharAt(0, 'T'); // only one char 
        System.out.println(sb);

        //insert char at any posn
        sb.insert(1,'S');
        System.out.println(sb);

        //delete element
        sb.delete(1, 2); //go upto 1,1
        System.out.println(sb);
    }
    
}
