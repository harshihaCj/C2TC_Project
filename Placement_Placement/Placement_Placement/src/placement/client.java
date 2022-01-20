package placement;

import java.time.LocalDate;

import placement.entities.Placement;
import placement.service.PlacementService;
import placement.service.PlacementServiceImpl;

public class client {
	public static void main(String[] args) {
		Placement p = new Placement();
		Placement p1 = new Placement();
		PlacementService ps= new PlacementServiceImpl();
		
   	p.setId(2002);
		p.setCollege("Global college");
		LocalDate date = LocalDate.now();       
		LocalDate day = date.plusDays(1);    
		p.setDate(day);
		p.setName("Infosyes");
		p.setQualification("BE");
		p.setYear(2021);
		
		p1.setId(2015);
		p1.setCollege("BMS");
		LocalDate date1 = LocalDate.now();       
		LocalDate day1 = date.plusDays(2);    
		p1.setDate(day1);
		p1.setName("wipro");
		p1.setQualification("BTech");
		p1.setYear(2020);
		
		ps.addPlacement(p);
		ps.addPlacement(p1);
		
		System.out.println("successfully added placement"); 
		
		//Update
		
		
	/*	Placement place= ps.searchPlacement(2001);
		place.setName("Spoorthi");
		ps.updatePlacement(place);
		System.out.println("update done to "+place.getId()); */
		
	/*	String place = ps.cancelPlacement(201);  
		System.out.println(place);*/
		
		
	}

}
