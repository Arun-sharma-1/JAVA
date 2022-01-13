package CODES;

class palindrome {
    public static void main(String[] args) {
        int noToCheck = 121;
        int a = noToCheck;
        int reverseNo = 0;
        while (noToCheck != 0) {
            int pop = noToCheck % 10;
            reverseNo = reverseNo * 10 + pop;
            noToCheck /= 10;
        }
        if (a == reverseNo)
            System.out.println("True");
        else {
            System.out.println("False");
        }

    }
}
