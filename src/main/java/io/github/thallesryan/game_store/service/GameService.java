package io.github.thallesryan.game_store.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import io.github.thallesryan.game_store.domain.Game;
import io.github.thallesryan.game_store.domain.dto.game.GameRequestDTO;
import io.github.thallesryan.game_store.domain.dto.game.GameResponseDTO;

public interface GameService {
	
	GameResponseDTO save(GameRequestDTO game);
	
	void update(Game game);
	
	void delete(Integer idJogo);
	
	Game findById(Integer idJogo);
	
	Page<GameResponseDTO> findAll(Pageable pageable);
	
	List<Game> findAvailableGames();

}
