package INTRO;

class Test {
    public static void main(String args[]) {
        Point p1 = new Point();
        System.out.println(p1.x + " " + p1.y);

        p1.x = 10;
        p1.y = 20;
        System.out.println(p1.x + " " + p1.y);

        /*============================== */
        Point p2=p1; // both are point to same to same memory locations 

        p2.x=30;
        System.out.println(p1.x+" "+p2.x);

    }
}

class Point {
    int x;
    int y;
}