package com.elae.ville.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomVille", types = { Ville.class })
public interface VilleProjection {
	public String getNomVille();

}
