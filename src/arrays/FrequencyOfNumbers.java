package arrays;

public class FrequencyOfNumbers {

	public static void main(String[] args) {
		int a[]= {1,2,2,2,3,4,4,5,3,7,8,7,7,7,9,100};
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=Integer.MAX_VALUE)
			{
				int c=1;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						c++;
						a[j]=Integer.MAX_VALUE;
					}
				}
				System.out.println("Frequency of "+a[i]+" is "+c);
			}
		}

	}

}
