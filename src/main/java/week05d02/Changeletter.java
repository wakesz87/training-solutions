package week05d02;

public class Changeletter {
  public static final String  VOWELS = "aeiouAEIOU";

  public String changeVOWELS(String str) {
      str = str.toLowerCase();
      StringBuilder results = new StringBuilder();

      for (int i = 0; i< str.length(); i++){
          if(VOWELS.contains(str.substring(i,i+1))){
              results.append("*");
          }
      }
      return results.toString();
  }

    public static void main(String[] args) {
        Changeletter cg =  new Changeletter();
        
    }


    }


