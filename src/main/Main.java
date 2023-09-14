package main;

public class Main {

	public static void main(String[] args) {
		int sudoku[][]={
				{1,2,3,4,5,6,7,8,9},
				{4,5,6,7,8,9,1,2,3},
				{7,8,9,1,2,3,4,5,6},
				{2,3,1,8,9,7,5,6,4},
				{5,6,7,2,3,1,8,9,7},
				{8,9,7,5,6,4,2,3,1},
				{3,1,2,6,4,5,9,7,8},
				{6,4,5,9,7,8,3,1,2},
				{9,7,8,3,1,2,6,4,5}
		};
		
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++){
				System.out.print(sudoku[i][j]);
			}
			System.out.println("\n");
		}
	}

}
