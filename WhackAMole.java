 import java.util.*;

import static java.lang.Math.random;

public class WhackAMole {
int score = 0, moleLeft , attemptsLeft ;
int t;



	WhackAMole(int numAttempts, int gridDimension) {

	attemptsLeft = numAttempts;
	t = gridDimension;
	moleGrid = new char[t][t];
	for (int i = 0; i < t; i++) {
		for (int j = 0; j < t; j++) {
			moleGrid[i][j] = '0';
			System.out.print(moleGrid[i]);
			System.out.print(moleGrid[j]);
		}
	}
}
	char[][] moleGrid;

boolean place(int x, int y) {



			if (moleGrid[x][y] == '0') {
				moleGrid[x][y] = 'M';
				System.out.println(moleGrid[x][y]);
				return true;
			} else {
				return false;
			}

		}


void whack(int x, int y){

System.out.println("Game Starts");


	if(moleGrid[x][y] == 'M') {
		moleGrid[x][y] = 'W';
		System.out.println("whack");
		attemptsLeft -= 1;
		moleLeft -= 1;
		score += 10;
		System.out.println(score);

	}

		else{
			moleGrid[x][y] = 'W';
			System.out.println("try again");

			attemptsLeft-=1;
		}

	}

	public void printGrid(){
	for(int i = 0; i< moleGrid.length; i++){
		for(int j = 0; j< moleGrid.length; j++){
			System.out.println(moleGrid[i][j]);
		}
	}
	}
	public static void main(String [] args){
	Scanner sr = new Scanner(System.in);
	WhackAMole start = new WhackAMole(sr.nextInt(),sr.nextInt());
	for(int i = start.attemptsLeft; i>=0; i++){
		start.place(sr.nextInt(), sr.nextInt());
		start.whack(sr.nextInt() , sr.nextInt());

	}
}
}



