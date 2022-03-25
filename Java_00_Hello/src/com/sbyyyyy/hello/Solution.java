//package com.sbyyyyy.hello;
//
//import java.util.HashMap;
//
//public class Solution {
//	public String solution(String[] participant, String[] completion) {
//		HashMap<String, Integer> parti = new HashMap<>();
//		HashMap<String, Integer> confi = new HashMap<>();
//
//		for (String player : participant) {
//			if (parti.containsKey(player)) {
//				parti.put(player, parti.get(player) + 1);
//			} else {
//				parti.put(player, 1);
//			}
//		}
//
//		for (String player : completion) {
//			if (confi.containsKey(player)) {
//				confi.put(player, confi.get(player) + 1);
//			} else {
//				confi.put(player, 1);
//			}
//		}
//		String answer = "";
//		for (String key : confi.keySet()) {
//			parti.put(key, parti.get(key) - 1);
//			if (parti.get(key) == 0) {
//				parti.remove(key);
//			}
//		}
//		String temp = parti.keySet().toString();
//		answer = temp.substring(1, temp.length() - 1);
//		System.out.println(answer);
//		
//		return "";
//	}
//}
