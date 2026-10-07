package com.elae.ville.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.elae.ville.entities.Ville;
import com.elae.ville.service.VilleService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api")
@CrossOrigin
@AllArgsConstructor
public class VilleRESTController {
	
	//@Autowired
	private final VilleService villeService;
	
	
	
	@GetMapping
	public List<Ville> getAllVilles(){
		return villeService.getAllVilles();
	}
	
	//@RequestMapping(value="/{id}",method = RequestMethod.GET)
	@GetMapping("/{id}")
	public Ville getVilleById(@PathVariable("id") Long id) {
	   return villeService.getVille(id);
	 }
	
	//@RequestMapping(method = RequestMethod.POST)
	@PostMapping
	public Ville createProduit(@RequestBody Ville ville) {
	  return villeService.saveVille(ville);
	}
	
	//@RequestMapping(method = RequestMethod.PUT)
	@PutMapping
	public Ville updateProduit(@RequestBody Ville ville) {
	   return villeService.updateVille(ville);
	}
	
	//@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	 @DeleteMapping("/{id}")
	public void deleteVille(@PathVariable("id") Long id)
	{
		villeService.deleteVilleById(id);
	}

	 
	 @GetMapping("/villepays/{idPays}")
	public List<Ville> getVillesByPaysId(@PathVariable("idPays") Long idPays) {
	return villeService.findByPaysIdPays(idPays);
	}


}
