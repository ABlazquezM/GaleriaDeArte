package examen.galeria.service;

import java.util.ArrayList;

import examen.galeria.model.ArtworkDTO;

public interface ArtworkService {

	ArrayList<ArtworkDTO> getAllArtworks();

	void createArtwork(ArtworkDTO artworkDTO);

}
