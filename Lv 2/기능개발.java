class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        int temp=0;
        int count=0;
        int[] distribute = new int[progresses.length];
        boolean run = true;
        while(run){
            for(int i = count;i<progresses.length;i++)
                progresses[i] +=speeds[i];
            
            for(int i=count;i<progresses.length;i++){
                if(progresses[i]>=100){
                    int num=1;
                    if(count==progresses.length-1){
                        distribute[temp]=num;
                        count+=num;
                        temp++;
                        run=false;
                        break;
                    }else{
                        for(int j=i+1;j<progresses.length;j++){
                            if(progresses[j]>=100){
                                num++;
                                if(j==progresses.length-1)
                                    run=false;
                            }else
                                break;
                        }
                        distribute[temp++]=num;
                        count+=num;
                    }
                    break;
                }else
                    break;
            }
        }
        answer = new int[temp];
        for(int i=0;i<temp;i++){
            answer[i]=distribute[i];
        }
        return answer;
    }
}