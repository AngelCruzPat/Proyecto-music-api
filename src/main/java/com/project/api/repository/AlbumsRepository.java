package com.project.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.api.entity.Album;

public interface AlbumsRepository extends JpaRepository<Album, Integer> {

}
