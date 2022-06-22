package funy;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class sudoku {

	public static void main(String[] args) {
		
		
		Object[] a  = new Object[9];
		Object[] b  = new Object[9];
		Object[] c  = new Object[9];
		Object[] d  = new Object[9];
		Object[] e  = new Object[9];
		Object[] f  = new Object[9];
		Object[] g  = new Object[9];
		Object[] h  = new Object[9];
		Object[] i  = new Object[9];
		
		Scanner sc = new Scanner(System.in);
		
		Random rd = new Random();
		
			
		
		
		int number = rd.nextInt(50)+1;
		int beti1 = rd.nextInt(9);
		int beti2 = rd.nextInt(9);
		int beti3 = rd.nextInt(9);
		int beti4 = rd.nextInt(9);
		int beti5 = rd.nextInt(9);
		int beti6 = rd.nextInt(9);
		int beti7 = rd.nextInt(9);
		int beti8 = rd.nextInt(9);
		int beti9 = rd.nextInt(9);
		
		
		for (int j = 0; j < number; j++) {
			a[beti1] = beti1 + 1;
			
			b[beti2] = beti2 + 1;
			c[beti3] = beti3 + 1;
			d[beti4] = beti4 + 1;
			e[beti5] = beti5 + 1;
			f[beti6] = beti6 + 1;
			g[beti7] = beti7 + 1;
			h[beti8] = beti8 + 1;
			i[beti9] = beti9 + 1;
			
			
			
			
		}
		
		
		
		System.out.println("-------------------\n" +
		"¦¢" + a[0] + "-" + a[1] + "-" + a[2] + "¦¢" + a[3] + "-" + a[4] + "-" + a[5] + "¦¢" + a[6] + "-" + a[7] + "-" + a[8] + "¦¢\n" +
		"¦¢" + b[0] + "-" + b[1] + "-" + b[2] + "¦¢" + b[3] + "-" + b[4] + "-" + b[5] + "¦¢" + b[6] + "-" + b[7] + "-" + b[8] + "¦¢\n" +
		"¦¢" + c[0] + "-" + c[1] + "-" + c[2] + "¦¢" + c[3] + "-" + c[4] + "-" + c[5] + "¦¢" + c[6] + "-" + c[7] + "-" + c[8] + "¦¢\n" +
		"-------------------\n" +
		"¦¢" + d[0] + "-" + d[1] + "-" + d[2] + "¦¢" + d[3] + "-" + d[4] + "-" + d[5] + "¦¢" + d[6] + "-" + d[7] + "-" + d[8] + "¦¢\n" +
		"¦¢" + e[0] + "-" + e[1] + "-" + e[2] + "¦¢" + e[3] + "-" + e[4] + "-" + e[5] + "¦¢" + e[6] + "-" + e[7] + "-" + e[8] + "¦¢\n" +
		"¦¢" + f[0] + "-" + f[1] + "-" + f[2] + "¦¢" + f[3] + "-" + f[4] + "-" + f[5] + "¦¢" + f[6] + "-" + f[7] + "-" + f[8] + "¦¢\n" +
		"-------------------\n" +
		"¦¢" + g[0] + "-" + g[1] + "-" + g[2] + "¦¢" + g[3] + "-" + g[4] + "-" + g[5] + "¦¢" + g[6] + "-" + g[7] + "-" + g[8] + "¦¢\n" +
		"¦¢" + h[0] + "-" + h[1] + "-" + h[2] + "¦¢" + h[3] + "-" + h[4] + "-" + h[5] + "¦¢" + h[6] + "-" + h[7] + "-" + h[8] + "¦¢\n" +
		"¦¢" + i[0] + "-" + i[1] + "-" + i[2] + "¦¢" + i[3] + "-" + i[4] + "-" + i[5] + "¦¢" + i[6] + "-" + i[7] + "-" + i[8] + "¦¢\n" +
		"-------------------");
			
		
			
				
			
			
			
			
			
			
		
			
			
			
			
			
			
			
		
		
	}

}
