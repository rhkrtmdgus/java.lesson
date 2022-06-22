package koreait.day15;

import java.util.ArrayList;
import java.util.Random;


public class sudo11 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		
		Object[][] adw = new Object[9][9];
		ArrayList<Integer> number = new ArrayList<Integer>(9);
		
		int kkk = 0;
		Object uuq;
		Object kaku;
		int cnt1 = 0;
		boolean review = true;   //
		int review22 = 0;
		while (review) {
			
			for (int t = 0; t < 9; t++) {  // 중복없이 만들기
				number.add(t+1);
				if (number.size() == 9) {
					for (int p = 0; p < 9; p++) { 
						adw[0][p] = (int)number.get(rd.nextInt(number.size()));  // 0 8 7들어감 7인덱스 들어감 겟에
						number.remove(adw[0][p]);					
						if(number.size() == 0) {					// 1 2 3 4 5 6 7 8 9
							break;
						}
						
					}
				}
			}
			for (int t = 0; t < 9; t++) {  // 중복없이 만들기
				number.add(t+1);
				if (number.size() == 9) {
					for (int p = 0; p < 9; p++) { 
						adw[1][p] = (int)number.get(rd.nextInt(number.size()));  // 0 8 
						number.remove(adw[1][p]);
						if(number.size() == 0) {
							break;
						}
						
					}
				}
			}
			for (int t = 0; t < 9; t++) {  // 중복없이 만들기
				number.add(t+1);
				if (number.size() == 9) {
					for (int p = 0; p < 9; p++) { 
						adw[2][p] = (int)number.get(rd.nextInt(number.size()));  // 0 8 
						number.remove(adw[2][p]);
						if(number.size() == 0) {
							break;
						}
						
					}
				}
			}
			for (int t = 0; t < 9; t++) {  // 중복없이 만들기
				number.add(t+1);
				if (number.size() == 9) {
					for (int p = 0; p < 9; p++) { 
						adw[3][p] = (int)number.get(rd.nextInt(number.size()));  // 0 8 
						number.remove(adw[3][p]);
						if(number.size() == 0) {
							break;
						}
						
					}
				}
			}
			for (int t = 0; t < 9; t++) {  // 중복없이 만들기
				number.add(t+1);
				if (number.size() == 9) {
					for (int p = 0; p < 9; p++) { 
						adw[4][p] = (int)number.get(rd.nextInt(number.size()));  // 0 8 
						number.remove(adw[4][p]);
						if(number.size() == 0) {
							break;
						}
						
					}
				}
			}
			for (int t = 0; t < 9; t++) {  // 중복없이 만들기
				number.add(t+1);
				if (number.size() == 9) {
					for (int p = 0; p < 9; p++) { 
						adw[5][p] = (int)number.get(rd.nextInt(number.size()));  // 0 8 
						number.remove(adw[5][p]);
						if(number.size() == 0) {
							break;
						}
						
					}
				}
			}
			for (int t = 0; t < 9; t++) {  // 중복없이 만들기
				number.add(t+1);
				if (number.size() == 9) {
					for (int p = 0; p < 9; p++) { 
						adw[6][p] = (int)number.get(rd.nextInt(number.size()));  // 0 8 
						number.remove(adw[6][p]);
						if(number.size() == 0) {
							break;
						}
						
					}
				}
			}
			for (int t = 0; t < 9; t++) {  // 중복없이 만들기
				number.add(t+1);
				if (number.size() == 9) {
					for (int p = 0; p < 9; p++) { 
						adw[7][p] = (int)number.get(rd.nextInt(number.size()));  // 0 8 
						number.remove(adw[7][p]);
						if(number.size() == 0) {
							break;
						}
						
					}
				}
			}
			for (int t = 0; t < 9; t++) {  // 중복없이 만들기
				number.add(t+1);
				if (number.size() == 9) {
					for (int p = 0; p < 9; p++) { 
						adw[8][p] = (int)number.get(rd.nextInt(number.size()));  // 0 8 
						number.remove(adw[8][p]);
						if(number.size() == 0) {
							break;
						}
						
					}
				}
			}
			for (int sero3 = 0; sero3 < 9; sero3++) {
				for (int sero = 1; sero < 9; sero++) { 
					if (adw[0][sero3] == adw [sero][sero3]) { // 0 0 , 1 0   00, 20 00, 30 00, 40 00, 50 00 , 60 00, 70 00, 80
																// 
						adw [sero][sero3] = " ";
					}
				}
				for (int sero = 2; sero < 9; sero++) { 
					if (adw[1][sero3] == adw [sero][sero3]) {
						adw [sero][sero3] = " ";
					}
				}
				for (int sero = 3; sero < 9; sero++) { 
					if (adw[2][sero3] == adw [sero][sero3]) {
						adw [sero][sero3] = " ";
					}
				}
				for (int sero = 4; sero < 9; sero++) { 
					if (adw[3][sero3] == adw [sero][sero3]) {
						adw [sero][sero3] = " ";
					}
				}
				for (int sero = 5; sero < 9; sero++) { 
					if (adw[4][sero3] == adw [sero][sero3]) {
						adw [sero][sero3] = " ";
					}
				}
				for (int sero = 6; sero < 9; sero++) { 
					if (adw[5][sero3] == adw [sero][sero3]) {
						adw [sero][sero3] = " ";
					}
				}
				for (int sero = 7; sero < 9; sero++) { 
					if (adw[6][sero3] == adw [sero][sero3]) {
						adw [sero][sero3] = " ";
					}
				}
				for (int sero = 8; sero < 9; sero++) { 
					if (adw[7][sero3] == adw [sero][sero3]) {
						adw [sero][sero3] = " ";
					}
				}
			}
			
			for (int m1 = 0; m1 <3; m1++) {    // 첫 번째
				for(int m2 = 0; m2 < 3; m2++) {
					uuq = adw[m1][m2];
					for (int qqqw = 0; qqqw < 3; qqqw++) {
						for (int qqqw2 = 0; qqqw2 < 3; qqqw2++) {
							if (uuq == adw [qqqw][qqqw2]) { // 00 00 00 01 00 02 10 11 
								adw [qqqw][qqqw2] = " ";
								
							}
						}
					}
					adw[m1][m2] = uuq;
				}
			}
			
			for (int m1 = 0; m1 <3; m1++) {  //두 번째
				for(int m2 = 3; m2 < 6; m2++) {
					uuq = adw[m1][m2];				// 3 3
					for (int qqqw = 0; qqqw < 3; qqqw++) {  // 0 1 2 
						for (int qqqw2 = 3; qqqw2 < 6; qqqw2++) {
							if (uuq == adw [qqqw][qqqw2]) { // 33 33 33 34 33 35
								adw [qqqw][qqqw2] = " ";
								
							}
						}
					}
					adw[m1][m2] = uuq;
				}
			}
			
			for (int m1 = 0; m1 <3; m1++) { //세 번째 박스
				for(int m2 = 6; m2 < 9; m2++) {
					uuq = adw[m1][m2];
					for (int qqqw = 0; qqqw < 3; qqqw++) {
						for (int qqqw2 = 6; qqqw2 < 9; qqqw2++) {
							if (uuq == adw [qqqw][qqqw2]) { // 00 00 00 01 00 02 10 11 
								adw [qqqw][qqqw2] = " ";
								
							}
						}
					}
					adw[m1][m2] = uuq;
				}
			}
			
			for (int m1 = 3; m1 <6; m1++) { // 네 번째 박스
				for(int m2 = 0; m2 < 3; m2++) {
					uuq = adw[m1][m2];
					for (int qqqw = 3; qqqw < 6; qqqw++) {
						for (int qqqw2 = 0; qqqw2 < 3; qqqw2++) {
							if (uuq == adw [qqqw][qqqw2]) { // 00 00 00 01 00 02 10 11 
								adw [qqqw][qqqw2] = " ";
								
							}
						}
					}
					adw[m1][m2] = uuq;
				}
			}
			
			for (int m1 = 3; m1 <6; m1++) { // 다섯 번째 박스
				for(int m2 = 3; m2 < 6; m2++) {
					uuq = adw[m1][m2];
					for (int qqqw = 3; qqqw < 6; qqqw++) {
						for (int qqqw2 = 3; qqqw2 < 6; qqqw2++) {
							if (uuq == adw [qqqw][qqqw2]) { // 00 00 00 01 00 02 10 11 
								adw [qqqw][qqqw2] = " ";
								
							}
						}
					}
					adw[m1][m2] = uuq;
				}
			}
			
			for (int m1 = 3; m1 <6; m1++) { // 여섯 번째 박스
				for(int m2 = 6; m2 < 9; m2++) {
					uuq = adw[m1][m2];
					for (int qqqw = 3; qqqw < 6; qqqw++) {
						for (int qqqw2 = 6; qqqw2 < 9; qqqw2++) {
							if (uuq == adw [qqqw][qqqw2]) { // 00 00 00 01 00 02 10 11 
								adw [qqqw][qqqw2] = " ";
								
							}
						}
					}
					adw[m1][m2] = uuq;
				}
			}
			
			for (int m1 = 6; m1 <9; m1++) { // 일곱 번째 박스
				for(int m2 = 0; m2 < 3; m2++) {
					uuq = adw[m1][m2];
					for (int qqqw = 6; qqqw < 9; qqqw++) {
						for (int qqqw2 = 0; qqqw2 < 3; qqqw2++) {
							if (uuq == adw [qqqw][qqqw2]) { // 00 00 00 01 00 02 10 11 
								adw [qqqw][qqqw2] = " ";
								
							}
						}
					}
					adw[m1][m2] = uuq;
				}
			}
			
			for (int m1 = 6; m1 <9; m1++) { // 여덟 번째 박스
				for(int m2 = 3; m2 < 6; m2++) {
					uuq = adw[m1][m2];
					for (int qqqw = 6; qqqw < 9; qqqw++) {
						for (int qqqw2 = 3; qqqw2 < 6; qqqw2++) {
							if (uuq == adw [qqqw][qqqw2]) { // 00 00 00 01 00 02 10 11 
								adw [qqqw][qqqw2] = " ";
								
							}
						}
					}
					adw[m1][m2] = uuq;
				}
			}
			
			for (int m1 = 6; m1 <9; m1++) { // 아홉 번째 박스
				for(int m2 = 6; m2 < 9; m2++) {
					uuq = adw[m1][m2];
					for (int qqqw = 6; qqqw < 9; qqqw++) {
						for (int qqqw2 = 6; qqqw2 < 9; qqqw2++) {
							if (uuq == adw [qqqw][qqqw2]) { // 00 00 00 01 00 02 10 11 
								adw [qqqw][qqqw2] = " ";
								
							}
						}
					}
					adw[m1][m2] = uuq;
				}
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
	
	

}
