import java.util.HashMap;
import java.util.Map;

import static java.util.Map.entry;

class TwelveDays {
    private String baseSent = " twelve Drummers Drumming, eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, a Partridge in a Pear Tree.";
    private Map<Integer,String> numbersInAlpha = Map.ofEntries(
            entry(1,"first"),
            entry(2, "second"),
            entry(3,"third"),
            entry(4,"fourth"),
            entry(5,"fifth"),
            entry(6,"sixth"),
            entry(7,"seventh"),
            entry(8,"eighth"),
            entry(9,"ninth"),
            entry(10,"tenth"),
            entry(11,"eleventh"),
            entry(12,"twelfth")
    );

     String verse(int verseNumber){
         String[] sentArray = baseSent.split(",");
         String result="";
         result+="On the "+numbersInAlpha.get(verseNumber)+" day of Christmas my true love gave to me:";
         for(int i=sentArray.length-verseNumber;i<sentArray.length;i++)
         {
             if(verseNumber!=1 && i==11)
             {
                 result+=" and";
             }
             result+=sentArray[i];
             if(i!=sentArray.length-1)
             {
                 result+=",";
             }
         }
         result+="\n";
         return result;
     }

    String verses(int startVerse, int endVerse) {
      String result ="";
      for(int i=startVerse;i<=endVerse;i++)
      {
          result+=this.verse(i);
          if(i!=endVerse)
          result+="\n";
      }
      return result;
     }
    
    String sing() {
        String res = this.verses(1,12);
        return res;
     }

    public static void main(String[] args) {
         TwelveDays obj = new TwelveDays();
         System.out.println(obj.verse(2));
    }
}
