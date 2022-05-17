package ai.jobiak.bootforms.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import ai.jobiak.bootforms.model.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String>{

}
