package yoobin.socar;

import java.util.ArrayList;

class Torso {
	int head;
	int tail;

	public Torso(int head, int tail) {

		this.head = head;
		this.tail = tail;
	}

}

public class number1 {

	public static int[] solution(int[][] paths) {
		// list생성
		ArrayList<Torso> torsos = new ArrayList<Torso>();

		// 길이만큼 돌면서 머리랑 꼬리 값 넣기
		for (int i = 0; i < paths.length; i++) {
			Torso torso = new Torso(paths[i][0], paths[i][1]);
			torsos.add(torso);
		}

		int size = torsos.size();
		System.out.println(size);
		
		for (int i = 0; i < size; i++) {
			int tail = torsos.get(i).tail;
			for (int j = 0; j < size; j++) {
				if (tail == torsos.get(j).head) {
					tail = torsos.get(j).tail;
					torsos.get(i).tail = torsos.get(j).tail;
					torsos.remove(torsos.get(j));  
					size--;
			
				}
			}
		}
		
		System.out.println(torsos.size());
		int[] answer = new int[torsos.size() * 2];
		int index = 0;
		for (Torso b : torsos) {
			answer[index] = b.head;
			answer[index + 1] = b.tail;
			index += 2;
		}

		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] A = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 8, 7 }, { 7, 6 } };
		int[][] B = { { 1, 2 }, { 4, 5 }, { 10, 9 }, { 3, 4 } };
		int[][] path3 = {{15, 16}, {13, 12}, {1, 2}, {9, 8}, {4, 5}, {10, 9}, {3, 4}, {7, 6}};
		int[] result = solution(path3);
		for (int v : result) {
			System.out.print(v + " ");
		}

	}

}
