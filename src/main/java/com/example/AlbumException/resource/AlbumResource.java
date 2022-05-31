package com.example.AlbumException.resource;

import com.example.AlbumException.model.Album;
import com.example.AlbumException.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/albums")
public class AlbumResource {
    @Autowired
    private AlbumService albumService;

    @PostMapping
    public Album saveAlbum(@RequestBody @Valid Album album)
    {
        return albumService.saveAlbum(album);
    }
    @GetMapping
    public List<Album> getAllAlbum()
    {
        return albumService.getAllAlbum();
    }
    @GetMapping("/albumID")
    public Album getById(@RequestParam(name = "albumID") String albumID)
    {
        return albumService.getByID(albumID);
    }
    @PutMapping
    public Album updateAlbum(@RequestBody Album album)
    {
        return albumService.updateAlbum(album);
    }
    @DeleteMapping
    public void deleteAlbum(@RequestParam(name="albumID") String albumID)
    {
        albumService.deleteAlbum(albumID);
    }
}
