package 정렬;
import java.util.Arrays;

// 선택정렬
public class SortEx01 {
    public static void main(String[] args) {
        int [] arr = {7,5,9,0,3,1,6,2,4,8};
        
 // 가장 적은 원소의 인덱스

        for (int i = 0; i <arr.length-1; i++) {
            int minIndex = i;
            for (int j = i+1 ; j < arr.length; j++) {
                if (arr[minIndex] > arr[j])
                    minIndex = j;
            }
        
            // 스와프
            int tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
