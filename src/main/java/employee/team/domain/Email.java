package employee.team.domain;


import org.apache.commons.validator.routines.DomainValidator;
import org.apache.commons.validator.routines.EmailValidator;

public record Email(String email) {
    private static final EmailValidator VALIDATOR = new EmailValidator(true, true, DomainValidator.getInstance());

    public Email {
        if(!VALIDATOR.isValid(email)){
            throw new IllegalArgumentException("Invalid email: " + email);
        }
    }


}
