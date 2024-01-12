package oneDimensionArrayTest;

import java.io.*;
import java.util.*;

public class InputBall {
	
	
	//N,M,

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//한 라인 단위로 String 타입으로 읽어들인다. Scanner 대신 사용하는 이유는 스캐너보다 버퍼 용량이 더 커서 
		//빠르다는 장점이 있기 때문. 
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");//java.util을 import 해줘야됨
		//공백 단위로 읽어들일 수 있게 한다. BufferedReader 로 읽어들인 라인을 공백 단위로 읽어들일 수 있게 만든다. 
		//nextToken 을 사용하여 공백 단위 입력을 받아들인다. 
		
		
		int n = Integer.parseInt(st.nextToken());//공을 넣을 바구니의 갯수
		int m = Integer.parseInt(st.nextToken());//공을 넣는걸 반복할 횟수
		
		int start,end,num = 0;//start 번 바구니부터 end 번 바구니까지 num 의 번호가 적힌 공을 넣는다. 
		int bucket[] = new int[n];
		String str = "";
		
		
		//m 만큼 반복하여 start,end, num 을 입력받는다. 입력받는 것과 동시에 공을 bucket에 넣는 처리를 진행한다. 
		for(int i=0;i<m;i++) {//i 를 0부터 m 전까지 총 m번 돌린다. 
			st = new StringTokenizer(br.readLine()," ");
			
			start = Integer.parseInt(st.nextToken());
			end = Integer.parseInt(st.nextToken());
			num = Integer.parseInt(st.nextToken());
			for(int j = start-1;j<=end-1;j++) {//배열은 0부터 시작하는데 실제 입력받는 값은 1을 시작으로 가정하기 때문에, 1을 빼고 시작
				bucket[j] = num;
			}
		}
		
		for(int i=0;i<n;i++) {
			str+=bucket[i]+" ";
		}
		
		System.out.println(str);
		
		br.close();
	}

}
