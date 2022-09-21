package com.gavnis.testapp.rest.Repository;

import com.gavnis.testapp.rest.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Task, Long> {
}
