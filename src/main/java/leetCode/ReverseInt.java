public class ReverseInt {
    public int reverse(int x) {
        int result = 0;
        while(x!=0){
            int n = x % 10;
            x = x/10;
            if(result>Integer.MAX_VALUE/10 || result<Integer.MIN_VALUE/10)
                return 0;
            result = (result*10) + n;
        }
        return result;
    }
}
