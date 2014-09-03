
public class stockLossChecker 
{
	public static void main (String [] args)
    {
    
		int g=0;
		int t=0;
		int h=0;
		
        FileIO reader = new FileIO();
        String[] stockContents = reader.load("C:\\Users\\Brian\\stockMarket2.txt");
        
        for (int i=1;i<=stockContents.length;i++)
        {
        	for (int a=i;a<=130;a++)
        	{
        		if (i>i+1)
        		{
        			t=i;
        		}
        		if ((a<a+1)&& (a<t))
        		{
        			g=a;
        		}
        		
        	}
        }
        h=g-t;
        System.out.println(h);
    }
}