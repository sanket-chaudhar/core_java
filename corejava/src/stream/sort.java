package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class sort {
	public static void main(String[] args) {
		List<Integer>noList=Arrays.asList(22,13,17,11
				
				,15,16,17,18,19,20);//store number list as a list
		
		
		//convert list in to stream
		List<Integer>evenlist=noList.stream().sorted().collect(Collectors.toList(
				));
		for(Integer i:evenlist) {
			System.out.println(i);
		}
	}}