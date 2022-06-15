public class FindOdd {
    public static int findIt(int[] a) {
      int count = 0;
      int odd = 0;
      for(int i = 0; i < a.length; i ++){
        for(int j = 0; j < a.length; j ++){
          if(a[i] == a[j]){
            count ++;
          }
        }
        if(count % 2 == 1){
          odd = a[i];
          break;
        }
      }
      return odd;
    }
  }
