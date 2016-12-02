package spring.one.org.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.one.org.entity.Blog;

public interface BlogRepository extends JpaRepository<Blog, Integer> {

}
