package employee.project.infrastructure;

import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface TaskEntityRepository extends CrudRepository<TaskEntity, UUID> {
}


