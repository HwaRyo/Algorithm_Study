import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridgeQue = new LinkedList<>();
        Queue<Integer> readyTruckQue = new LinkedList<>();
        int time = 0;
        int totalWeight = 0;
        
        for(int i = 0 ; i<bridge_length ; i++){
            bridgeQue.offer(0);
        }
        for(int i : truck_weights){
            readyTruckQue.offer(i);
        }
        while(!bridgeQue.isEmpty())
        {
            totalWeight-=bridgeQue.peek();
            bridgeQue.poll();

            
            if(readyTruckQue.isEmpty()){
                time+=bridge_length;
                break;
            }
            else
            {
                if((totalWeight+readyTruckQue.peek()) <= weight)
                {
                    bridgeQue.offer(readyTruckQue.peek());
                    totalWeight+=readyTruckQue.peek();
                    readyTruckQue.poll();
                }
                else {
                    bridgeQue.add(0);
                }
            }
            
            time++;      
            }
        
        return time;
    }
}