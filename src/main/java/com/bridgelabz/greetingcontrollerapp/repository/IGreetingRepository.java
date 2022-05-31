package com.bridgelabz.greetingcontrollerapp.repository;

import com.bridgelabz.greetingcontrollerapp.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGreetingRepository extends JpaRepository <Greeting,Long>{
    private void delete(long id) {
        CrudRepository<Object, Object> repository = null;
        Object entityId = null;
        if (repository.existsById(entityId)) {
            repository.deleteById(entityId);
        }
    }

}
