package test1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Number_01 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		Random rd2 = new Random();
		int adw[][] = new int[9][9];
		
		int aa = 1;
		int temp1 = rd.nextInt(3);
		int temp2 = rd.nextInt(3)+3;  
		
		boolean mm = true;
		int cnt = 0;
		
		temp1 = rd.nextInt(3);
		temp2 = rd.nextInt(3)+3;
		
		aa = 1;
		mm = true;
		cnt = 0;
		adw[rd.nextInt(3)][rd2.nextInt(3)] = aa;   
		
		adw[temp1][temp2] = aa;
		while(mm) {
			cnt = 0;
			if (adw[temp1][temp2] == adw[temp1][0] || adw[temp1][temp2] == adw[temp1][1] || adw[temp1][temp2] == adw[temp1][2]) {
				cnt = 1;
				System.out.println("啜藹");
				adw[temp1][temp2] = 0;
				temp1 = rd.nextInt(3);
				adw[temp1][temp2] = aa;
				
			}
			
			if ( cnt == 0) {
				mm = false;
			}
			
		}
		
		
		mm = true;
		temp1 = rd.nextInt(3);
		temp2 = rd.nextInt(3)+6;  // 0 = 6 1 = 7 2 = 8
		
		adw[temp1][temp2] = aa;
		while(mm) {
			cnt = 0;
			if (adw[temp1][temp2] == adw[temp1][0] || adw[temp1][temp2] == adw[temp1][1] || adw[temp1][temp2] == adw[temp1][2] || 
				adw[temp1][temp2] == adw[temp1][3] || adw[temp1][temp2] == adw[temp1][4] || adw[temp1][temp2] == adw[temp1][5]) {
				cnt = 1;
				System.out.println("啜藹");
				adw[temp1][temp2] = 0;
				temp1 = rd.nextInt(3);
				adw[temp1][temp2] = aa;
				
			}
			
			if ( cnt == 0) {
				mm = false;
			}
			
		}
		
		mm = true;
		temp1 = rd.nextInt(3)+3; // 0 2
		temp2 = rd.nextInt(3);  // 0 = 6 1 = 7 2 = 8
		
		adw[temp1][temp2] = aa;
		while(mm) {
			cnt = 0;
			if (adw[temp1][temp2] == adw[0][temp2] || adw[temp1][temp2] == adw[1][temp2] || adw[temp1][temp2] == adw[2][temp2]) {
				cnt = 1;
				System.out.println("啜藹");
				adw[temp1][temp2] = 0;
				temp2 = rd.nextInt(3);
				adw[temp1][temp2] = aa;
				
			}
			
			if ( cnt == 0) {
				mm = false;
			}
			
		}
		
		mm = true;
		temp1 = rd.nextInt(3)+6; // 0 2
		temp2 = rd.nextInt(3);  // 0 = 6 1 = 7 2 = 8
		
		adw[temp1][temp2] = aa;
		while(mm) {
			cnt = 0;
			if (adw[temp1][temp2] == adw[0][temp2] || adw[temp1][temp2] == adw[1][temp2] || adw[temp1][temp2] == adw[2][temp2] || 
					adw[temp1][temp2] == adw[3][temp2] || adw[temp1][temp2] == adw[4][temp2] || adw[temp1][temp2] == adw[5][temp2]) {
				cnt = 1;
				System.out.println("啜藹");
				adw[temp1][temp2] = 0;
				temp2 = rd.nextInt(3);
				adw[temp1][temp2] = aa;
				
			}
			
			if ( cnt == 0) {
				mm = false;
			}
			
		}
		
		mm = true;
		temp1 = rd.nextInt(3)+6; // 0 1 2 + 6 
		temp2 = rd.nextInt(3)+3;  // 0 = 6 1 = 7 2 = 8
		
		adw[temp1][temp2] = aa;
		while(mm) {
			cnt = 0;
			if (adw[temp1][temp2] == adw[temp1][0] || adw[temp1][temp2] == adw[temp1][1] || adw[temp1][temp2] == adw[temp1][2] ||
				adw[temp1][temp2] == adw[0][temp2] || adw[temp1][temp2] == adw[1][temp2] || adw[temp1][temp2] == adw[2][temp2]) {
				cnt = 1;
				System.out.println("啜藹");
				adw[temp1][temp2] = 0;
				temp1 = rd.nextInt(3)+6;
				temp2 = rd.nextInt(3)+3;
				adw[temp1][temp2] = aa;
				
			}
			
			if ( cnt == 0) {
				mm = false;
			}
			
		}
		
		mm = true;
		temp1 = rd.nextInt(3)+6; // 0 1 2 + 6 
		temp2 = rd.nextInt(3)+6;  // 0 = 6 1 = 7 2 = 8
		
		adw[temp1][temp2] = aa;
		while(mm) {
			cnt = 0;
			if (adw[temp1][temp2] == adw[temp1][0] || adw[temp1][temp2] == adw[temp1][1] || adw[temp1][temp2] == adw[temp1][2] ||
				adw[temp1][temp2] == adw[temp1][3] || adw[temp1][temp2] == adw[temp1][4] || adw[temp1][temp2] == adw[temp1][5] ||
				adw[temp1][temp2] == adw[0][temp2] || adw[temp1][temp2] == adw[1][temp2] || adw[temp1][temp2] == adw[2][temp2] ) {
				cnt = 1;
				System.out.println("啜藹");
				adw[temp1][temp2] = 0;
				temp1 = rd.nextInt(3)+6;
				temp2 = rd.nextInt(3)+6;
				adw[temp1][temp2] = aa;
				
			}
			
			if ( cnt == 0) {
				mm = false;
			}
			
		}
		
		mm = true;
		temp1 = rd.nextInt(3)+3; // 0 1 2 + 6 
		temp2 = rd.nextInt(3)+6;  // 0 = 6 1 = 7 2 = 8
		
		adw[temp1][temp2] = aa;
		while(mm) {
			cnt = 0;
			if (adw[temp1][temp2] == adw[temp1][0] || adw[temp1][temp2] == adw[temp1][1] || adw[temp1][temp2] == adw[temp1][2] ||
				adw[temp1][temp2] == adw[6][temp2] || adw[temp1][temp2] == adw[7][temp2] || adw[temp1][temp2] == adw[8][temp2] ||
				adw[temp1][temp2] == adw[0][temp2] || adw[temp1][temp2] == adw[1][temp2] || adw[temp1][temp2] == adw[2][temp2] ) {
				cnt = 1;
				System.out.println("啜藹");
				adw[temp1][temp2] = 0;
				temp1 = rd.nextInt(3)+3;
				temp2 = rd.nextInt(3)+6;
				adw[temp1][temp2] = aa;
				
			}
			
			if ( cnt == 0) {
				mm = false;
			}
			
		}

		mm = true;
		temp1 = rd.nextInt(3)+3; // 0 1 2 + 6 
		temp2 = rd.nextInt(3)+3;  // 0 = 6 1 = 7 2 = 8
		
		adw[temp1][temp2] = aa;
		while(mm) {
			cnt = 0;
			if (adw[temp1][temp2] == adw[temp1][0] || adw[temp1][temp2] == adw[temp1][1] || adw[temp1][temp2] == adw[temp1][2] ||
				adw[temp1][temp2] == adw[temp1][6] || adw[temp1][temp2] == adw[temp1][7] || adw[temp1][temp2] == adw[temp1][8] ||
				adw[temp1][temp2] == adw[6][temp2] || adw[temp1][temp2] == adw[7][temp2] || adw[temp1][temp2] == adw[8][temp2] ||
				adw[temp1][temp2] == adw[0][temp2] || adw[temp1][temp2] == adw[1][temp2] || adw[temp1][temp2] == adw[2][temp2] ) {
				cnt = 1;
				System.out.println("啜藹");
				adw[temp1][temp2] = 0;
				temp1 = rd.nextInt(3)+3;
				temp2 = rd.nextInt(3)+3;
				adw[temp1][temp2] = aa;
				
			}
			
			if ( cnt == 0) {
				mm = false;
			}
			
		}
		
		
		
		
		mm = true;
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		aa = 2;
		while(mm) {
			temp1 = rd.nextInt(3);
			temp2 = rd.nextInt(3);
			if (adw[temp1][temp2] == 1) {
			}
			else {
				adw[temp1][temp2] = aa;
				mm = false;
			}
			
			
		}
		mm = true;
		 
		
		
		
		while(mm) {
			cnt = 0;
			while(mm) {
				temp1 = rd.nextInt(3);
				temp2 = rd.nextInt(3)+3;
				if (adw[temp1][temp2] == 1) {
				}
				else {
					adw[temp1][temp2] = aa;
					mm = false;
				}
			}
			
			mm = true;
			
			if (adw[temp1][temp2] == adw[temp1][0] || adw[temp1][temp2] == adw[temp1][1] || adw[temp1][temp2] == adw[temp1][2]) {
				cnt = 1;
				System.out.println("啜藹");
				
				temp1 = rd.nextInt(3);
				
				while(mm) {
					adw[temp1][temp2] = 0;
					temp1 = rd.nextInt(3);
					temp2 = rd.nextInt(3)+3;
					if (adw[temp1][temp2] != 1) {
						adw[temp1][temp2] = aa;
						mm = false;
					}
					
				}
				mm = true;
				
				
			}
			
			if ( cnt == 0) {
				mm = false;
			}
			
		}
		
		mm = true;
		temp1 = rd.nextInt(3);
		temp2 = rd.nextInt(3)+6;  // 0 = 6 1 = 7 2 = 8
		
