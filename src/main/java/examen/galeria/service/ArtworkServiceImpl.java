package examen.galeria.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import examen.galeria.model.ArtworkDTO;
import examen.galeria.exceptions.ArtworkCreationException;
import examen.galeria.model.ArtistDTO;

@Service
public class ArtworkServiceImpl implements ArtworkService {

	ArrayList<ArtworkDTO> obras = new ArrayList<>();

	@Autowired
	ArtistService artistService;

	ArtworkDTO ar = new ArtworkDTO(1, "Titulo1", "hola soy la descripción uno", 1);
	ArtworkDTO ar2 = new ArtworkDTO(2, "Titulo2", "hola soy la descripción dos", 2);
	ArtworkDTO ar3 = new ArtworkDTO(3, "Titulo3", "hola soy la descripción tres", 1);
	ArtworkDTO ar4 = new ArtworkDTO(4, "Titulo4", "hola soy la descripción cuatro", 3);

	public ArtworkServiceImpl() {
		obras.add(ar);
		obras.add(ar2);
		obras.add(ar3);
		obras.add(ar4);
	}

	@Override
	public ArrayList<ArtworkDTO> getAllArtworks() {
		return obras;
	}

	@Override
	public void createArtwork(ArtworkDTO artworkDTO) {
		Integer id = artworkDTO.getArtistId();
		ArtistDTO a = artistService.getArtistById(id);
		if(a != null) {
		obras.add(artworkDTO);
		}
		else {
			throw new ArtworkCreationException("No existe ningún artista registrado con el id: "+id);
		}
	}

}
