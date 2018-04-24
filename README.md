**lesson.a.ten.java.di :**
Like a Good OO coding, we made object of SortThenSearch.
We made new object of the Search algorithm that we want to plug in (bubblesort).
We injected the dependency (bubblesort) into Execution.
This gives the CONTROL of the execution to the user

With Spring we want to get rid of Dependency injection and thus do inversion of control from USER to FRAMEWROK
Spring should create the object and inject it where ever it is required. Thus INVERSION OF CONTROL from user to FRAMEWORK

**lesson.b.spring.di.basic :**
First iteration of Spring DI and IOC
- In mainLessonB, we initiated the spring ApplicationContext, which keeps track of all beans
- In the main class, instead of instantiating the object, we asked spring for the object by app.getBean
- We autowired the sort algorithm by @autowired IsortSpring. Note that spring looks for a class implementing IsortSpring to create bean of. We indicated that through @Component tag on BubbleSortSpring.
- If we put bubble sort on both the algorithm, spring will error out stating that it has found 2 beans and cant decide which one to pick.

- We also removed default constructor of SortThenSearchSpringLessonB, cause when we do @autowired with spring, spring knows that it will have to find a object for the autowired class and inject into the bean of SortThenSearchSpringLessonB .
- @Primary on one of the two @Component of bubblesort and selection sort helps spring pick one over the other.
- Singleton vs Prototype beans
- @ComponentScan to cover all beans
- @PostConstruct  and @PreDestroy