//		
//		
//		
//		
//			
//		while(mm) {
//			
//			temp1 = rd.nextInt(3);
//			temp2 = rd.nextInt(3)+6;
//			if (adw[temp1][temp2] != 1) {
//				adw[temp1][temp2] = aa;
//				mm = false;
//			}
//		}
//		
//		
//		mm = true;
//		cnt = 0;
//		
//		while(mm) {
//			
//			
//			if (adw[temp1][temp2] == adw[temp1][0] || adw[temp1][temp2] == adw[temp1][1] || adw[temp1][temp2] == adw[temp1][2] || 
//				adw[temp1][temp2] == adw[temp1][3] || adw[temp1][temp2] == adw[temp1][4] || adw[temp1][temp2] == adw[temp1][5]) {
//				cnt = 1;
//				System.out.println("啜藹");
//				
//				
//				while(mm) {
//					adw[temp1][temp2] = 0;
//					temp1 = rd.nextInt(3);
//					temp2 = rd.nextInt(3)+6;
//					
//					if (adw[temp1][temp2] != 1) {
//						adw[temp1][temp2] = aa;
//						mm = false;
//					}
//				}
//				mm = true;
//			}
//			
//			if ( cnt == 0) {
//				mm = false;
//			}
//			
//		}
//		
//		mm = true;
		
