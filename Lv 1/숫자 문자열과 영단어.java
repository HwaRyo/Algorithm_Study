class Solution {
    public int solution(String s) {
        String answer = "";
        String[] strArray = s.split("");
        
        for(int i=0; i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                answer = answer + strArray[i];
            }else{
                String str = strArray[i] + strArray[i+1];
                    switch(str) {
                        case "ze" :
                            answer = answer + "0";
                            i+=3;
                            break;
                        case "on" :
                            answer = answer + "1";
                            i+=2;
                            break;
                        case "tw" :
                            answer = answer + "2";
                            i+=2;
                            break;
                        case "th" :
                            answer = answer + "3";
                            i+=4;
                            break;
                        case "fo" :
                            answer = answer + "4";
                            i+=3;
                            break;
                        case "fi" :
                            answer = answer + "5";
                            i+=3;
                            break;
                        case "si" :
                            answer = answer + "6";
                            i+=2;
                            break;
                        case "se" :
                            answer = answer + "7";
                            i+=4;
                            break;
                        case "ei" :
                            answer = answer + "8";
                            i+=4;
                            break;
                        case "ni" :
                            answer = answer + "9";
                            i+=3;
                            break;
                    }
            }
               if(i>=s.length())
                    break;
        }
        return Integer.parseInt(answer);
    }      
}