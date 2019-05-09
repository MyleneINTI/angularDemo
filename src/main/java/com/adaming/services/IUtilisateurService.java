package com.adaming.services;

import java.util.List;

import com.adaming.entities.Utilisateur;

public interface IUtilisateurService {

	public List<Utilisateur> findAll();
	
	public Utilisateur findOne(Long id);
	
	public Utilisateur save(Utilisateur utilisateur);
	
	public void delete(Long id);


}
