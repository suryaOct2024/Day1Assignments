package week1.day1.HomeAssignments;

public class FindOddNumbers {

	public static void main(String[] args) {
		
		int maxRange = 10;
		System.out.println("The odd numbers from 1 to 10 are:");
		for(int i=1; i<= maxRange; i++)
		{
			if(i%2 == 1)
				System.out.println(i);
		}
	}

}
