package com.elae.ville.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elae.ville.entities.Pays;
import com.elae.ville.entities.Ville;
import com.elae.ville.repos.VilleRepository;

@Service
public class VilleServiceImpl implements VilleService {
    
	@Autowired
	private final VilleRepository villeRepository;


	public VilleServiceImpl(VilleRepository villeRepository) {
		super();
		this.villeRepository = villeRepository;
	}

	@Override
	public Ville saveVille(Ville v) {
		return villeRepository.save(v);
	}

	@Override
	public Ville updateVille(Ville v) {
		return villeRepository.save(v);
	}

	@Override
	public void deleteVille(Ville v) {
		villeRepository.delete(v);
	}

	@Override
	public void deleteVilleById(Long id) {
		villeRepository.deleteById(id);
	}

	@Override
	public Ville getVille(Long id) {
		return villeRepository.findById(id).orElse(null);
	}

	@Override
	public List<Ville> getAllVilles() {
		return villeRepository.findAll();
	}

	@Override
	public List<Ville> findByNomVille(String nom) {
	    return villeRepository.findByNomVille(nom);
	}

	@Override
	public List<Ville> findByNomVilleContains(String nom) {
	    return villeRepository.findByNomVilleContains(nom);
	}

	@Override
	public List<Ville> findByNomSuperficie(String nom, Double superficie) {
	    return villeRepository.findByNomSuperficie(nom, superficie);
	}

	@Override
	public List<Ville> findByPays(Pays pays) {
	    return villeRepository.findByPays(pays);
	}

	@Override
	public List<Ville> findByPaysIdPays(Long id) {
	    return villeRepository.findByPaysIdPays(id);
	}

	@Override
	public List<Ville> findByOrderByNomVilleAsc() {
	    return villeRepository.findByOrderByNomVilleAsc();
	}

	@Override
	public List<Ville> trierVillesNomsSuperficie() {
	    return villeRepository.trierVillesNomsSuperficie();
	}

}
