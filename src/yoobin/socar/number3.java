package yoobin.socar;

import java.util.*;

public class number3 {

	static public int solution(int nums[]) {
		int stop[] = new int[nums.length]; // 방문 확인
		int stopnum = nums.length - 1; //

		Queue<Integer> qu = new LinkedList<Integer>();

		qu.offer(0); // 맨처음

		while (!qu.isEmpty()) { // qu에 값이 있을때
			int pop = nums[qu.peek()]; // 값
			int idx = qu.poll(); // 위치
			int front = idx + pop; // 위치+값 앞으로
			int back = idx - pop; // 위치-값 뒤로

			if (front == stopnum || back == stopnum) { // 마지막 원소일때
				if (front == stopnum)
					return stop[idx] + 1;
				else
					return stop[idx] + 1;
			}

			// +0 -0이기 때문에 더 갈 곳이 없으므로 pop 해준다
			if (pop == 0)
				continue;

			if (front >= 0 && front < nums.length && (back < 0 || back >= nums.length)) {
				// front만
				qu.offer(front);
				stop[front] = stop[idx] + 1;


			} else if (back >= 0 && back < nums.length && (front < 0 || front >= nums.length)) {
				// back만
				qu.offer(back);
				stop[back] = stop[idx] + 1;
				
				
			} else if ((front >= 0 && front < nums.length) && (back >= 0 && back < nums.length)) {
				// front & back 둘 다
				qu.offer(front);
				qu.offer(back);

				stop[front] = stop[idx] + 1;
				stop[back] = stop[idx] + 1;
				
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int n[] = { 4, 1, 2, 3, 1, 0, 5 };
		int n2[] = { 1, 3, 5, 0, 4 };
		int n3[] = {1,1,1,3,0,1,2};		

		System.out.println("answer = " + solution(n3));
	}
}