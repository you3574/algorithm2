package yoobin.leetcode;

import java.util.*;

public class stack {

	public static int solution(int[][] board, int[] moves) {

		int leng = board.length;
		Stack<Integer> result = new Stack<>();
		int top = 0;
		List<Stack<Integer>> list = new ArrayList<>();
		for (int i = 0; i < leng; i++) {
			Stack<Integer> line = new Stack<>();
			for (int j = leng - 1; 0 <= j; j--) {
				if (board[j][i] == 0)
					break;
				line.push(board[j][i]);
			}
			list.add(line);

		}

		System.out.println(list);

		for (int i = 0; i < moves.length; i++) {
			if (!list.get((moves[i]) - 1).isEmpty()) { 
				int r = list.get((moves[i]) - 1).pop();
				if (result.isEmpty()) {
					result.push(r);
				} else {
					if (result.peek() == r) {
						result.pop();
						top += 2;
					} else {
						result.push(r);
					}
				}
			}
		}
		return top;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] board = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 },
				{ 3, 5, 1, 3, 1 } };

		int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };
		System.out.println(solution(board, moves));
	}

}
