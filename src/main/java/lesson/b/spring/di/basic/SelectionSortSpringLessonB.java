package lesson.b.spring.di.basic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Primary
@Component
public class SelectionSortSpringLessonB implements IsortSpringLessonB{

	@Override
	public int[] SortThisArray(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
		return arr;
	}



}
