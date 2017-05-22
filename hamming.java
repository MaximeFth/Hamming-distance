import java.util.Arrays;
import java.util.List;

public class hamming {

    public hamming() {
    }
    private static int HammingDistance(String One, String Two)
    {
       if (One.length() != Two.length())
        return -1;

       int counter = 0;

       for (int i = 0; i < One.length(); i++)
       {
           if (One.charAt(i) != Two.charAt(i)) counter++;
       }

       return counter;
    }
    public static void main(String [] args){
        int min=80;
        List<String> ls=Arrays.asList("0000000","0011111","0100110","0111001","1001101", "1010010","1101011","1110100");
        for (int i=0; i< ls.size(); ++i){
            for (int j=0; j<ls.size(); ++j){
                
                if (HammingDistance(ls.get(i),ls.get(j))!=0){
                    if (min>=HammingDistance(ls.get(i),ls.get(j))){
                        min=HammingDistance(ls.get(i),ls.get(j));
                        System.out.println(ls.get(i)+" "+  ls.get(j));
                    }
                }
            }
        }
        System.out.println(min);
    }

}
