import java.util.*;

class Solution {
    public int solution(int N, int number) {
        ArrayList<Set<Integer>> li = new ArrayList<>();
        for(int i = 0; i <= 8; i++){
            li.add(new HashSet<>());
        }
	    li.get(1).add(N);
        
        for(int j = 2; j <= 8; j++){
            Set<Integer> countSet = li.get(j);
            countSet.add(Integer.parseInt(String.valueOf(N).repeat(j)));
            
            for(int k = 1; k <= j; k++){
                Set<Integer> set1 = li.get(k);
                Set<Integer> set2 = li.get(j-k);
                
                for(int num1 : set1){
                    for(int num2 : set2){
                        countSet.add(num1 + num2);
                        countSet.add(num1 - num2);
                        countSet.add(num2 - num1);
                        countSet.add(num1 * num2);
                        if(num2 != 0){
                            countSet.add(num1 / num2);
                        }
                        if(num1 != 0){
                            countSet.add(num2 / num1);
                        }
                    }
                }   
            }
        }
        
        for(Set<Integer> set : li){
            if(set.contains(number)){
                return li.indexOf(set);
            }
        }   
        return -1;
    }
}