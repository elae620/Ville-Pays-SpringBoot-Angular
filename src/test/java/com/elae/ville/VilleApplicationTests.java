package com.elae.ville;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.elae.ville.entities.Pays;
import com.elae.ville.entities.Ville;
import com.elae.ville.repos.VilleRepository;

@SpringBootTest
class VilleApplicationTests {
	
	@Autowired
	private VilleRepository villeRepository;

	@Test
	public void testCreateVille() {
	    Ville v = new Ville("Tunis", 212.63, new Date(30/8/1858));
	    villeRepository.save(v);
	}
	
	@Test
	public void testFindVille() {
	    Ville v = villeRepository.findById(2L).get();
	    System.out.println(v);
	}

	@Test
	public void testUpdateVille() {
	    Ville v = villeRepository.findById(2L).get();
	    v.setSuperficie(300.0);
	    villeRepository.save(v);
	}

	@Test
	public void testDeleteVille() {
	    villeRepository.deleteById(1L);
	}

	@Test
	public void testListerTousVilles() {
	    List<Ville> villes = villeRepository.findAll();
	    for (Ville v : villes) {
	        System.out.println(v);
	    }
	}
	
	@Test
	public void testFindVilleByNom() {
	   List<Ville> v = villeRepository.findByNomVille("Tunis");
	   for (Ville v1:v) {
		   System.out.println(v);
	   }
	}
		@Test
		public void testFindVilleByNomContains() {
		   List<Ville> v = villeRepository.findByNomVilleContains("T");
		   for (Ville v1:v) {
			   System.out.println(v1);
		   }
	    
	}
		
		@Test
		public void TestfindByNomSuperficie()
		{
		List<Ville> vi = villeRepository.findByNomSuperficie("Tu", 200.0);
		for (Ville v : vi)
		{
		System.out.println(v);
		}
		}
		
		@Test
		public void TestfindByPays()
		{
		Pays pays = new Pays();
		pays.setIdPays(1L);
		List<Ville> villes = villeRepository.findByPays(pays);
		for (Ville v : villes)
		{
		System.out.println(v);
		}
		}
		
		@Test
		public void TestfindByOrderByNomVilleAsc()
		{
		List<Ville> villes =
		villeRepository.findByOrderByNomVilleAsc();
		for (Ville v : villes)
		{
		System.out.println(v);
		}
		}

		
		@Test
		public void testtrierVillesNomsSuperficie ()
		{
		List<Ville> villes = villeRepository.trierVillesNomsSuperficie ();
		for (Ville v : villes)
		{
		System.out.println(v);
		}
		}




}
