package com.nt;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("hello ram");
    }

    public String reverse(String name)
    {
    	StringBuffer sb =new StringBuffer(name);
    	return sb.reverse().toString();   }

    public int findNameLength(String name)
    {
    	System.out.println("App.findNameLength() bug 123 fixing is going on");
    	return name.length();
    	}
}
