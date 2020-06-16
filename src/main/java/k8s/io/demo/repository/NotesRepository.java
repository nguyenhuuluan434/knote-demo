package k8s.io.demo.repository;

import k8s.io.demo.domain.Note;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NotesRepository extends MongoRepository<Note, String> {
}
