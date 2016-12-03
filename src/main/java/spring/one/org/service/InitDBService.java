package spring.one.org.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.one.org.entity.Blog;
import spring.one.org.entity.Item;
import spring.one.org.entity.Role;
import spring.one.org.entity.User;
import spring.one.org.repository.BlogRepository;
import spring.one.org.repository.ItemRepository;
import spring.one.org.repository.RoleRepository;
import spring.one.org.repository.UserRepository;

@Transactional
@Service
public class InitDBService {

	@Autowired
	private RoleRepository roleRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ItemRepository itemRepository;

	@Autowired
	private BlogRepository blogRepository;

	@PostConstruct
	public void init() {
		Role roleUser = new Role();
		roleUser.setName("ROLE_USER");
		roleRepository.save(roleUser);
	
		Role roleAdmin = new Role();
		roleAdmin.setName("ROLE_ADMIN");
		roleRepository.save(roleAdmin);
		
		User userAdmin = new User();
		//userAdmin.setEnabled(true);
		userAdmin.setName("admin");
		//BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		//userAdmin.setPassword(encoder.encode("admin"));
		userAdmin.setPassword("admin");
		
		List<Role> roles = new ArrayList<Role>();
		roles.add(roleAdmin);
		roles.add(roleUser);
		
		userAdmin.setRoles(roles);
		userRepository.save(userAdmin);
		
		Blog tabnak = new Blog();
		tabnak.setName("tabnak");
		tabnak.setUrl("http://feeds.feedburner.com/javavids?format=xml");
		tabnak.setUser(userAdmin);
		blogRepository.save(tabnak);
		
		Item item1 = new Item();
		item1.setBlog(tabnak);
		item1.setTitle("first");
		item1.setLink("www.tabnak.ir");
		item1.setPublishedDate(new Date());
		itemRepository.save(item1);
		
		Item item2 = new Item();
		item2.setBlog(tabnak);
		item2.setTitle("second");
		item2.setLink("www.tabnak.ir");
		item2.setPublishedDate(new Date());
		itemRepository.save(item2);
	}
}