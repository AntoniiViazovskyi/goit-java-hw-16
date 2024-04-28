package com.goit.service.impl;

import com.goit.data.entity.NoteEntity;
import com.goit.data.repository.NoteRepository;
import com.goit.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class NoteServiceImpl implements NoteService {

    @Autowired
    NoteRepository noteRepository;

    @Override
    public List<NoteEntity> listAll() {
        return noteRepository.findAll();
    }

    @Override
    public NoteEntity add(NoteEntity note) {
        return noteRepository.save(note);
    }

    @Override
    public void deleteById(UUID id) {
        noteRepository.deleteById(id);
    }

    @Override
    public void update(NoteEntity note) {
        noteRepository.deleteById(note.getId());
        noteRepository.save(note);
    }

    @Override
    public Optional<NoteEntity> getById(UUID id) {
        return noteRepository.findById(id);
    }
}
