import java.util.*;
class Encrypt
{
	public static String Ntext(String ch)
   {
	String d=ch.replaceAll("[^A-Za-z0-9]","");
	String c=d.replaceAll("[0-9]","");
	String uc=c.toUpperCase();
	return uc;
   }
   public static String Shiftkey(String e,int k)
   {
	   char[] am=e.toCharArray();
		for(int i=0;i<am.length;i++)
		{
			int s=((int)am[i]);
			if(s>='Z')
			{
			s=s+k-26;
			}
			else
			{
			s=s+k;
			}
			am[i]=((char)s);
		}
		String ch=String.valueOf(am);
		return ch;
	}
}
class Decrypt
{
	public static String Key(String f,int g)
	{
		char[] h=f.toCharArray();
		for(int i=0;i<h.length;i++)
		{
			int s=((int)h[i]);
			if (s<'A'+g)
			{
			s=s-g+26;
			}
            else
			{
			s=s-g;
			}
		h[i]=((char)s);
		}
       String ch=String.valueOf(h);
	   return ch;
	}
}
public class Crypto
{
	public static void main(String []args)
	{
	System.out.println("Enter your Text");
	Scanner a=new Scanner(System.in);
	String b=a.nextLine();
	String ab=Encrypt.Ntext(b);
    String ac=Encrypt.Shiftkey(ab,3);
	System.out.println(ac);
	String ag=Decrypt.Key(ac,3);
	System.out.println(ag);
	}
}