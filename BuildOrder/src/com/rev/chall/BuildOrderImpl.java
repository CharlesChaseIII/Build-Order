package com.rev.chall;

import java.util.HashSet;
import java.util.List;

public class BuildOrderImpl {

	public HashSet<String> arrangeBuildOrder(String[] projects, 
			String[][] dependencies) {

	    HashSet<String> hash = new HashSet<String>();

	    for (int i = 0; i < dependencies.length; i++) {

	            int accumulator = 0;

	       for (int j = 0; j < dependencies[i].length; j++) {
		
		   while(projects.length < dependencies[i].length) {
			   	int increment = 0;
	               if(projects[increment].equals(dependencies[i][j])) {
			
			   accumulator = increment;

			   break;
			
		       }

	                   increment++;
		      
	           }

	           while(projects.length < dependencies[i].length) {
	      	        
			if(projects[accumulator].equals(dependencies[i][j]) && 
	                   j % 2 == 0) {

	                         hash.add(dependencies[i][j-1]);

	                         break;  

	                   }
	           

	               j++;
	 
	           }
	                  
			if(projects[accumulator].equals(dependencies[i][j])) {
	              
	                 	hash.add(dependencies[i][j]);
	                }
	       
	       }

	    }

	      for (int z = 0; z < projects.length; z++) {

		   if (projects[z] != dependencies[1][1]) {
	           
			hash.add(projects[z]);
	         
	           }

	            //System.out.println(hash);
		   		//return hash;
	      }
		return hash;

	  }
	
}
