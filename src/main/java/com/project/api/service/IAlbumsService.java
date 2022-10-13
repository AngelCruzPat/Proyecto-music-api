package com.project.api.service;

import java.util.List;
import com.project.api.entity.Album;

public interface IAlbumsService {

	List<Album> buscarTodos();
	void guardar(Album album);
	void eliminar(int idAlbum);
}
