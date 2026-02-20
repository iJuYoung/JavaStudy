import java.util.*;
import java.io.*;
/*
 * 총 배분 가능한 가로열 w 개, 세로열은 h 개. 
 * 가로가 m, 세로가 n 만큼 이니까, 사람이 앉은 자리 기준 (i,j)에서 1칸씩 이동한 다음,
 * 거기에서 n,m 을 더한 값이 다음 사용자가 이용할 수 있는자리니까,(h + n) / (n + 1) , (w + m) / (m + 1)을 하면
 * 가로에 몇명 들어가는지, 세로에 몇명 들어가는지 알 수 있음. 거기서 두개를 곱하면 자리 나옴   
 * */
public class Main {

	public static void main(String[] args) {
		try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int row = (h + n) / (n + 1);
            int col = (w + m) / (m + 1);

            System.out.println(row * col);

        } catch (IOException e) {
            System.out.println("입력 과정에서 오류가 발생했습니다: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("숫자 형식이 잘못되었습니다: " + e.getMessage());
        } catch (NoSuchElementException e) {
            System.out.println("입력 값이 부족합니다. h w n m 네 개의 값을 입력해야 합니다.");
        } catch (Exception e) {
            System.out.println("예상하지 못한 오류가 발생했습니다: " + e.getMessage());
        }

	}

}