package meldeauskunft;



import java.util.Date;
import java.util.List;

import meldeauskunft.domain.Resident;
import meldeauskunft.service.BaseResidentService;

import org.junit.*;
import static org.junit.Assert.*;

public class ResidentServiceTest {
	
	ResidentRepositoryStub stub = new ResidentRepositoryStub();
	
	@Before
	public void Initialize()
	{
		Resident Hugo = new Resident("Hugo", "Mann", "Schillerstr.", "Stadtstadt", new Date(1990,12,31));
		Resident Egon = new Resident("Kara", "Bauer", "Hillerstr.", "Stadtstadt", new Date(1990, 11, 20));
		Resident Karl = new Resident("Karl", "Frau", "Chillerstr.", "Stadtstadt", new Date(1990, 11, 20));
		
		stub.AddResident(Hugo);
		stub.AddResident(Egon);
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
	
}