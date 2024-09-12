package company.project.infrastructure;

import company.project.domain.Task;
import company.project.domain.TaskRepository;


public class JPATaskRepository implements TaskRepository {

    private final TaskEntityRepository taskRepository;

    public JPATaskRepository(TaskEntityRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task save(Task task) {
        TaskEntity entity = new TaskEntity(task.getId().uuid(), task.getTitle(), task.getDescription(), task.getDeadline().getDate());
        this.taskRepository.save(entity);
        return task;
    }
}
