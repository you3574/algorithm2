package jimin.leetcode;

import java.util.ArrayList;

public class Socar1 {

	public static int[] solution(int[][] paths) {
		int[] answer = {};
		boolean tf=true;
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < paths.length; i++) {

			if (list.isEmpty()) {
				list.add(paths[i][0]);
				list.add(paths[i][1]);
				for (int k = 0; k < list.size(); k++) {
					System.out.println(list.get(k));
				}
				System.out.println("--------------------------");
			} else {

				

				if (paths[i][0] < paths[i][1]) {
					for (int j = 0; j < list.size(); j += 2) {
						tf = true;
						if (list.get(j) == paths[i][1]) {
							list.set(j, paths[i][0]);
							list.set(j + 1, list.get(j + 1));
							for (int k = 0; k < list.size(); k++) {
								System.out.println(list.get(k));
							}
							System.out.println("--------------------------00");
						} else if (list.get(j + 1) == paths[i][0]) {
							list.set(j, list.get(j));
							list.set(j + 1, paths[i][1]);
							for (int k = 0; k < list.size(); k++) {
								System.out.println(list.get(k));
							}
							System.out.println("---------------------------01");
						} else
							tf = false;
					}

				}

				else {

					for (int j = 0; j < list.size(); j += 2) {

						if (list.get(j) == paths[i][1]) {

							list.set(j, paths[i][0]);
							list.set(j + 1, list.get(j + 1));
							for (int k = 0; k < list.size(); k++) {
								System.out.println(list.get(k));
							}
							System.out.println("--------------------------10");

						}

						else if (list.get(j + 1) == paths[i][0]) {

							list.set(j, list.get(j));
							list.set(j + 1, paths[i][1]);
							for (int k = 0; k < list.size(); k++) {
								System.out.println(list.get(k));
							}
							System.out.println("--------------------------11");

						}

						else
							tf = false;

					}

				}

				if (!tf) {
					list.add(paths[i][0]);
					list.add(paths[i][1]);

					for (int k = 0; k < list.size(); k++) {
						System.out.println(list.get(k));
					}
					System.out.println("--------------------------3");
				}

			}

		}
		System.out.println("result");
		for (int i1 = 0; i1 < list.size(); i1++) {
			System.out.println(list.get(i1));
		}
		return answer;
	}

	public static void main(String[] args) {
		int[][] paths = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 8, 7 }, { 7, 6 } };
		// int[][] paths = {{1, 2}, {4, 5}, {10, 9}, {3, 4}};
		int[] answer = solution(paths);

		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
	}

}
