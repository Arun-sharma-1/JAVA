package INTRO;

class Output {
    public static void main(String[] args) {
        System.out.println("arun sharma"); // next instruction move to next line
        System.out.print("sharmaji"); // next instr. doesn't move to nxt line
        System.out.println("kushal ");

        int x = 10;
        int y = 20;

        System.out.println(x + y + " sum ");
        System.out.println("sum " + x + y);
        System.out.format("sum " + (x + y));

        System.out.println();

        float a= 12.45f;
        // System.out.printf("%60.2f ", a);
        System.out.printf("%060.2f ", a);
        


        String s ="Arun Sharma";
        System.out.printf("%-20s",s);
        // System.out.printf("%20s",s);
        System.out.printf("arun");


        // UNICODES 
        int code ='A';
        System.out.println(code);

    }
}
