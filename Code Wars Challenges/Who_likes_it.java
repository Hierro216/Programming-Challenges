class Solution {
    public static String whoLikesIt(String... names) {
        //Do your magic here
      String[] arrayNames = names;
      if(arrayNames.length == 0){
        return "no one likes this";
      }
      else if(arrayNames.length == 1){
        return arrayNames[0] + " likes this";
      }
      else if(arrayNames.length == 2){
        return arrayNames[0] + " and " + arrayNames[1] + " like this";
      }
      else if(arrayNames.length == 3){
        return arrayNames[0] + ", " + arrayNames[1] + " and " + arrayNames[2] + " like this";
      }
      else{
        int others = arrayNames.length - 2;
        String othersString = String.valueOf(others);
        return arrayNames[0] + ", " + arrayNames[1] + " and " + othersString + " others like this";
      }
    }
}