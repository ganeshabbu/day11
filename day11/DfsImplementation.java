package day11; 

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class DfsImplementation {
	private Map<String, List<String>> socialcircle = new HashMap<String, List<String>>();
	private Set<String> visited = new HashSet<String>();
	public void addPerson(String currentperson,String connectedPerson) {
		socialcircle.computeIfAbsent(currentperson, k -> new ArrayList<>()).add(connectedPerson);
		socialcircle.computeIfAbsent(connectedPerson, k -> new ArrayList<>());
	}
	public void dfs(String currentperson) {
		if(visited.contains(currentperson)) return;
		visited.add(currentperson);
		System.out.println("visited persons "+ currentperson);
		for(String neighbour : socialcircle.getOrDefault(currentperson,  new ArrayList<>())) {
			 dfs(neighbour);
		}
	}
	 
	public static void main(String[] args) {
		 DfsImplementation s = new DfsImplementation();
		 s.addPerson("Ganesh", "manaswin");
		 s.addPerson("Ganesh", "chaitanya");
		 s.addPerson("manaswin", "Akshay");
		 s.addPerson("manaswin", "dhanusha");
		 s.addPerson("chaitanya", "subhash");
		 s.addPerson("dhansha", "affrin");
		 s.dfs("Ganesh");
		 
		 
		 

	}

}
