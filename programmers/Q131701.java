package programmers;

import java.util.*;
import java.util.stream.*;
public class Q131701 {
    public int solution(int[] elements) {
        int elements_len = elements.length;
        List<Integer> intList = new ArrayList<>();
    
        for(int i=0; i<elements_len; i++){
            int sum = 0;
            for(int len=1; len<=elements_len; len++){
                int index = (i + len - 1) % elements_len;
                sum += elements[index];
                intList.add(sum);
            }
        }
        
        List<Integer> distinctList = intList
                                        .stream()
                                        .distinct()
                                        .collect(Collectors.toList());
    
        int answer = distinctList.size();
        return answer;
    }
}
