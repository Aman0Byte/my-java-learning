public class BinToDec {
    public static void binTODecimal(int binNum){
       int dec= binNum;
        int power = 0 ;
        int decimal= 0;
        while (binNum>0){
            int lastDigit = binNum %10;
            decimal = decimal +(lastDigit*(int) Math.pow(2 , power));
            power++;
            binNum = binNum/10;
        }
        System.out.println("The decimal of "+dec+" is-->"+decimal);
    }

    public static void main(String[] args) {
binTODecimal(101);

    }
}
