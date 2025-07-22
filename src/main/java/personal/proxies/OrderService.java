package personal.proxies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * In this case, Spring injects a proxy for PaymentService into OrderService, not the actual PaymentService object.
 * When paymentService.processPayment() is called, the proxy intercepts the call.
 * The proxy starts the transaction before calling processPayment() and commits/rolls it back afterward.
 * Only after the proxy performs the transaction logic, it will delegate the actual method call to the real PaymentService.
 *
 *  Why Use a Proxy?
 * The purpose of a proxy is to add additional behavior around method calls without modifying the business logic of the original class. For example:
 *
 * @Transactional: The proxy can start a transaction before calling the real method, then commit/rollback the transaction after the method finishes.
 * @Async: The proxy can run the method asynchronously without blocking the caller, then handle the result when it’s ready.
 * @Cacheable: The proxy can check if the result is already cached before calling the method. If it is, it skips the method call and returns the cached value.
 * */

@Service
class PaymentService {

    @Transactional
    public void processPayment() {
        // Business logic
    }
}

@Service
public class OrderService {

    @Autowired
    private PaymentService paymentService;

    public void createOrder() {
        paymentService.processPayment();
    }
}
