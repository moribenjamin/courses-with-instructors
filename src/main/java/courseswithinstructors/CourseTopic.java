package courseswithinstructors;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class CourseTopic {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String courseName;
	private String description;

	@ManyToOne
	private Instructor instructor;

	protected CourseTopic() {

	}

	public CourseTopic(String courseName, String description, Instructor instructor) {
		this.courseName = courseName;
		this.description = description;
		this.instructor = instructor;

	}

	public Long getId() {
		return id;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public String getCourseName() {
		return courseName;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public String toString() {
		return String.format("Instructor[id=%d, courseName='%s', discription='%s', instructor='%s']", id, courseName,
				description, instructor);
	}

}
