package io.github.thallesryan.game_store.domain.dto.user;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class UserRequestDTO {
	
	private Integer id; 
	
	private String name;
	
	@Column(unique = true)
	private String email;
	
	private String password;
	
	private Set<Integer> roles = new HashSet<>();
	
}
