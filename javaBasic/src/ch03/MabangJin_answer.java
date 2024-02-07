package ch03;

import java.util.Scanner;

public class MabangJin_answer {

	public static void main(String[] args) throws Exception {

		Scanner scan = new Scanner(System.in);
		System.out.print("행의 개수: ");
		int size = scan.nextInt();
	
		int[][] mat = new int[size][size];  //사이즈에 맞게 배열 생성
		int row = 0, col = (size - 1) / 2;// 행 , 열  0, 중간에서 시작
	
		int cnt = 1; //1부터 시작 

		// 처음에 첫행의 중간에서 시작함
		mat[row][col] = cnt++;
		while (cnt <= (size * size)) {// 3x3 의 경우 9까지만 찍히고 10부터는 나와야함 , 5x5는 25까지 찍히고 26부터는 나와야함.
			// 오른쪽 위로 올려주는 작업 행 -1 , 열 +1
			row--;
			col++;
			if ((row>=0 && row<size) && (col>=0 && col<size) && mat[row][col]==0) { //위치가 마방진 안에 있고 그 안에 숫자가 없을경우.
				mat[row][col]=cnt++;//숫자 넣어줌
				
			}else if((row>=0 && row<size) && (col>=0 && col<size) && mat[row][col]!=0) { //위치가 마방진 안에있고 숫자가 있을경우
				//row ++, col--로 원상태로 돌아와서  한칸 내려주면 된다. 즉 row++을 한번 더 해준다.
				row+=2;
				col--;
				mat[row][col]=cnt++;
				
 			}else if(row<0 && (col>=0 && col<size)) {// 행 부분이 밖으로 나갔을 경우 ex -1,2 이럴땐 4,2 처럼 맨 끝에 넣어줌.
 				row=size-1;// 행을 맨 끝으로 보내줌 .	
 				mat[row][col]=cnt++;
 				
 			}else if((row>=0 && row<size) && col >size-1) {// 열 부분만 밖으로 나갔을 경우.  
 				// ex )3x3 행렬에서의 1,3 같은 경우 행은 고정하고 열은 맨끝으로 보내야함 .
 				col=0; //맨 처음으로 보냄 .
 				mat[row][col]=cnt++;
 				
 			}else if (row<0 && col>size-1) {// 둘다 마방진 사이즈보다 큰곳으로 튀어나갈 경우
 				//되돌아와서 한칸 아래로 내려간다 . row++ , col-- 이후 한칸 내려가므로 row++
 				row+=2;
 				col--;
 				mat[row][col]=cnt++;
			}

		}
		
		//출력
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				System.out.printf("%3d ",mat[i][j]);
			}
			System.out.println();
		}

	}
}


