package co.parcial.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import co.parcial.web.entity.Celular;

@Repository
public interface CelularRepository extends JpaRepository<Celular, Long> {
}
