package com.sbyyyyy.hello;

import java.util.Arrays;

public class Solution_02 {

	public String solution(String[] participant, String[] completion) {
	    Arrays.sort(participant);
	    Arrays.sort(completion);
	    int i = 0;
	    for(i=0;i < completion.length; i++)
	        if(!participant[i].equals(completion[i]))
	            break; 
		String answer =  participant[i];
		return answer;
	}

	}
