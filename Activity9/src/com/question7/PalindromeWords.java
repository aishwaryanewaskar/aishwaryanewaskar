package com.question7;

public class PalindromeWords
{
int count=0;

private int countPalin(String str) {
   
	for (int i = 0;i<str.length()-1;i++)
	{
        char start = str.charAt(i);
        String st = "";
        st += start;
        for (int j=i+1;j<str.length(); j++) {

            st += str.charAt(j);		

            StringBuffer rev = new StringBuffer(st).reverse();		
            if(st.equals(rev.toString())&&st.length()>1) {
                System.out.println(st.toString());
                count++;		
            }
        }

        st = " ";
    }

    System.out.println("Total Count : " + count);

    return count;
}
       

	public static void main(String[] args) 
	{
		String s = "MY NANE IS AISHWARYA ";
	    PalindromeWords p= new PalindromeWords();
	    p.countPalin(s);

	}

}
