package com.acedeveloper.photoapp.api.albums.service;

import com.acedeveloper.photoapp.api.albums.data.AlbumEntity;
import java.util.List;

public interface AlbumsService {
    List<AlbumEntity> getAlbums(String userId);
}