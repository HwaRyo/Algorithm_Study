class Solution {
    public String solution(int n) {
        String answer = "";
        int temp=n;
        while(n!=0){
                temp=n%3;
                n/=3;
            if(temp==0){
                answer="4"+answer;
                n--;
            }else if(temp == 1){
                answer="1"+answer;
            }else if(temp == 2){
                answer="2"+answer;
            }
        }
        return answer;
    }
}