import java.util.Arrays;

class Solution {
    public static void numbers() {
        int[] data = {2, 4, 5, 4, 6};
        int n = data.length;
        int m = 8;
        int k = 3;

        /*int배열 Integer배열로 형변환
        Integer arr[] = Arrays.stream(data).boxed().toArray(Integer[]::new);
        배열 내림차순정렬
        Arrays.sort(arr, Comparator.reverseOrder());

        Integer타입 배열 int배열로 형변환
        data = Arrays.stream(arr).mapToInt(Integer::intValue).toArray();*/

        Arrays.sort(data);
        int first = data[n - 1];
        int second = data[n - 2];

        int result = 0;
        while (m > 0) {
            /*가장 큰 수를 K번 더하기*/
            for (int i = 0; i < k; i++) {
                /*M이 0이라면 반복문 탈출*/
                if (m == 0) {
                    break;
                }
                result += first;
                /*더할 때마다 1씩 빼기*/
                m -= 1;
            }
            if (m == 0) {
                break;
            }
            result += second;
            m -= 1;
        }
        System.out.println(result);

    }
}

public class Application {
    public static void main(String[] args) {
        Solution.numbers();
    }
}
