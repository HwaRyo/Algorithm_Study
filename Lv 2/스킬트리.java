class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        int temp = -1;
        int count = 0;
        int cnt1 = 0;
        int cnt2 = 0;
        boolean possible = true;
        String[] s=skill.split("");
        
        while(true){
            for(String i : s){
                String[] arr = skill_trees[count].split("");
                for(String j : arr){
                    if(i.equals(j)){
                        if(temp==-1){
                            if(cnt1!=cnt2){
                                possible=false;
                                break;
                            }
                            temp = skill_trees[count].indexOf(j);
                            cnt2++;
                        }else if(temp>skill_trees[count].indexOf(j)){
                            possible = false;
                            break;
                        }else if(temp<skill_trees[count].indexOf(j)){
                            if(cnt1!=cnt2){
                                possible = false;
                                break;
                            }else
                            temp = skill_trees[count].indexOf(j);
                            cnt2++;
                        }
                    }                    
                }
                cnt1++;
            }
            temp=-1;
            cnt1=0;
            cnt2=0;
            if(possible==true)
                answer++;
            else
                possible=true;
            count++;
            if(skill_trees.length==count)
                break;
        }
        return answer;
    }
}