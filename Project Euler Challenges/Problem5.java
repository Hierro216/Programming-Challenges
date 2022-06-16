public class Problem5 {
    public static void main(String[] args) {
        boolean bandera = false;
        int cont = 0;
        for(int i = 20; !bandera; i ++){
            for(int j = 1; j <= 20; j ++){
                if(i % j == 0){
                    cont ++;
                }
                if(cont == 20){
                    bandera = true;
                    System.out.println(i);
                }
            }
            cont = 0;
        }
    }
}
