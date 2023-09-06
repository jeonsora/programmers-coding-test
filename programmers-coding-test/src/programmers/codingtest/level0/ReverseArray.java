package programmers.codingtest.level0;

import java.util.Arrays;

public class ReverseArray {
    //문제 설명
    //정수가 들어 있는 배열 num_list가 매개변수로 주어집니다.
    // num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.

    public static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length]; // 배열 초기화
        for(int i=0; i<num_list.length; i++){
            answer[i]=num_list[(num_list.length-1)-i];
        }
        System.out.println("ReverseArray : "+Arrays.toString(answer));
        return answer;
    }
}
