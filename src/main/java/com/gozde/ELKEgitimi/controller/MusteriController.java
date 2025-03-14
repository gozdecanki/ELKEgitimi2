package com.gozde.ELKEgitimi.controller;

import com.gozde.ELKEgitimi.domain.Musteri;

import com.gozde.ELKEgitimi.dto.request.MusteriSaveRequestDto;
import com.gozde.ELKEgitimi.service.MusteriService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.gozde.ELKEgitimi.config.RestApis.*;

@RestController
@RequestMapping(MUSTERI)
@RequiredArgsConstructor
public class MusteriController {

    private final MusteriService service;


    @PostMapping(SAVE)
    public ResponseEntity<Musteri> save(@RequestBody MusteriSaveRequestDto musteriSaveRequestDto){

//        Musteri musteri = service.save(musteriSaveRequestDto);
//       return ResponseEntity.ok(musteri);

        return ResponseEntity.ok(service.save(musteriSaveRequestDto));

    }

    @GetMapping(GETALL)
    public ResponseEntity<Iterable<Musteri>> getAll(){
        return ResponseEntity.ok(service.findAll());
    }


}
