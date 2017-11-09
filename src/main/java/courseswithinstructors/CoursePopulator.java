package courseswithinstructors;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CoursePopulator implements CommandLineRunner {

	@Resource
	private InstructorRepository instructorRepo;

	@Resource
	private CourseTopicRepository courseRepo;

	@Override
	public void run(String... args) throws Exception {
		// save a couple of customers
		Instructor brian = new Instructor("Brian", "Forsythe");
		instructorRepo.save(brian);
		Instructor don = new Instructor("Don", "Hamilton");
		instructorRepo.save(don);
		Instructor alan = new Instructor("Alan", "Kostrick");
		instructorRepo.save(alan);

		CourseTopic course1 = new CourseTopic("Spring", "Spring Framework", brian);
		courseRepo.save(course1);
		CourseTopic course2 = new CourseTopic("Javascript", "Javascript Stuff", don);
		courseRepo.save(course2);
		CourseTopic course3 = new CourseTopic("Java", "Core Java", alan);
		courseRepo.save(course3);
		CourseTopic course4 = new CourseTopic("HTML", "HTML for Web", don);
		courseRepo.save(course4);
	}

	public CoursePopulator() {

	}
}