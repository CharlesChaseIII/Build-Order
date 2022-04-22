package com.rev.chall;

public class BuildOrderApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String [] projects = {"a","b","c","d","e","f"};
        String [][] dependencies = {{"a","f"},{"b","d"},{"d","a"},{"c","f"},
        {"b","c"},{"f","b"},{"a","d"}};
        
        BuildOrderImpl buildOrd = new BuildOrderImpl();
        
        try {
        	System.out.println(buildOrd.arrangeBuildOrder
        			(projects,dependencies));
        } catch(Exception e) {
        	System.out.println("index out of bound error");
        }
	}

}
