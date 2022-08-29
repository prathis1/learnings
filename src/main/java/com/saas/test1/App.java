package com.saas.test1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
        String userName = "PrathiShetty";
        //String userName = null;
        isValidUserName(userName);
    }

    static boolean isValidUserName(String userName)
    {
        if (userName.contains("/") || userName.contains("#") || userName.contains(" ") || userName.contains("@") || userName.contains("_"))
        {
            return false;
        }
        return true;

    }

}

