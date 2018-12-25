package telran.ashkelon2018.student.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of= {"id"})
public class Student {
	@Id
// 	@GeneratedValue - automatic enumeration
	int id;
	String name;
	String email;
	@ManyToOne	 
	Group group;

}
