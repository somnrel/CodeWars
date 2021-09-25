package BitCounting;

public class BitCounting {

    public static int countBits(int n){
        int count = 0;
         for (int i=0; i<Integer.toBinaryString(n).length(); i++){
             if (Integer.toBinaryString(n).charAt(i) == '1'){
                 count++;
             }
         }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countBits(1234));
    }
}
