package lesson.b.spring.di.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;



@SpringBootApplication
public class MainLessonB {
	
	public static void main(String[] args) {
		
		ApplicationContext app = SpringApplication.run(MainLessonB.class, args);
		
		int[] unsorted = {2,3,1,4,5,7,6,0,9,8};
		
		SortThenSearchSpringLessonB sortSearch01 = app.getBean(SortThenSearchSpringLessonB.class);
		
		int result = sortSearch01.FindTheIndex(unsorted, 4);
		System.out.println("index is: "+ result);
	}

}