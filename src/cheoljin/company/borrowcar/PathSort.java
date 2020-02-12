package cheoljin.company.borrowcar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PathSort {
    public static void main(String[] args) {
        int[][] path1 = {{1, 2}, {2, 3}, {3, 4}, {8, 7}, {7, 6}}; // [1, 4, 8, 6]
        int[][] path2 = {{1, 2}, {4, 5}, {10, 9}, {3, 4}}; // [1, 2, 3, 5, 10, 9]
        int[][] path3 = {{15, 16}, {13, 12}, {1, 2}, {9, 8}, {4, 5}, {10, 9}, {3, 4}, {7, 6}}; // [1, 2, 3, 5, 7, 6, 10, 8, 13, 12, 15, 16]
        int[] result = solution(path3);
        for (int v : result) {
            System.out.print(v + " ");
        }
    }

    static int[] solution(int[][] path) {
        List<Path> paths = new ArrayList<>();
        List<Integer> result_list = new ArrayList<>();
        for (int i = 0; i < path.length; i++) {
            paths.add(new Path(path[i][0], path[i][1]));
        }
        Collections.sort(paths, new MyComparator());

        int pre_start = paths.get(0).front;
        int pre_last = paths.get(0).back;
        for (int i = 1; i < paths.size(); i++) {
            int start = paths.get(i).front;
            int last = paths.get(i).back;
            if (i == paths.size() - 1) {
                result_list.add(pre_start);
                if (pre_last != start) {
                    result_list.add(pre_last);
                    result_list.add(start);
                }
                result_list.add(last);
            } else {
                if (pre_last != start) {
                    result_list.add(pre_start);
                    result_list.add(pre_last);
                    pre_start = start;
                }
                pre_last = last;
            }
        }
        int[] result = new int[result_list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = result_list.get(i);
        }
        return result;
    }
}

class Path {
    int front;
    int back;

    public Path(int front, int back) {
        this.front = front;
        this.back = back;
    }
}

class MyComparator implements Comparator<Path> {
    @Override
    public int compare(Path o1, Path o2) {
        if (o1.front > o1.back && o2.front > o2.back) {
            if (o1.back == o2.front || o1.front == o2.back) {
                if (o1.front > o2.front) {
                    return -1;
                } else {
                    return 1;
                }
            } else {
                if (o1.front > o2.front) {
                    return 1;
                } else {
                    return -1;
                }
            }
        } else {
            if (o1.front > o2.front) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}