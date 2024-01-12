package oneDimensionArrayTest;

import java.io.*;
import java.util.*;


public class task {

	public static void main(String[] args) throws IOException {
		/*
		 * 학생이 30명. 명부에 각 1번부터 30번까지 번호 붙어있고
		 * 과제를 28명이 제출하고, 안한 나머지 2명의 출석번호를 구해라
		 */
		Scanner sc = new Scanner(System.in);
		
		boolean[] submission = new boolean[31];//제출한 애들 출석번호 받을 거
		
		for(int i = 1;i<=28;i++) {
			submission[sc.nextInt()] = true;
		}
		
		for(int i = 1;i<=30;i++) {
			if(submission[i]!=true) {
				System.out.println(i);
			}
		}
	}

}
