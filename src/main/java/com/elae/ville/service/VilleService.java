package com.elae.ville.service;

import java.util.List;

import com.elae.ville.entities.Pays;
import com.elae.ville.entities.Ville;

public interface VilleService {
    Ville saveVille(Ville v);
    Ville updateVille(Ville v);
    void deleteVille(Ville v);
    void deleteVilleById(Long id);
    Ville getVille(Long id);
    List<Ville> getAllVilles();
    
    List<Ville> findByNomVille(String nom);
    List<Ville> findByNomVilleContains(String nom);
    List<Ville> findByNomSuperficie(String nom, Double superficie);
    List<Ville> findByPays(Pays pays);
    List<Ville> findByPaysIdPays(Long id);
    List<Ville> findByOrderByNomVilleAsc();
    List<Ville> trierVillesNomsSuperficie();

}
