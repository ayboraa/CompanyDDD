package employee.dicipline.infrastructure;


import employee.dicipline.domain.Note;
import employee.dicipline.domain.NoteRepository;

public class JPANoteRepository implements NoteRepository {
    private final NoteEntityRepository repository;

    public JPANoteRepository(NoteEntityRepository repository) {
        this.repository = repository;
    }


    @Override
    public Note save(Note note) {
        NoteEntity entity = new NoteEntity(note.getNoteId().uuid(), note.getUserId().uuid(), note.getNote(),note.getAuthorId().uuid() );
        repository.save(entity);
        return note;
    }
}
