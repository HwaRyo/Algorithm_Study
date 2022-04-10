import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        int arr_A[] = A;
        int arr_B[] = B;
        Arrays.sort(arr_A);
        Arrays.sort(arr_B);
        
        for(int i = 0; i<arr_A.length;i++){
            answer = answer + (arr_A[i]*arr_B[(B.length-1)-i]);
        }
        return answer;
    }
}