package com.gozde.ELKEgitimi.service;

import com.gozde.ELKEgitimi.domain.Musteri;
import com.gozde.ELKEgitimi.dto.request.MusteriSaveRequestDto;
import com.gozde.ELKEgitimi.repository.MusteriRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MusteriService {

    private final MusteriRepository repository;


    public Musteri save(MusteriSaveRequestDto dto) {
//        Musteri musteri = repository.save(Musteri.builder()
//                .ad(dto.getAd())
//                .soyad(dto.getSoyad())
//                .adSoyad(dto.getAd() +" "+ dto.getSoyad())
//                .isActive(true)
//                .yas(Long.valueOf(dto.getYas()))
//                .build());
//
//        return musteri;

        return repository.save(Musteri.builder()
                .ad(dto.getAd())
                .soyad(dto.getSoyad())
                .adSoyad(dto.getAd() +" "+ dto.getSoyad())
                .isActive(true)
                .yas(dto.getYas())
                .build());
    }

    public Iterable<Musteri> findAll() {
        return repository.findAll();
    }
}
