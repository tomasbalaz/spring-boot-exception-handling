package sk.balaz.springbootexceptionhandling.order;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sk.balaz.springbootexceptionhandling.customer.CustomerNotFoundException;

import java.util.List;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {

    @GetMapping
    public List<String> getCustomerOrders(@RequestParam String customerId) {
        throw new CustomerNotFoundException(String.format("Customer %s not found", customerId));
    }
}
