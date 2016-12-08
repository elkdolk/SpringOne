package spring.one.org.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.one.org.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByName(String name);

}
