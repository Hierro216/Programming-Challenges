public class Problem3 {
    public static void main(String[] args) {
        long n = 600851475143l;
        long i = 2l;
        long max = 0l;
        boolean bandera = false;
        boolean bandera2 = false;
        while(i <= 600851475143l && !bandera2){ 
            while(n % i == 0){
                bandera = true;
                if(n / i == 1){
                    bandera2 = true;
                    break;
                }
                n = n / i;
            }
            if(bandera && i > max){
                max = i;
            }
            bandera = false;
            i ++;
        }   
        System.out.println(max);
    }
}
