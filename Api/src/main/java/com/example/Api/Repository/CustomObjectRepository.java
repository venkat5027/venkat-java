package com.example.Api.Repository;

import com.example.Api.Entity.CustomObject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomObjectRepository extends JpaRepository<CustomObject, Long> {
}
