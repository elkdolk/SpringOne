package spring.one.org.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import spring.one.org.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

	Role findByName(String name);

}
