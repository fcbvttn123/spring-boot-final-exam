package ca.sheridancollege.vutran.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ca.sheridancollege.vutran.domain.Item;
import ca.sheridancollege.vutran.services.ItemService;

@RestController
@RequestMapping("/api/v1/items")
public class ItemController {
	
	@Autowired ItemService itemService;
	
	@GetMapping(value = {"", "/"})
	public List<Item> readAllItems() {
		return itemService.findAll();
	}
	
    @PostMapping(value = {"", "/"})
	public Item createItem(@RequestBody Item i) {
		return itemService.save(i);
	}
    
    @DeleteMapping(value = "{id}")
	public void deleteItem(@PathVariable("id") Long id) {
		itemService.delete(id);
	}
	
}