//		temp1 = rd.nextInt(3)+3; // 0 2
//		temp2 = rd.nextInt(3);  // 0 = 6 1 = 7 2 = 8
//		
//		adw[temp1][temp2] = aa;
//		while(mm) {
//			cnt = 0;
//			if (adw[temp1][temp2] == adw[0][temp2] || adw[temp1][temp2] == adw[1][temp2] || adw[temp1][temp2] == adw[2][temp2]) {
//				cnt = 1;
//				System.out.println("啜藹");
//				adw[temp1][temp2] = 0;
//				temp2 = rd.nextInt(3);
//				adw[temp1][temp2] = aa;
//				
//			}
//			
//			if ( cnt == 0) {
//				mm = false;
//			}
//			
//		}
//		
//		mm = true;
//		temp1 = rd.nextInt(3)+6; // 0 2
//		temp2 = rd.nextInt(3);  // 0 = 6 1 = 7 2 = 8
//		
//		adw[temp1][temp2] = aa;
//		while(mm) {
//			cnt = 0;
//			if (adw[temp1][temp2] == adw[0][temp2] || adw[temp1][temp2] == adw[1][temp2] || adw[temp1][temp2] == adw[2][temp2] || 
//					adw[temp1][temp2] == adw[3][temp2] || adw[temp1][temp2] == adw[4][temp2] || adw[temp1][temp2] == adw[5][temp2]) {
//				cnt = 1;
//				System.out.println("啜藹");
//				adw[temp1][temp2] = 0;
//				temp2 = rd.nextInt(3);
//				adw[temp1][temp2] = aa;
//				
//			}
//			
//			if ( cnt == 0) {
//				mm = false;
//			}
//			
//		}
//		
//		mm = true;
//		temp1 = rd.nextInt(3)+6; // 0 1 2 + 6 
//		temp2 = rd.nextInt(3)+3;  // 0 = 6 1 = 7 2 = 8
//		
//		adw[temp1][temp2] = aa;
//		while(mm) {
//			cnt = 0;
//			if (adw[temp1][temp2] == adw[temp1][0] || adw[temp1][temp2] == adw[temp1][1] || adw[temp1][temp2] == adw[temp1][2] ||
//				adw[temp1][temp2] == adw[0][temp2] || adw[temp1][temp2] == adw[1][temp2] || adw[temp1][temp2] == adw[2][temp2]) {
//				cnt = 1;
//				System.out.println("啜藹");
//				adw[temp1][temp2] = 0;
//				temp1 = rd.nextInt(3)+6;
//				temp2 = rd.nextInt(3)+3;
//				adw[temp1][temp2] = aa;
//				
//			}
//			
//			if ( cnt == 0) {
//				mm = false;
//			}
//			
//		}
//		
//		mm = true;
//		temp1 = rd.nextInt(3)+6; // 0 1 2 + 6 
//		temp2 = rd.nextInt(3)+6;  // 0 = 6 1 = 7 2 = 8
//		
//		adw[temp1][temp2] = aa;
//		while(mm) {
//			cnt = 0;
//			if (adw[temp1][temp2] == adw[temp1][0] || adw[temp1][temp2] == adw[temp1][1] || adw[temp1][temp2] == adw[temp1][2] ||
//				adw[temp1][temp2] == adw[temp1][3] || adw[temp1][temp2] == adw[temp1][4] || adw[temp1][temp2] == adw[temp1][5] ||
//				adw[temp1][temp2] == adw[0][temp2] || adw[temp1][temp2] == adw[1][temp2] || adw[temp1][temp2] == adw[2][temp2] ) {
//				cnt = 1;
//				System.out.println("啜藹");
//				adw[temp1][temp2] = 0;
//				temp1 = rd.nextInt(3)+6;
//				temp2 = rd.nextInt(3)+6;
//				adw[temp1][temp2] = aa;
//				
//			}
//			
//			if ( cnt == 0) {
//				mm = false;
//			}
//			
//		}
//		
//		mm = true;
//		temp1 = rd.nextInt(3)+3; // 0 1 2 + 6 
//		temp2 = rd.nextInt(3)+6;  // 0 = 6 1 = 7 2 = 8
//		
//		adw[temp1][temp2] = aa;
//		while(mm) {
//			cnt = 0;
//			if (adw[temp1][temp2] == adw[temp1][0] || adw[temp1][temp2] == adw[temp1][1] || adw[temp1][temp2] == adw[temp1][2] ||
//				adw[temp1][temp2] == adw[6][temp2] || adw[temp1][temp2] == adw[7][temp2] || adw[temp1][temp2] == adw[8][temp2] ||
//				adw[temp1][temp2] == adw[0][temp2] || adw[temp1][temp2] == adw[1][temp2] || adw[temp1][temp2] == adw[2][temp2] ) {
//				cnt = 1;
//				System.out.println("啜藹");
//				adw[temp1][temp2] = 0;
//				temp1 = rd.nextInt(3)+3;
//				temp2 = rd.nextInt(3)+6;
//				adw[temp1][temp2] = aa;
//				
//			}
//			
//			if ( cnt == 0) {
//				mm = false;
//			}
//			
//		}
//
//		mm = true;
//		temp1 = rd.nextInt(3)+3; // 0 1 2 + 6 
//		temp2 = rd.nextInt(3)+3;  // 0 = 6 1 = 7 2 = 8
//		
//		adw[temp1][temp2] = aa;
//		while(mm) {
//			cnt = 0;
//			if (adw[temp1][temp2] == adw[temp1][0] || adw[temp1][temp2] == adw[temp1][1] || adw[temp1][temp2] == adw[temp1][2] ||
//				adw[temp1][temp2] == adw[temp1][6] || adw[temp1][temp2] == adw[temp1][7] || adw[temp1][temp2] == adw[temp1][8] ||
//				adw[temp1][temp2] == adw[6][temp2] || adw[temp1][temp2] == adw[7][temp2] || adw[temp1][temp2] == adw[8][temp2] ||
//				adw[temp1][temp2] == adw[0][temp2] || adw[temp1][temp2] == adw[1][temp2] || adw[temp1][temp2] == adw[2][temp2] ) {
//				cnt = 1;
//				System.out.println("啜藹");
//				adw[temp1][temp2] = 0;
//				temp1 = rd.nextInt(3)+3;
//				temp2 = rd.nextInt(3)+3;
//				adw[temp1][temp2] = aa;
//				
//			}
//			
//			if ( cnt == 0) {
//				mm = false;
//			}
//			
//		}
//
//		
//		
//
//		
//		
//		
//		
//		
//			
//		
				
				
		System.out.println("::::::::::::::::::::::::::::::::::::");
		System.out.println("::::::::::::營塹朝 蝶紫瓔 虜菟晦 :::::::::");
		System.out.println("::::::::::::::::::::::::::::::::::::");
		System.out.println("旨收收收收收收收收收收收有收收收收收收收收收收收有收收收收收收收收收收收旬\n" +
		"早 " + adw[0][0] + " 弛 " + adw[0][1] + " 弛 " + adw[0][2] + " 早 " +	adw[0][3] + " 弛 " + adw[0][4] + " 弛 " + adw[0][5] + " 早 " + adw[0][6] + " 弛 " + adw[0][7] + " 弛 " + adw[0][8] + " 早\n" +"曳式式式式式式式式式式式朱式式式式式式式式式式式朱式式式式式式式式式式式朽\n" +
		"早 " + adw[1][0] + " 弛 " + adw[1][1] + " 弛 " + adw[1][2] + " 早 " +	adw[1][3] + " 弛 " + adw[1][4] + " 弛 " + adw[1][5] + " 早 " + adw[1][6] + " 弛 " + adw[1][7] + " 弛 " + adw[1][8] + " 早\n" +"曳式式式式式式式式式式式朱式式式式式式式式式式式朱式式式式式式式式式式式朽\n" +
		"早 " + adw[2][0] + " 弛 " + adw[2][1] + " 弛 " + adw[2][2] + " 早 " +	adw[2][3] + " 弛 " + adw[2][4] + " 弛 " + adw[2][5] + " 早 " + adw[2][6] + " 弛 " + adw[2][7] + " 弛 " + adw[2][8] + " 早\n" +"曳收收收收收收收收收收收朱收收收收收收收收收收收朱收收收收收收收收收收收朽\n" +
		
		"早 " + adw[3][0] + " 弛 " + adw[3][1] + " 弛 " + adw[3][2] + " 早 " +	adw[3][3] + " 弛 " + adw[3][4] + " 弛 " + adw[3][5] + " 早 " + adw[3][6] + " 弛 " + adw[3][7] + " 弛 " + adw[3][8] + " 早\n" +"曳式式式式式式式式式式式朱式式式式式式式式式式式朱式式式式式式式式式式式朽\n" +
		"早 " + adw[4][0] + " 弛 " + adw[4][1] + " 弛 " + adw[4][2] + " 早 " +	adw[4][3] + " 弛 " + adw[4][4] + " 弛 " + adw[4][5] + " 早 " + adw[4][6] + " 弛 " + adw[4][7] + " 弛 " + adw[4][8] + " 早\n" +"曳式式式式式式式式式式式朱式式式式式式式式式式式朱式式式式式式式式式式式朽\n" +
		"早 " + adw[5][0] + " 弛 " + adw[5][1] + " 弛 " + adw[5][2] + " 早 " +	adw[5][3] + " 弛 " + adw[5][4] + " 弛 " + adw[5][5] + " 早 " + adw[5][6] + " 弛 " + adw[5][7] + " 弛 " + adw[5][8] + " 早\n" +"曳收收收收收收收收收收收朱收收收收收收收收收收收朱收收收收收收收收收收收朽\n" +
		
		"早 " + adw[6][0] + " 弛 " + adw[6][1] + " 弛 " + adw[6][2] + " 早 " +	adw[6][3] + " 弛 " + adw[6][4] + " 弛 " + adw[6][5] + " 早 " + adw[6][6] + " 弛 " + adw[6][7] + " 弛 " + adw[6][8] + " 早\n" +"曳式式式式式式式式式式式朱式式式式式式式式式式式朱式式式式式式式式式式式朽\n" +
		"早 " + adw[7][0] + " 弛 " + adw[7][1] + " 弛 " + adw[7][2] + " 早 " +	adw[7][3] + " 弛 " + adw[7][4] + " 弛 " + adw[7][5] + " 早 " + adw[7][6] + " 弛 " + adw[7][7] + " 弛 " + adw[7][8] + " 早\n" +"曳式式式式式式式式式式式朱式式式式式式式式式式式朱式式式式式式式式式式式朽\n" +
		"早 " + adw[8][0] + " 弛 " + adw[8][1] + " 弛 " + adw[8][2] + " 早 " +	adw[8][3] + " 弛 " + adw[8][4] + " 弛 " + adw[8][5] + " 早 " + adw[8][6] + " 弛 " + adw[8][7] + " 弛 " + adw[8][8] + " 早\n" +"曲收收收收收收收收收收收朴收收收收收收收收收收收朴收收收收收收收收收收收旭");
	}
	

}
