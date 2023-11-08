package examen.galeria.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import examen.galeria.model.ArtworkDTO;
import examen.galeria.service.ArtworkService;

@RestController
@RequestMapping("/artwork")
public class ArtworkRestController {

	@Autowired
	ArtworkService artworkService;

	@GetMapping
	public ResponseEntity<?> getAllArtworks() {
		return ResponseEntity.ok(artworkService.getAllArtworks());
	}

	@PostMapping
	public ResponseEntity<?> createArtwork(@RequestBody @Validated ArtworkDTO artworkDTO) {

		artworkService.createArtwork(artworkDTO);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(artworkDTO.getId())
				.toUri();

		return ResponseEntity.created(location).build();
	}
}
