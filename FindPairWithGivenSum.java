//Question: Given an unsorted array of integers, find a pair with given sum in it.

import java.util.HashMap; 
import java.util.Map; 

public class FindPair
{
  
  public static void main(String[] args)
  {
    
    int[] array = new int[]{ 8, 7, 2, 5, 3, 1 };
    int sum = 10;
    
    String answer = findPair(array, sum);
    
    System.out.println(answer);
  }
  
  public static String findPair(int[] array, int sum){
  	
    Map<Integer, Integer> map = new HashMap<>(); 
    StringBuilder answer = new StringBuilder();
    
    for(int i = 0; i < array.length; i++){
      
      int realIndex = i+1;
      
      if(map.containsKey(sum - array[i])){
         int positionFirst = map.get(sum - array[i]);
      	 answer.append("Pair found: " + array[i] + " at position "+realIndex+" and " + (sum - array[i]) + " at position " + positionFirst + "\n");
      }
      
      map.put(array[i], realIndex); 
    }
    
    return answer.toString();
  }
  
}
