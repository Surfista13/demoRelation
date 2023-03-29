package fr.eni.demorelation.dal;

import fr.eni.demorelation.model.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonneDao extends JpaRepository <Personne, Integer> {
}
