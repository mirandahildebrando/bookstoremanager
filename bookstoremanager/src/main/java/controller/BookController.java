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
@RequestMapping("/api/v1/books")
public class BookController {

	private BookRepository bookRepository;
	
	
	@Autowired
	public BookController(BookRepository bookrepository) {
		this.bookRepository = bookrepository;
	}


    @PostMapping
	public Class<MessageResponseDTO> create(@RequestBody Book book) {
		Book savedBook = bookRepository.save(book);
		return MessageResponseDTO.class;
	}
    
    @Data
    @Builder
    
    public static class MessageResponseDTO {
    	private String message;
    }
}
