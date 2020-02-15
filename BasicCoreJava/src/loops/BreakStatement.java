package loops;

public class BreakStatement { //breaks the loop once the condition is satisfied

	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++)

		{
			System.out.println(i);

			if (i == 5)

			{

				break;
			}
		}
	}

}
