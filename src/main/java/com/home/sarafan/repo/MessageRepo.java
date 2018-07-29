package com.home.sarafan.repo;

import com.home.sarafan.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepo  extends JpaRepository<Message, Long> {

}
