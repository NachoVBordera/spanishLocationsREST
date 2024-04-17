package api.spainLocations.repositories;

import api.spainLocations.models.CcaaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICcaaRepository extends JpaRepository<CcaaModel, Long> {

}
