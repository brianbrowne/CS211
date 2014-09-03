
public class TSPproblem
{
	public static void main(String[] args)
	{
		FileIO reader = new FileIO();
		String[] contents = reader.load("D:\\TSPlocations.txt");
		double[] values = new double[contents.length];
		double [] SecondValues = new double[contents.length];
		
		for(int j=1;j<contents.length;j++)
		{
			values[contents.length-j]=Double.parseDouble(contents[j].substring(14,20));
			SecondValues[contents.length-j]=Double.parseDouble(contents[j].substring(22,27));
		}
		for (int a=1;a<=100;a++)
		{
			System.out.print(a+ ",");
		}
		double currentLat=0;
		double currentLong=0;
		double libertyLat=0;
		double libertyLong=0;
		double totalDistance=0;
		
		for (int z=1; z<=values.length-1;z++)
		{
			if(values[z]>values[z-1])
			{
				currentLat = Math.toRadians(values[z]);
			}
			if (SecondValues[z]>SecondValues[z-1]&&SecondValues[z]==values[z])
			{
				currentLong =Math.toRadians(SecondValues[z]);
			}
			if (values[z]>values[z-1])
			{
				libertyLat = Math.toRadians(values[z]); 	
			}
			if (SecondValues[z]>SecondValues[z-1]&&SecondValues[z]==values[z])
			{
				libertyLong =Math.toRadians(SecondValues[z]);
			}
			values[z]=0;
			totalDistance=totalDistance+haversinDistance(currentLat, libertyLat, currentLong, libertyLong);
		}
		System.out.println("Distance is "+totalDistance);
	}
	
	public static double haversinDistance(double lat1, double lat2, double lon1, double lon2)
	{
		double r=6371; //radius of sphere in kilometers, Earth = 6,400km
		double h = (haversin(lat2 - lat1))+(((Math.cos(lat1))*(Math.cos(lat2))*haversin(lon2-lon1)));

		double distance = (2)*(r)*(Math.asin(Math.sqrt(h)));
		return distance;
	}
	
	public static double haversin(double arg)
	{
		double result = (1 - Math.cos(arg))/(2);
		return result;	
	}
}