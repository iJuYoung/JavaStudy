package oneDimensionArrayTest;

import java.io.*;
import java.util.*;

public class fliedBucket {

	
	/* N 개의 바구니, 
	 * M 번의 역순 정렬
	 * 
	 * N개의 배구니, M번의 역순정렬 반복
	 * i 번째 바구니부터 j 번째 바구니까지 역순정렬. 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());//바구니 갯수
		int m = Integer.parseInt(st.nextToken());//반복
		int[] bucket = new int[n];//n 개 만큼 생성되는 바구니
		int a,b;//a 번째부터 b 번째까지
		int tmp;
		
		for(int i=0;i<bucket.length;i++) {
			bucket[i] = i+1;
		}
		
		for(int i = 0;i<m;i++) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken())-1;
			b = Integer.parseInt(st.nextToken())-1;
			
			while(a<b) {//a 가 b 보다 작다면
				tmp = bucket[a];
				bucket[a] = bucket[b];
				bucket[b] = tmp;
				a++;
				b--;
			}
		}
		br.close();
		
		for(int i = 0;i<bucket.length;i++) {
			bw.write(bucket[i]+ " ");
		}
		bw.close();
	}

}
