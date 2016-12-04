package spring.one.org.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import spring.one.org.entity.Blog;
import spring.one.org.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

	List<Item> findByBlog(Blog blog,Pageable pageable);
}
