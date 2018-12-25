package telran.ashkelon2018.student.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import telran.ashkelon2018.student.domain.Group;

public interface GroupRepository extends JpaRepository<Group, Integer> {

}
