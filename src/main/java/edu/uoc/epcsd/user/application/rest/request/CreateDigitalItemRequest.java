package edu.uoc.epcsd.user.application.rest.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@AllArgsConstructor
public final class CreateDigitalItemRequest {
	
	@NotNull
    private final Long digitalSessionId;    
     
	@NotBlank
    private final String description;

	@NotBlank
    private final Long lat;
	
	@NotBlank
    private final Long lon;
	
	@NotBlank
    private final String link;
}
