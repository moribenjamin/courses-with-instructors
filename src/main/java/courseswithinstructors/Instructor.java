package courseswithinstructors;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Instructor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long instructorId;

	private String firstName;
	private String lastName;

	@OneToMany(mappedBy = "instructor")
	private Set<CourseTopic> courseTopics = new HashSet<CourseTopic>();

	// JPA required no args constructor
	protected Instructor() {
	}

	public Instructor(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Long getInstructorId() {
		return instructorId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Set<CourseTopic> getCourseTopics() {
		return courseTopics;

	}

	@Override
	public String toString() {
		return String.format("Instructor[instructorId=%d, firstName='%s', lastName='%s']", instructorId, firstName,
				lastName);
	}
}
