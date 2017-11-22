import java.util.Scanner;
public class Rovarspraket
{
    public static final String[] UNCHANGED_CHARS = {"A","E","I","O","U","Y","Å","Ä","Ö","'"," ",".","!","?",","};
    public static void main()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string to translate to Rovarspraket");
        String untranslated = scan.nextLine();
        String[] chars = getChars(untranslated);
        String[] rovarChars = changeToRovar(chars);
        String finalStr = arrayToString(rovarChars);
        System.out.println(finalStr);
    }
    public static String[] getChars(String str)
    {
        String[] ret = new String[str.length()];
        for(int i = 0; i < str.length() ; i++)
        {
            ret[i] = str.substring(i , i+1);
        }
        return ret;
    }
    
    public static String[] changeToRovar(String[] chars)
    {
        for(int i = 0; i < chars.length ; i++)
        {
            if(isConsonant(chars[i]))
            {
                chars[i] = chars[i] + "o" + chars[i];
            }
        }
        return chars;
    }
    
    public static boolean isConsonant(String str)
    {
        for(int i = 0; i < UNCHANGED_CHARS.length; i++)
        {
            if(str.equalsIgnoreCase(UNCHANGED_CHARS[i]))
            {
                return false;
            }
        }
        return true;
    }
    
    public static String arrayToString(String[] chars)
    {
        String ret = "";
        for(int i = 0; i < chars.length; i++)
        {
            ret += chars[i];
        }
        return ret;
    }
}