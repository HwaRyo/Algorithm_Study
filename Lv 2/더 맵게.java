import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pque = new PriorityQueue<>();
        
        for(int i : scoville)
            pque.add(i);
        
        while(pque.peek()<K){
            if(pque.size()<=1){
                answer = -1;
                break;
            }
            int temp = pque.poll();
            int result = temp + (pque.poll()*2);
            pque.add(result);
            answer++;
        }
        return answer;
    }
}