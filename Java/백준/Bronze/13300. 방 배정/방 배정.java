import java.util.*;
import java.io.*;
public class Main {
     public static void main(String[] args) throws IOException {
         
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 수학여행에 참가하는 학생의 수
        int k = Integer.parseInt(st.nextToken()); // 한방에 꾸겨넣을 수 있는 학생의 최대 수
        int [][] arr = new int[7][2]; // 1학년부터 6학년까지를 입력받으니까. 
        int room = 0;
        /*
         * 첫째 줄 : 수학여행에 참가하는 학생의 수 n / 한방에 배정할 수 있는 최대 인원 수 k
         * 둘째줄부터 참가하는 학생의 수만큼 반복해서 입력받기
         * 각 줄마다 학생의 성별 s와 학년 y가 공백으로 분리되어 주어짐. 
         * 	s는 0 = 여학생 / 1 = 남학생
         * 같은 학년 / 같은 성별 끼리. 
         * 
         * 학생들을 모두 배정하기 위해 필요한 최소한의 방의 수 출력
         * for문으로 첫째줄만큼 반복을 돌려가며 stringTokenizer로 집어넣기.
         * 
         * 반복문 안에서 학생 수만큼 성별과 학년을 입력받아 배열에 해당 숫자만큼의 배열 칸을 증가시킴.
         */
        for(int i=0;i<n;i++) {
        	st = new StringTokenizer(br.readLine());
        	int gender = Integer.parseInt(st.nextToken());
        	int grade = Integer.parseInt(st.nextToken());
        	
        	
        	arr[grade][gender]++;
        } // 배열에 학년 성별 인원 집계 데이터 집어넣기
        /*
    	 * 각 학년과 성별 별로 배열에 저장한 다음, 
    	 * 바깥 반복문은 학년
    	 * 안쪽 반복문은 성별
    	 * 이중 반복문 제일 안쪽에는 arr[i][j]%k==0 인 경우와 그렇지 않은 경우로 조건문을 나눠서 
    	 * room+=arr[i][j]/k; 혹은 room+=arr[i][j]+1;
    	 * -> 값이 0인거는 따로 빼서 
    	 *  
    	 */
        
        for(int i = 1;i<7;i++) {
        	if(arr[i][0] == 0) {
        		room += 0;
        	}else if(arr[i][0]%k == 0) {
        		room+=arr[i][0]/k;
        	}else {
        		room+=(arr[i][0]/k)+1;
        	}
        	if(arr[i][1] == 0) {
        		room+=0;
        	}else if(arr[i][1]%k==0) {
        		room+=arr[i][1]/k;
        	}else {
        		room+=(arr[i][1]/k)+1;
        	}
        }
        
        System.out.println(room);
        
        
     } 
}