package company.common.domain;

import org.springframework.util.Assert;

import java.util.UUID;

public record MemberId(UUID uuid) {

    public MemberId{

        Assert.notNull(uuid, "Id cannot be null");

    }

    public MemberId(){

        this(UUID.randomUUID());

    }


}
