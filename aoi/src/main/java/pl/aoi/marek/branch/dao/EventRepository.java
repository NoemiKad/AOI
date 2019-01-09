package pl.aoi.marek.branch.dao;

import org.springframework.data.repository.CrudRepository;
import pl.aoi.marek.branch.model.Event;

public interface EventRepository extends CrudRepository<Event, Long> {
}
