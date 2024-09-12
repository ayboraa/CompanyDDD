package company.project.infrastructure;

import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface CommentEntityRepository extends CrudRepository<CommentEntity, UUID> {
}
