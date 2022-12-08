package learn.ms.custfraud.customer;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    public void register(CustomerRegistrationRequest registrationRequest) {
        CustomerEntity customer = CustomerEntity.builder()
                .firstName(registrationRequest.getFirstName())
                .lastName(registrationRequest.getLastName())
                .email(registrationRequest.getEmail())
                .build();
        // todo: do all checks and save the customer in db
    }
}
