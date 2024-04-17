package api.spainLocations.repositories;

import api.spainLocations.models.ProvincesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IProvincesRepository extends JpaRepository<ProvincesModel, Long> {
}
