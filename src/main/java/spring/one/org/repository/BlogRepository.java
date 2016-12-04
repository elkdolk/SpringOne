package spring.one.org.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.one.org.entity.Blog;
import spring.one.org.entity.User;

public interface BlogRepository extends JpaRepository<Blog, Integer> {

	List<Blog> findByUser(User user);
}
