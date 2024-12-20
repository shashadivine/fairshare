package app.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import app.entities.Item;

@Repository
public interface ItemRepository 
				extends JpaRepository<Item, Long>
{
	List<Item> findByName(String itemName);
}
