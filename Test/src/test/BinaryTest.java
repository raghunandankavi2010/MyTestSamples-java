/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Raghunandan
 */

public class BinaryTest 
{

	public static void main(String arg[])
	{
		String s = "00011000";
		for(int i=0; i<s.length() ; i++)
		{
			if(i+1 < s.length() && s.charAt(i)!= s.charAt(i+1))
			{
				int index = i+1;
				char c = s.charAt(index);
				System.out.print(c);
				
				for(int j = i+2 ; j < s.length(); j++)
				{
					if(j+1 < s.length() && c != s.charAt(j))
					{
						break;
					}
					else
					{
						System.out.print(s.charAt(j));
					}
				}
				
				break;	
					
					
				}
				
			}
		}
	
}
