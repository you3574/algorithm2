package yoobin.socar;

import java.util.*;

public class number3 {

	static public int solution(int nums[]) {
		int stop[] = new int[nums.length]; // �湮 Ȯ��
		int stopnum = nums.length - 1; //

		Queue<Integer> qu = new LinkedList<Integer>();

		qu.offer(0); // ��ó��

		while (!qu.isEmpty()) { // qu�� ���� ������
			int pop = nums[qu.peek()]; // ��
			int idx = qu.poll(); // ��ġ
			int front = idx + pop; // ��ġ+�� ������
			int back = idx - pop; // ��ġ-�� �ڷ�

			if (front == stopnum || back == stopnum) { // ������ �����϶�
				if (front == stopnum)
					return stop[idx] + 1;
				else
					return stop[idx] + 1;
			}

			// +0 -0�̱� ������ �� �� ���� �����Ƿ� pop ���ش�
			if (pop == 0)
				continue;

			if (front >= 0 && front < nums.length && (back < 0 || back >= nums.length)) {
				// front��
				qu.offer(front);
				stop[front] = stop[idx] + 1;


			} else if (back >= 0 && back < nums.length && (front < 0 || front >= nums.length)) {
				// back��
				qu.offer(back);
				stop[back] = stop[idx] + 1;
				
				
			} else if ((front >= 0 && front < nums.length) && (back >= 0 && back < nums.length)) {
				// front & back �� ��
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