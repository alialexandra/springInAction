package personal.examples;

public class ClassicDependencyInjection {


    /**
     *
     Yes, it’s perfectly fine to use @Autowired on fields like in your example, but using constructor injection (with @Autowired on the constructor) is considered a better practice for several reasons. Both approaches will work when a class has a proxy, but constructor injection provides some advantages.

     Let’s break down the differences and why constructor-based injection is often preferred:


     *Less testable: With field injection, it’s harder to write unit tests because you can’t easily instantiate the class and pass in mock dependencies. You need to use reflection or Spring features to inject mock values into private fields.
     * Immutability: You can’t declare the injected field as final because field injection happens after the constructor. This makes the field mutable, which can lead to unwanted state changes and makes the code harder to reason about.
     * Hidden Dependencies: Field injection hides the dependencies of the class, as they are not immediately visible when reading the constructor signature. This can make the code harder to understand and maintain.
     *
     *
     *
     * benefits for constructor injection
     *
     * testability
     *
     * Immutability: You can declare injected dependencies as final, ensuring that the injected dependencies cannot be modified after the object is constructed. This encourages immutability and safer code.
     *
     * Clear Dependencies: The constructor explicitly shows the required dependencies of the class, making it easier to understand what the class needs to function. This leads to better code readability and maintainability.
     *
     * Mandatory Dependencies: Since the dependencies are required to be passed through the constructor, you can be sure that your class always has all the required dependencies. If a dependency is missing, the class simply won’t compile.
     *
     * Null-Safety: Constructor injection ensures that the object is fully initialized, meaning all dependencies are injected and available as soon as the object is created. This avoids the possibility of null fields if something goes wrong during field injection.
     * */

    private ClassicDependencyInjection myRepository;

    public ClassicDependencyInjection() {
        this.myRepository = new ClassicDependencyInjection();  // The class controls object creation.
    }

/*    public void doSomething() {
        myRepository.performAction();
    }*/
}
