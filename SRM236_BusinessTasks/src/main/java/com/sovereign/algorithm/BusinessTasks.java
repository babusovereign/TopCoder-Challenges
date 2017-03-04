package com.sovereign.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * #SRM 236 Div 1
 * URL: https://community.topcoder.com/stat?c=problem_statement&pm=1585&rd=6535
 * 
 */
public class BusinessTasks {
	
	public static void main(String[] args) {
		String[] list = {"zlqamum","yjsrpybmq","tjllfea","fxjqzznvg","nvhekxr","am","skmazcey","piklp",
				"olcqvhg","dnpo","bhcfc","y","h","fj","bjeoaxglt","oafduixsz","kmtbaxu",
				"qgcxjbfx","my","mlhy","bt","bo","q"};
		int n = 9000000;
		BusinessTasks bt = new BusinessTasks();
		System.out.println(bt.getTask(list, n));
	}
	
	public String getTask(String[] list, int n) {
		List<String> tasks = new ArrayList<>(Arrays.asList(list));
		int index = 0;
		while(tasks.size()>0) {
			if(tasks.size()==1) {
				break;
			}
			index = index+(n-1);
			if(index>tasks.size()-1) {
				index = index%tasks.size();
			}
			tasks.remove(index);
		}
		return tasks.get(0);
	}

}
