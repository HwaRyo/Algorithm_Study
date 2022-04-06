import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Deque<Integer> deque = new ArrayDeque<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        Iterator<Integer> iterator = null;
        int count = 1;
        
        for(int i=0; i<priorities.length;i++){
            deque.addLast(i);
            deque.addLast(priorities[i]);
        }
        
        while(true){
            if(deque.size()==0)
                break;
            int num = deque.pop();
            int value = deque.pop();
            boolean temp = false;
            
            iterator = deque.iterator();
            
            
            while(iterator.hasNext()){
                iterator.next();
                
                if(value<iterator.next()){
                    temp = true;
                    break;
                }
            }
            
            if(temp == false)
                map.put(num,count++);
            else{
                deque.addLast(num);
                deque.addLast(value);
            }
        }
        
        int answer = map.get(location);
        return answer;
    }
}