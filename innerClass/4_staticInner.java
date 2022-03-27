package innerClass;

class Test
{
    public static void main(String[] args) {
        outer.inner i = new outer.inner();
        i.display();
       
         
    }
}


class outer {
    static class inner {
        void display() {
            System.out.println("static inner class");
        }
        public static void show()
        {
            System.out.println("static inner class static method");
        }

    }
}

