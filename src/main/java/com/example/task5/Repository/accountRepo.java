package com.example.task5.Repository;

import com.example.task5.Entity.accountTableEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface accountRepo extends JpaRepository<accountTableEntity,String> {
}
