import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Reverse{
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int row,col;
	row = scn.nextInt();
	col = scn.nextInt();
	int[][] arr = new int[1000][1000];
	for(int i = 0; i < row; i++)
	{
		for(int j = 0;j < col;j++)
		{
			arr[i][j] = scn.nextInt();
		}
	}
	int minzero= 0,count,min=100000;
	for(int i = 0; i < row; i++)
	{
		count = 0;
		for(int j = 0;j < col;j++)
		{
			if(arr[i][j] == 1)
			{
				count++;
				
			}
		}
		if(count<min)
			minzero = i;
			min = count;
	}
	System.out.println(minzero+1);
}}
