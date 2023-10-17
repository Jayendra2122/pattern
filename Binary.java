public class Binary {
    public static void BinTodec(int binNum) {
       int Mynumber=binNum;
        int dec = 0;
        int pow = 0;
        while (binNum > 0) {
            int lastdigit = binNum % 10;
            dec = dec + (lastdigit * (int) Math.pow(2, pow));
            binNum = binNum / 10;
            pow++;

        }
        System.out.println(" dicimal of " +Mynumber+" = "+dec);

    }
    public static void decTobin(int decNum) {
       int  Mydec=decNum;
        int bin=0;
        int pow=0;
        while(decNum>0){
           int decN=decNum%2;
            bin=bin+(decN*(int)Math.pow(10,pow));
            decNum=decNum/2;
            pow++;
        }
        System.out.print("binary number of "+Mydec+"="+bin);
    }

    public static void main(String[] args) {
        BinTodec(111);
        decTobin(9);

    }
}
