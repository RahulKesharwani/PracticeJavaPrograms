package com.javaconceptoftheday;

public class FinalVariableCheck {

	public static void main(String[] args)
    {
        System.out.println(methodReturningValue());
    }
 
    static int methodReturningValue()
    {
        try
        {
            return 40;
        }
        catch (Exception e)
        {
        	return 50;
        	//This block may or may not return a value as finally block is returning a value
        }
        finally
        {
          System.out.println("Testing");
        }
    }
}
