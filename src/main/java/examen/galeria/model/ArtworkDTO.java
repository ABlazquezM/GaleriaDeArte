package examen.galeria.model;

import examen.galeria.validators.DescriptionFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArtworkDTO {

	Integer id;
	String title;
	@DescriptionFormat
	String descripcion;
	Integer artistId;

}
