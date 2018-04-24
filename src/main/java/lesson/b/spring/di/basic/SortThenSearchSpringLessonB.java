package lesson.b.spring.di.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SortThenSearchSpringLessonB {
	
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private IsortSpringLessonB sort;
	
	public int FindTheIndex(int[] arr, int indexFor) {
		
		int[] sorted = sort.SortThisArray(arr);
		
		return getArrayIndex(arr,indexFor);
	}
	
	@PostConstruct
	private void Post() {
		log.info(" ****** POST CONSTRUCT ****** ");
		System.out.println(sort);
		
	}
	
	@PreDestroy
	private void Post2() {
		log.info(" ****** PRE DESTROY ********* ");
		
	}
	
	private int getArrayIndex(int[] arr,int value) {

        int k=0;
        for(int i=0;i<arr.length;i++){

            if(arr[i]==value){
                k=i;
                break;
            }
        }
    return k;
}
	

}
