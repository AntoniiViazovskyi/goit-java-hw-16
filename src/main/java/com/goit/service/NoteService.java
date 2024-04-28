package com.goit.service;

import com.goit.data.entity.NoteEntity;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface NoteService {
    List<NoteEntity> listAll();
    NoteEntity add(NoteEntity note);
    void deleteById(UUID id);
    void update(NoteEntity note);
    Optional<NoteEntity> getById(UUID id);
}
