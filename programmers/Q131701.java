package programmers;

import java.io.*;
import java.util.*;

public class Q131701 {
    public int solution(int[] elements) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] strArr = input.split(" ");
        
        //배열 생성 및 정렬
        int[] intArr = new int[strArr.length];
        for(int i=0; i<intArr.length; i++){
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        Arrays.sort(intArr);
        
        //투포인터
        for(int i=0; i<intArr.length; i++){
            
        }
        
        int answer = 0;
        return answer;
    }
}
