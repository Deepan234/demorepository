package com.capg.java.exercise;

import java.util.Scanner;

public class SwethaaDemo {

	
	
	public static void main(String[] args) {
			// TODO Auto-generated method stub
	          Scanner in = new Scanner(System.in);
	          int busstation_row = in.nextInt();
	          int busstation_col = in.nextInt();
	          int busstation[][] = new int [busstation_row][busstation_col];
	          for (int idx=0; idx < busstation_row; idx++)
	          {
	        	  for (int jdx=0; jdx < busstation_col; jdx++)
	        	  {
	        		  busstation[idx][jdx]=in.nextInt();
	        	  }
	          }
	          
	          int result = busRemaining(busstation);
	          System.out.println(result);
		}

	private static int busRemaining(int[][] busstation) {
		// TODO Auto-generated method stub
		int answer=0;
		int busrank=0;
		int busrank1=0;
		int d=0;
	    for (int i=0;i<busstation.length-1;i++)
	    {
	    	for (int j=0;j<busstation.length-1;j++)
	    	{
	    	 busrank=busstation[i][j+1];
	    	 busrank1=busstation[i+1][j];
	    	 if (i==0)
	    	 {
	    		 if(busrank>busrank1)
	    		 {
	    			 answer=d+1;
		    		 d=answer;
	    		 }
	    	 }
	    	 else if(busrank1>busrank)
	    	 {
	    		 answer=d+1;
	    		 d=answer;
	    	 }
	    	 break;
	    	}
	    }
		return answer;
	}
	}


