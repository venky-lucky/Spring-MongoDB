package ai.jobiak.bootforms.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import ai.jobiak.bootforms.model.Student;

public interface StudentRepository extends MongoRepository<Student, String>{

}
