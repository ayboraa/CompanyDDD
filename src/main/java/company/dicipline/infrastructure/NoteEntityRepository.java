package company.dicipline.infrastructure;

import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface NoteEntityRepository  extends CrudRepository<NoteEntity, UUID> {
}
