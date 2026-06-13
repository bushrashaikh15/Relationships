package com.example.demo.models;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Book {
       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
       private int id;
       private String title;
       private int price;
       
       @ManyToMany
       @JoinTable(
    		   name="book_authors",
    		   joinColumns = @JoinColumn(name="", referencedColumnName = "id"),
    		   inverseJoinColumns = @JoinColumn(name="author_id",referencedColumnName = "id")
    		   )
 // joinColumns - refers to current class Primary key
 // inverseJoinColumns - refers to primary key of other class
       private List<Author> authors;

	   public int getId() {
		   return id;
	   }

	   public void setId(int id) {
		   this.id = id;
	   }

	   public String getTitle() {
		   return title;
	   }

	   public void setTitle(String title) {
		   this.title = title;
	   }

	   public int getPrice() {
		   return price;
	   }

	   public void setPrice(int price) {
		   this.price = price;
	   }

	   public List<Author> getAuthors() {
		   return authors;
	   }

	   public void setAuthors(List<Author> authors) {
		   this.authors = authors;
	   }
}
