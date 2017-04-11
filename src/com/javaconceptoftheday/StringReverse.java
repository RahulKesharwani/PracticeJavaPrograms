package com.javaconceptoftheday;

public class StringReverse {

	public static void main(String[] args) {
		
		StringBuffer sbf = new StringBuffer("This is Java class");
		System.out.println(sbf.reverse());
		
		StringBuilder builder = new StringBuilder("MyJava");
		System.out.println(builder.reverse());
		String str = "MyJava";
		 
		char[] strArray = str.toCharArray();
		 
		for (int i = strArray.length - 1; i >= 0; i--)
		{
		    System.out.print(strArray[i]);     //Output : avaJyM
		}
		System.out.println(new StringBuilder(str).reverse().toString());
		System.out.println(recursiveMethod(str));
		
		System.out.println(arryMethodToReverse(str));
	}
	
	static String recursiveMethod(String str)
	{
	     if ((null == str) || (str.length() <= 1))
	     {
	            return str;
	     }
	 
	     return recursiveMethod(str.substring(1)) + str.charAt(0);
	}
	/*static String otherMethod(String string) {

		char[] charArray = string.toCharArray();
		int start = 0 ;
		int end = charArray.length-1 ;

		while(end > start ){

		char ch = charArray[start];
		charArray[start] = charArray[end];
		charArray[end] = ch ;

		start++;
		end--;

		}
	
	return new String(charArray).intern();

	}*/
	public static String arryMethodToReverse(String message){
		char[] stringMsg = message.toCharArray();
		//char[] reverseMsg = new char[message.length()];
		StringBuilder builder = new StringBuilder();
		for(int i=stringMsg.length-1; i>0; i++){
			builder += stringMsg[i];
		}
		return new StringBuilder(message).reverse().toString(); 
	}

}
