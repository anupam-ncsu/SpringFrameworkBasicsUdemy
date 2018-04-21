package lesson.b.spring.di.basic;

import lesson.a.ten.java.di.Isort;


public class BubbleSort implements Isort {

	@Override
	public int[] SortThisArray(int[] arr) {
		int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++)
         {  
             for(int j=1; j < (n-i); j++)
             {  
                  if(arr[j-1] > arr[j])
                  {  
                         //swap elements  
                         temp = arr[j-1];  
                         arr[j-1] = arr[j];  
                         arr[j] = temp;  
                 }  
                      
             }  
         }
         return arr;
	}


}
