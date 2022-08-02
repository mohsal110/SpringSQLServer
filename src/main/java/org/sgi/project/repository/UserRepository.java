package org.sgi.project.repository;

import org.sgi.project.entity.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<Person,Long> {
}
