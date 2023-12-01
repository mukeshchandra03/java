public class GFG {
    public int lengthOfLastWord(final String a)
    {
        int len = 0;
        String x = a.trim();
 
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == ' ')
                len = 0;
            else
                len++;
        }
 
        return len;
    }
    public static void main(String[] args)
    {
        String input = "Geeks For Geeks  ";
        GFG gfg = new GFG();
        System.out.println("The length of last word is "
                           + gfg.lengthOfLastWord(input));
    }
}