package ca.sheridancollege.vutran.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ca.sheridancollege.vutran.domain.Item;

public interface ItemRepo extends JpaRepository<Item, Long> {

}
