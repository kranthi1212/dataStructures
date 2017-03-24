package interviewQuestions;

import java.util.Scanner;

/**
 * @author Kranthi
 *
 */
public class RecursiveStairs {
	private static int getPaths(int steps){
		if(steps <0 )
			return 0;
		if(steps == 0)
			return 1;
		return getPathsR(steps-1)+getPathsR(steps-2);
	}
	
	private static int getPathsR(int steps){
		return getPathsR(steps,new int[steps+1]);
	}
	private static int getPathsR(int steps,int[] paths){
			if(steps <0)
				return 0;
		if(steps ==0 )
			return 1;
		if(paths[steps] ==0){
			
			paths[steps] = getPathsR(steps-1,paths) + getPathsR(steps-2, paths);
			System.out.println("steps = "+steps+" paths[steps] = "+paths[steps]);
		}
		return paths[steps];
	}
	
	private static int getPathsDP(int steps){
		if(steps <0)
			return 0;
		if(steps == 0)
			return 1;
		int[] paths = new int[steps+1];
		paths[0] =1;
		paths[1]=1;
		for(int i=2;i<=	steps;i++){
			paths[i] = paths[i-1]+paths[i-2];
		}
		return paths[steps];
	}
	
	
	
	public static void main(String []args){
		 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter total steps");
		int steps =scan.nextInt();
	
		//recurisve memorization approach
		//int totalPaths = getPaths(steps);
		
		//Dynamic programing approch using for loops
		int totalPaths =  getPathsDP(steps);
		System.out.println("Totals paths = "+totalPaths);
		scan.close();
		
	}
}
