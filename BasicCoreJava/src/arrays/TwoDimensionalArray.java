package arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		String[][] data = new String[4][2];
		
		//Row 1 
		data[0][0] = "Username";
		data[0][1] = "Password";
		
		//Row 2
		data[1][0]= "Username1";
		data[1][1]= "Password1";
		
		//Row 3 
		data[2][0] = "Useranme2";
		data[2][1] = "Password2";
		
		//Row 4
		data[3][0] = "Username3";
		data[3][1]= "Password3";
		
		for (int r=0; r<data.length; r++) //another function to use the size or row and column is length function
			                     // row length = arrayname.length
		{
			for (int c=0; c<data[r].length; c++) //column size - arrayname[r].length
			{
				System.out.println(data[r][c]);
			}
		}
	}

}
