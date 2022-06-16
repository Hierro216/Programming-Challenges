public class Problem4 {

    public static void main(String[] args) {
        
        boolean bandera = false;
        int mult = 1;
        int recorrer = 0;
        int x = 0;
        int y = 1;
        int max = 0;
        for(int i = 100; i < 1000; i ++){
            for(int j = 100; j < 1000; j ++){
                recorrer = 0;
                x = 0;
                y = 1;
                mult = i * j;
                String multString = String.valueOf(mult);
                if(multString.length() % 2 == 0){
                    while(recorrer < multString.length() / 2){
                        if(multString.charAt(0 + x) == multString.charAt(multString.length() - y)){
                            bandera = true;    
                        }
                        else{
                            bandera = false;
                            break;
                        }
                        y ++;
                        x ++;
                        recorrer ++;
                    }
                }
                else if(multString.length() % 2 == 1){
                    while(recorrer < (multString.length() / 2) + 1){
                        if(multString.charAt(0 + x) == multString.charAt(multString.length() - y)){
                            bandera = true;    
                        }
                        else{
                            bandera = false;
                            break;
                        }
                        y ++;
                        x ++;
                        recorrer ++;    
                    }
                }
                if(bandera){
                    if(max < mult){
                        max = mult;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
