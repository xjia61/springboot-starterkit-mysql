package com.starterkit.springboot.brs.repository.bus;

import com.starterkit.springboot.brs.model.bus.TripStop;
import org.springframework.data.repository.CrudRepository;

public interface TripStopRepository extends CrudRepository<TripStop, Long> {

}
