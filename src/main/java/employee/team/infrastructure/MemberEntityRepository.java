package employee.team.infrastructure;

import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface MemberEntityRepository extends CrudRepository<MemberEntity, UUID> {
}
