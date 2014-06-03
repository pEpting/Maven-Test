package meldeauskunft;



import java.util.Date;
import java.util.List;

import meldeauskunft.domain.Resident;
import meldeauskunft.service.BaseResidentService;
import meldeauskunft.service.ResidentServiceException;

import org.junit.*;

import static org.junit.Assert.*;

public class ResidentServiceTest {
	
	ResidentRepositoryStub stub = new ResidentRepositoryStub();
	Resident Hugo = new Resident("Hugo", "Mann", "Schillerstr.", "Stadtstadt", new Date(1990,12,31));
	Resident Kara = new Resident("Kara", "Bauer", "Hillerstr.", "Stadtstadt", new Date(1990, 11, 20));
	Resident Karl = new Resident("Karl", "Frau", "Chillerstr.", "Stadtstadt", new Date(1990, 11, 20));
	
	@Before
	public void Initialize()
	{
		stub.AddResident(Hugo);
		stub.AddResident(Kara);
		stub.AddResident(Karl);
	}
	
	@Test
	public void testgetFilteredResidentsList()
	{
		BaseResidentService BRS = new BaseResidentService();
		BRS.setResidentRepository(stub);
		List<Resident> filteredResidents = BRS.getFilteredResidentsList(new Resident("Ka*", "*", "*", "*", new Date(1990, 11, 20)));
		
		assertEquals(2, filteredResidents.size());
	}
	
	@Test
	public void testgetUniqueResident()
	{
		BaseResidentService BRS = new BaseResidentService();
		BRS.setResidentRepository(stub);
		try
		{
		Resident unique = BRS.getUniqueResident(Hugo);
		assertEquals(Hugo, unique);
		}
        catch (ResidentServiceException e)
        {
        	assert(false);
        }
	}
}