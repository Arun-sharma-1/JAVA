package STRINGS;

class method {
    static void change(String str, int arr[], StringBuffer sb) {
        str = "changed";
        arr[0] = 100;
        // sb.setCharAt(0, 'V');
        sb=new StringBuffer("V");
    }

    public static void main(String[] args) {
        String str = "Arun";
        int arr[] = { 1, 2, 3, 4 };
        String newsb = "Sharma";
        StringBuffer sb = new StringBuffer(newsb);
        change(str, arr, sb);

        System.out.println(str); // Arun
        System.out.println(arr[0]); // 100
        System.out.println(sb);//Vharma

    }
}
