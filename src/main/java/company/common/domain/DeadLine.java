package company.common.domain;

import org.springframework.util.Assert;

import java.util.Date;

public class DeadLine {
    private final Date date;

    public DeadLine(Date dt) {


        Assert.notNull(dt, "date cannot be null");

        if (dt.before(new Date())) {
            throw new IllegalArgumentException("Due date cannot be in the past");
        }

        this.date = dt;

    }

    public Date getDate() {
        return date;
    }

    public boolean isTimePassed(){
        if(new Date().after(date))
            return true;
        else
            return false;

    }


}
