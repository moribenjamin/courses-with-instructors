package courseswithinstructors;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CourseController {

	@Resource
	CourseTopicRepository courseRepo;

	@Resource
	InstructorRepository instructorRepo;

	@RequestMapping("/instructors")
	public String showAllInstructors(Model model) {
		model.addAttribute("instructors", instructorRepo.findAll());
		return "instructors";
	}

	@RequestMapping("/instructor")
	public String showSingleInstructor(@RequestParam Long id, Model model) {
		model.addAttribute("instructor", instructorRepo.findOne(id));
		return "instructor";
	}

	@RequestMapping("/courses")
	public String getAllCourses(Model model) {
		model.addAttribute("courses", courseRepo.findAll());
		return "courses";
	}

	@RequestMapping("/course")
	public String getOneCourse(@RequestParam Long id, Model model) {
		model.addAttribute("course", courseRepo.findOne(id));
		return "course";
	}

}