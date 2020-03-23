package com.klu;

public class Deleting {
		public static String del(String str)
		{
			int strlen=str.length();
			String res="";
			if(strlen>=1)
			{
				if(str.charAt(0)!='A')
					res=str;
				if(str.charAt(0)=='A') {
					if(strlen>2)
						res=str.substring(1);
				}
				if(strlen>=2&&str.charAt(0)=='A'&& str.charAt(1)=='A')
					res=str.substring(2);
				if(str.charAt(0)!='A'&&str.charAt(1)=='A')
					res=str.substring(0,1)+str.substring(2);
					
			}
			return res;
		}

}
