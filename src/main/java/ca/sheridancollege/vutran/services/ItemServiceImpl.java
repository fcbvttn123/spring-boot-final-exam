package ca.sheridancollege.vutran.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ca.sheridancollege.vutran.domain.Item;
import ca.sheridancollege.vutran.repositories.ItemRepo;

@Service
public class ItemServiceImpl implements ItemService {
	
	@Autowired ItemRepo ir;

	@Override
	public List<Item> findAll() {
		return ir.findAll();
	}

	@Override
	public Item save(Item item) {
		return ir.save(item);
	}

	@Override
	public void delete(Long id) {
		ir.deleteById(id);
	}

}
