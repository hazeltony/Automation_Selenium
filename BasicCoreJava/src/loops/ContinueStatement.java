package loops;

public class ContinueStatement { //skips the step below and continue with next iteration

	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++)

		{
			if(i==5)
			{
				continue;
			}
			System.out.println(i);
		}
	}

}
