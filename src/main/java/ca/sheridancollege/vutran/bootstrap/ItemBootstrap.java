package ca.sheridancollege.vutran.bootstrap;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ca.sheridancollege.vutran.domain.Item;
import ca.sheridancollege.vutran.services.ItemService;

@Component
public class ItemBootstrap implements CommandLineRunner {
	
	@Autowired ItemService itemService;

	@Override
	public void run(String... args) throws Exception {

		Item i1 = new Item("Item 1", 100, LocalDate.of(2024, 4, 15));
		Item i2 = new Item("Item 2", 200, LocalDate.of(2024, 3, 15));
		Item i3 = new Item("Item 3", 300, LocalDate.of(2024, 1, 15));
		
		itemService.save(i1);
		itemService.save(i2);
		itemService.save(i3);

	}

}
