public class Problem2 {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int aux = 1;
        int suma = 0;
        for(int i = 0; n2 < 4000000; i ++){
            aux = n1 + n2;
            n1 = n2;
            n2 = aux;
            if(aux % 2 == 0){
                suma += aux;
            }
        }
        System.out.println(suma);
    }    
}
