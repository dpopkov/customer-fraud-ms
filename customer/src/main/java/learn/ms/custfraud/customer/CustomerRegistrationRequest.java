package learn.ms.custfraud.customer;

import lombok.Data;

@Data
public class CustomerRegistrationRequest {

    private final String firstName;
    private final String lastName;
    private final String email;
}
