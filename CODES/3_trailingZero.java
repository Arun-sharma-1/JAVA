package CODES;

class trailingZero 
{
    public static void main(String[] args) {
        int trailingNo=1200000;
        short count=0;
        while(trailingNo!=0)
        {
            if(trailingNo%2==0 && trailingNo%5==0)
            {
                count++;
                trailingNo/=10;
            }
            else
            {
                break;
            }
        }
        System.out.println(count);
    }    
}
