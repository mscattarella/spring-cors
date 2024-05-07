package it.krisopea.springcors.repository;

import it.krisopea.springcors.repository.model.VueDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VueDataRepository extends JpaRepository<VueDataEntity, Long>{
}
