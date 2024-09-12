package employee.project.infrastructure;

import employee.project.domain.Comment;
import employee.project.domain.CommentRepository;

public class JPACommentRepository implements CommentRepository {

    private final CommentEntityRepository commentEntityRepository;


    public JPACommentRepository(CommentEntityRepository commentRepository) {
        this.commentEntityRepository = commentRepository;
    }

    @Override
    public Comment save(Comment comment) {
        CommentEntity entity  = new CommentEntity(comment.getId().uuid(), comment.getContent(), comment.getAuthorId().uuid());
        this.commentEntityRepository.save(entity);
        return comment;
    }
}
