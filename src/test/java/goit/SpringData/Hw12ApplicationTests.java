package goit.SpringData;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import goit.SpringData.service.NoteService;

@SpringBootTest
class Hw12ApplicationTests {

	@Autowired
	@Qualifier("noteService")
	NoteService noteService;
	
	@Test
	void contextLoads() {
		assertNotNull(noteService);
	}

}
