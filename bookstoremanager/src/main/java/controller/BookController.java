package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.Book;
import repository.BookRepository;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

	private BookRepository bookrepository;
	
	
	@Autowired
	public BookController(BookRepository bookrepository) {
		this.bookrepository = bookrepository;
	}



	public MessageResponseDTO create(Book book) {
		
		Book savedBook = bookRepository.save(book);
		
	}
}
