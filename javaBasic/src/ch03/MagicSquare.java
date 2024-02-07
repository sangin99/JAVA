package ch03;   // 마방진 문제해결

import java.util.Scanner;

//import java.util.Scanner;
//
//public class MagicSquare {
//
//	public static void main(String[] args) {
//		int mabang[][] = new int[5][5];
//		int row = 0;  // 가로
//		int col = 2;  // 세로
//		
//		int cnt = 1;
//		
//		mabang[row][col] = cnt++;
//		while (cnt <= 5*5) {
//			row--;
//			col++;
//		if ((row>=0 && row<5) && (col>=0 && col<5) && mabang[row][col]==0) {
//			mabang[row][col]=cnt++;
//		
//		}else if ((row>=0 && row<5) && (col>=0 && col<5) && mabang[row][col]!=0) {
//			row+=2;
//			col--;
//			mabang[row][col]=cnt++;
//		
//		}else if (row<0 && (col>=0 && col<5)) {
//			row=5-1;
//			mabang[row][col] = cnt++;
//	
//		}else if ((row>=0 && row<5) && col > 5-1) {
//			col=0;
//			mabang[row][col] = cnt++;
//			
//		}else if (row<0 && col>5-1) {
//			row+=2;
//			col--;
//			mabang[row][col]=cnt++; 
//		}	
//	}
//		for(int a=0; a<5; a++) {
//			for(int b=0; b<5; b++) {
//				System.out.println(mabang[a][b]);
//			}
//		}
		
public class MagicSquare {
	
	// 조건 //
	//	1. 1을 가장 윗줄의 중간에 배치
	//	2. 이후의 숫자들은 이전 숫자를 오른쪽 상단에 배치
	//	3. 숫자가 마방진의 범위를 벗어날 경우, 반대편프로 숫자를 옮김
	//	4. 이미 숫자가 있는 칸으로 이동하려 할 때는 바로 아래 칸에 숫자를 배치
	
	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        int size = 3;

		        try {
		            size = scanner.nextInt();
		        } catch (Exception exception) {
		            return;
		        }

		        if (size < 3 || size % 2 == 0) return;
		        int[][] magicSquare = createMagicSquare(size);

		        for (int[] array: magicSquare) {
		            for (int number: array) System.out.print(number + " ");
		            System.out.println();
		        }
		    }
	public static int[][] createMagicSquare(int size) {
		        int[][] magicSquare = new int[size][size];

		        int number = 1;
		        int row = 0;
		        int col = size / 2;
		        int currentRow = row;
		        int currentCol = col;

		        while (number <= size * size) {
		            magicSquare[row][col] = number;
		            number++;
		            currentRow = row;
		            currentCol = col;
		            row--;
		            col++;

		            if (row < 0) row = size - 1;
		            if (col == size) col = 0;

		            if (magicSquare[row][col] != 0) {
		                row = currentRow + 1 == size ? 0 : currentRow + 1;
		                col = currentCol;
		            }
		        }
		        return magicSquare;
		    }
		}
		