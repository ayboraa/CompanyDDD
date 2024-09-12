package employee.team.domain;

import org.springframework.util.Assert;

import java.util.Currency;

public class Member {
    private MemberId id;
    private String name;
    private String surname;
    private Email email;
    private float salary;
    private Currency currency;


    public Member(String name, String surname, Email email, float salary, Currency currency) {
        Assert.notNull(email, "Email cannot be null");
        Assert.notNull(salary, "Salary cannot be null");
        Assert.notNull(currency, "Currency cannot be null");
        Assert.notNull(name, "Name cannot be null");
        Assert.notNull(surname, "Surname cannot be null");

        this.id = new MemberId();
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.salary = salary;
        this.currency = currency;
    }

    public MemberId getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }

    public Email getEmail() {
        return email;
    }

    public Currency getCurrency() {
        return currency;
    }

    public String getSurname() {
        return surname;
    }



}
