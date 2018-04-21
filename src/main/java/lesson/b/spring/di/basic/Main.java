package lesson.b.spring.di.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import lesson.a.ten.java.di.SortThenSearch;

@SpringBootApplication
public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext app = SpringApplication.run(Main.class, args);
		
		int[] unsorted = {2,3,1,4,5,7,6,0,9,8};
		
		SortThenSearch sortSearch = app.getBean(SortThenSearch.class);
		
		int result = sortSearch.FindTheIndex(unsorted, 4);
		System.out.println("index is: "+ result);
	}

}