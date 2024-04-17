package ca.sheridancollege.vutran.services;

import java.util.List;

import ca.sheridancollege.vutran.domain.Item;

public interface ItemService {
	public List<Item> findAll();
	public Item save(Item item);
	public void delete(Long id);
}
