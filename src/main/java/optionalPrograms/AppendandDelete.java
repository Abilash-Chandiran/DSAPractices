package main.java.optionalPrograms;

public class AppendandDelete {


    /*
     * Complete the 'appendAndDelete' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. STRING t
     *  3. INTEGER k
     */

    public static String appendAndDelete(String s, String t, int k) {
        
        int i=0;
        StringBuffer sb = new StringBuffer(s);
        while(i<s.length()-1){
            sb.deleteCharAt(s.charAt(i));
            sb.append(t.charAt(i));
            i++;
        }
        return s;
    }


}
