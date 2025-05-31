package com.hashedin.huspark.repository;

import com.hashedin.huspark.model.SampleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SampleRepository extends JpaRepository<SampleModel,Long>{
    List<SampleModel> findAllByName(String name);
    Optional<SampleModel> findById(Long Id);
}

