package goit.SpringData.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import goit.SpringData.entity.Note;

public interface NoteRepository extends JpaRepository<Note, Long> {

}
