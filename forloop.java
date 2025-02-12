public class forloop {
    public static void main(String[] args) {
        int n = 596;
        int reversed = 0;
        while(n>0){
            int remainder = n % 10; 
            reversed = reversed * 10 + remainder; 
           
            n = n / 10; 
            
            
            
        }
         System.out.println(reversed);
    }
}
