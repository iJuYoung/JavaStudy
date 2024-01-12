package oneDimensionArrayTest;

import java.io.*;
import java.util.*;
/*
 * 1번부터 n까지 번호가 적힌 바구니가 n개 <- 바구니에는 각 번호가 적힌 공이 하나씩. 
 * M번 공을 바꿈 -> 바구니 2개를 선택해서 두 바구니 속 공을 교환. 
 * M번 공을 바꾼 이후, 각 바구니에 어떤 공이 들었는지 구하는 프로그램
 */
public class changeBall {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());//바구니의 갯수
		int M = Integer.parseInt(st.nextToken());//공을 바꾸는 횟수
		int arr[] = new int[N];//바구니 n 개
		
		int tmp = 0;
		
        
		
		/*
		 * 입력 
		 * 
		 * M N
		 * M개의 줄에 공을 교환할 방법. 두 정수 i 번 바구니에 j 번 바구니에 있던 공을 교환한다. 
		 * */
		for(int i=0;i<arr.length;i++) {
			arr[i] = i+1;
		}
		
		for(int i=0;i<M;i++) {//0부터 m 이 되기 전까지, 총 m 번 루프를 돌린다. 
			st = new StringTokenizer(br.readLine());
			
			int bucket = Integer.parseInt(st.nextToken());
			int ball = Integer.parseInt(st.nextToken());
			
			tmp= arr[bucket-1];
			arr[bucket-1] = arr[ball-1];
			arr[ball-1] = tmp;
			
		}
		for(int i = 0;i<arr.length;i++) {
			bw.write(arr[i]+ " ");
		}
		
		br.close();
		bw.flush();//남아있는 데이터를 모두 출력시킴
		bw.close();
	}

}
