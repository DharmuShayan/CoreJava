package info.inetsolv.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateWordSearcher {
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static void main(String[] args) {
 
    	String str="Tracxnmnmn";
    	
    	//String str="This is my First";
    	
    	List list =Arrays.asList(str.split(""));
    	
    	Set<String> uniqNum=new HashSet<String>(list);
    	for(String words:uniqNum){
    	
    		System.out.println(words +":"+ Collections.frequency(list, words));
    	}
    
   
    	
    }
}