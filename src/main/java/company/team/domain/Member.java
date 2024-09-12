package company.team.domain;

import company.common.domain.Email;
import company.common.domain.MemberId;
import org.springframework.util.Assert;

import java.util.Currency;

public class Member {
    private MemberId id;
    private String name;
    private String surname;
    private Email email;
    private float salary;
    private Currency currency;
    private boolean isAdmin;


    public Member(String name, String surname, Email email, float salary, Currency currency, boolean isAdmin) {
        Assert.notNull(email, "Email cannot be null");
        Assert.notNull(salary, "Salary cannot be null");
        Assert.notNull(currency, "Currency cannot be null");
        Assert.notNull(name, "Name cannot be null");
        Assert.notNull(surname, "Surname cannot be null");
        Assert.notNull(isAdmin, "Admin status cannot be null");

        this.id = new MemberId();
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.salary = salary;
        this.currency = currency;
        this.isAdmin = isAdmin;

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

    public boolean isAdmin() {
        return isAdmin;
    }



}
