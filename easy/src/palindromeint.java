
public static class palindromeint {

    public void palindromeint(){

    }
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }

        int dividor = 1; // build up the dividor to start with
        while (x >= (dividor * 10)){
            dividor = dividor * 10;
        }

        while(x > 0 ){
            System.out.println(x);
            System.out.println((x / dividor) + " " + (x % 10));
            int left = x / dividor;
            int right = x % 10;

            if(left != right){
                return false;
            }

            x = (x % dividor) / 10;
            dividor = dividor / 100;
            System.out.println("after passthrough "  + x);

        }
        return true;
    }
}

public static void main(String[] args){
    palindromeint x = new palindromeint();
    System.out.println(x.isPalindrome(41012014));
}
