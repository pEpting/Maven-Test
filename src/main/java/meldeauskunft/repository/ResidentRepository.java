package meldeauskunft.repository;

import java.util.List;

import domain.Resident;

/**
 * @author Stefan Betermieux
 */
public interface ResidentRepository {

  List<Resident> getResidents();

}