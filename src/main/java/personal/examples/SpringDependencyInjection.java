package personal.examples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpringDependencyInjection {

    private final SpringDependencyInjection myRepository;

    @Autowired
    public SpringDependencyInjection(SpringDependencyInjection s) {
        this.myRepository = s;
    }

   /* public void doSomething() {
        myRepository.performAction();
    }*/
}
