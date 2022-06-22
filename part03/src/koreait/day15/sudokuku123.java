package koreait.day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;



public class sudokuku123 {

	public static void main(String[] args) {
		
		
		Object[][] adw = new Object[9][9];
		
		Random rd = new Random();
		
		
		int number1 = 0;
		int number2 = 0;
		int j = 0;
		int cnt = 0;
		
		sudokuku123 su = new sudokuku123();		
		
		
		while (j < 9) {
			j++;
			
			number1 = rd.nextInt(9);
			number2 = rd.nextInt(9);
			
			
			
			if (j == 8)
				j = 0;
				cnt ++;
			if (cnt == 60) {
				break;
			}
			adw[number1][number2] = rd.nextInt(9)+1;
			
			
			
			
		}	
			
		
		
		
		Object[] objjj = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(Arrays.toString(objjj));
		// 우측으로 비교 ( 중복값 검사 )
		for (int az = 0; az < 9; az++) { // 0
			for (int bz = 0; bz < 8; bz++) {  //  0 1
				for(int cz = 1; cz < 9; cz++) {
					
						
					
					
				
					 
				}
			}
				
		}
		
		for (int qq = 0; qq < 9; qq++) {
			for(int qq2 = 0; qq2 < 9; qq2++) {
				
				if(adw[qq][qq2] == null)
					adw[qq][qq2] = " ";
			}
		}
		
		
		System.out.println("::::::::::::::::::::::::::::::::::::");
		System.out.println("::::::::::::재밌는 스도쿠 만들기 :::::::::");
		System.out.println("::::::::::::::::::::::::::::::::::::");
		System.out.println("┏━━━━━━━━━━━┳━━━━━━━━━━━┳━━━━━━━━━━━┓\n" +
		"┃ " + adw[0][0] + " │ " + adw[0][1] + " │ " + adw[0][2] + " ┃ " +
		adw[0][3] + " │ " + adw[0][4] + " │ " + adw[0][5] + " ┃ " + 
		adw[0][6] + " │ " + adw[0][7] + " │ " + adw[0][8] + " ┃\n" +
		"┣───────────╋───────────╋───────────┫\n" +
		"┃ " + adw[1][0] + " │ " + adw[1][1] + " │ " + adw[1][2] + " ┃ " +
		adw[1][3] + " │ " + adw[1][4] + " │ " + adw[1][5] + " ┃ " + 
		adw[1][6] + " │ " + adw[1][7] + " │ " + adw[1][8] + " ┃\n" +
		"┣───────────╋───────────╋───────────┫\n" +
		"┃ " + adw[2][0] + " │ " + adw[2][1] + " │ " + adw[2][2] + " ┃ " +
				adw[2][3] + " │ " + adw[2][4] + " │ " + adw[2][5] + " ┃ " + adw[2][6] + " │ " + adw[2][7] + " │ " + adw[2][8] + " ┃\n" +
		"┣━━━━━━━━━━━╋━━━━━━━━━━━╋━━━━━━━━━━━┫\n" +
		"┃ " + adw[3][0] + " │ " + adw[3][1] + " │ " + adw[3][2] + " ┃ " +
		adw[3][3] + " │ " + adw[3][4] + " │ " + adw[3][5] + " ┃ " + adw[3][6] + " │ " + adw[3][7] + " │ " + adw[3][8] + " ┃\n" +
		"┣───────────╋───────────╋───────────┫\n" +
		"┃ " + adw[4][0] + " │ " + adw[4][1] + " │ " + adw[4][2] + " ┃ " +
		adw[4][3] + " │ " + adw[4][4] + " │ " + adw[4][5] + " ┃ " + adw[4][6] + " │ " + adw[4][7] + " │ " + adw[4][8] + " ┃\n" +
		"┣───────────╋───────────╋───────────┫\n" +
		"┃ " + adw[5][0] + " │ " + adw[5][1] + " │ " + adw[5][2] + " ┃ " +
		adw[5][3] + " │ " + adw[5][4] + " │ " + adw[5][5] + " ┃ " + adw[5][6] + " │ " + adw[5][7] + " │ " + adw[5][8] + " ┃\n" +
		"┣━━━━━━━━━━━╋━━━━━━━━━━━╋━━━━━━━━━━━┫\n" +
		"┃ " + adw[6][0] + " │ " + adw[6][1] + " │ " + adw[6][2] + " ┃ " +
		adw[6][3] + " │ " + adw[6][4] + " │ " + adw[6][5] + " ┃ " + adw[6][6] + " │ " + adw[6][7] + " │ " + adw[6][8] + " ┃\n" +
		"┣───────────╋───────────╋───────────┫\n" +
		"┃ " + adw[7][0] + " │ " + adw[7][1] + " │ " + adw[7][2] + " ┃ " +
		adw[7][3] + " │ " + adw[7][4] + " │ " + adw[7][5] + " ┃ " + adw[7][6] + " │ " + adw[7][7] + " │ " + adw[7][8] + " ┃\n" +
		"┣───────────╋───────────╋───────────┫\n" +
		"┃ " + adw[8][0] + " │ " + adw[8][1] + " │ " + adw[8][2] + " ┃ " +
		adw[8][3] + " │ " + adw[8][4] + " │ " + adw[8][5] + " ┃ " + adw[8][6] + " │ " + adw[8][7] + " │ " + adw[8][8] + " ┃\n" +
		"┗━━━━━━━━━━━┻━━━━━━━━━━━┻━━━━━━━━━━━┛");
			
		
		
		
		
		
	}
	
//	public Object methodA(Object a) {
//		Random kk2 = new Random();
//		int ddd = kk2.nextInt(9)+1;
//		
//		if (a == null) {
//			return " ";
//		}
//		else return ddd;
//			
//		
//		
//	}

}
