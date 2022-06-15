public class BitCounting {

    public static int countBits(int n){
      // Show me the code!
      if(n >= 0){
        int aux = n;
        int cont = 1;
        for(int i = 0; n / 2 >= 1; i ++){
          n = n / 2;
          cont ++; 
        }
        System.out.println(cont);
        int[] bin = new int[cont];
        for(int i = 0; i < cont; i ++){
          bin[i] = aux % 2;
          aux = aux / 2;
        } 
        int unos = 0;
        for(int i = 0; i < cont; i ++){
          if(bin[i] == 1){
            unos ++;
          }
        }
        return unos;
      }
      else{
        System.out.println("Error, el número introducido es negativo");
        return 1;
      }
    }
    
  }
