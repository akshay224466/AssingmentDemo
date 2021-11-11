package Testvia;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Author {
	 @Value("#{book.title?.toUpperCase()}")
	 
	 
	 
	 
	 
	 
	    private String book_Title;
	    @Value("MS_Dhoni")
	    private String author_Name;
	    @Value("#{T(java.lang.Math).PI}")
	    private double x;

	    public void show() {
	        System.out.println("Book Title : " + book_Title);
	        System.out.println("Author Name : " + author_Name);
	        System.out.println("PI Value : " + x);

}
}