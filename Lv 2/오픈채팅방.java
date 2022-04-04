import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        String[] answer = {};
        ArrayList<String> temp = new ArrayList<>();
        HashMap<String, String> map = new HashMap<>();
        
        for(int i = 0; i<record.length; i++){
            String[] arr = record[i].split(" ");
            
            if(arr[0].equals("Enter")){
                map.put(arr[1], arr[2]);
            }else if(arr[0].equals("Leave")){              
            }else if(arr[0].equals("Change")){
                map.put(arr[1], arr[2]); 
            }else{
                System.out.println("error");
            }
        }
        
        for(int i = 0; i<record.length; i++){
            String[] arr = record[i].split(" ");
            
            if(arr[0].equals("Enter")){
                temp.add(map.get(arr[1])+"님이 들어왔습니다.");
            }else if(arr[0].equals("Leave")){  
                temp.add(map.get(arr[1])+"님이 나갔습니다.");
            }else if(arr[0].equals("Change")){
            }else{
                System.out.println("error");
            }
        }
        answer = new String[temp.size()];
        for(int i =0; i<temp.size();i++){
            answer[i]=temp.get(i);
        }
        return answer;
    }
}