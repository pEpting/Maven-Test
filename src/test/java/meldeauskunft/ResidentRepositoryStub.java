package meldeauskunft;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import meldeauskunft.domain.Resident;
import meldeauskunft.repository.ResidentRepository;

public class ResidentRepositoryStub implements ResidentRepository
{
	private List<Resident> Residents = new ArrayList<Resident>();
	
	public void AddResident(Resident newGuy)
	{
		Residents.add(newGuy);
	}
	
	public List<Resident> getResidents()
	{
	    return Residents;
	}
}