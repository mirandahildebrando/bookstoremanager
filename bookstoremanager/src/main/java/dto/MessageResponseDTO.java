package dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MessageResponseDTO {
	
	private String message;

	public static Object builder() {
		// TODO Auto-generated method stub
		return("Teste");
	}

}
