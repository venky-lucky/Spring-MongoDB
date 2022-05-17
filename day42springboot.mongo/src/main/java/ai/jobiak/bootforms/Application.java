package ai.jobiak.bootforms;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ai.jobiak.bootforms.model.Student;
import ai.jobiak.bootforms.repo.StudentRepository;

@SpringBootApplication
public class Application implements CommandLineRunner{
	@Autowired
	StudentRepository stdrepo;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Student s1 = new Student("05D7","Venkatesh","CSE",4);
		Student s2 = new Student("05F7","Teju","CSE",2);
		Student s3 = new Student("0527","Shiva","CSE",3);
		Student s4 = new Student("05B2","Nikhil","ECE",1);
		
		stdrepo.save(s1);
		stdrepo.save(s2);
		stdrepo.save(s3);
		stdrepo.save(s4);
		
		List<Student> student = stdrepo.findAll();
		for(Student s: student) {
			System.out.println(s);
		}
	}
}
