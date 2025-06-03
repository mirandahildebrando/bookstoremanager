package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.Book;
import lombok.Builder;
import lombok.Data;
import repository.BookRepository;

@RestController
@RequestMapping("/C:\\Projetos\\Back\\proj\\bookstoremanager")
public class BookController {

	private BookRepository bookRepository;
	
	
	@Autowired
	public BookController(BookRepository bookrepository) {
		this.bookRepository = bookRepository;
	}


	@PostMapping
	public Object create(@RequestBody Book book) {
	    Book savedBook = bookRepository.save(book);
	    return MessageResponseDTO
	            .builder();
	}
    
    @Data
    @Builder
    
    public static class MessageResponseDTO {
    	private String message;

		public static Object builder() {
			// TODO Auto-generated method stub
			return null;
		}

		public Object message(String string) {
			// TODO Auto-generated method stub
			return null;
		}
    }
}
