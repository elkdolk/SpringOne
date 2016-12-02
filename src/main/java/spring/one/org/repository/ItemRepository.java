package spring.one.org.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.one.org.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}
