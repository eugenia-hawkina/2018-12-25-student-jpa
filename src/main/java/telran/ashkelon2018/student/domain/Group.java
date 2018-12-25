package telran.ashkelon2018.student.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of= {"id"})
@Entity
@Table(name = "studentGroup")
public class Group {
	@Id
	int id;
	String name;
	@OneToMany(mappedBy = "group", cascade = CascadeType.ALL)
	// same name of group as in class Student
	// cascade deleting
	@JsonIgnore
	// to avoid recursion
	Set<Student> students;

}
