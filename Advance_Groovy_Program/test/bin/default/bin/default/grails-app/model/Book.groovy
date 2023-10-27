//Domain-class Book-2
class Book{
    BookService bookService;
    String name;
    String bookType;
    static mapping = {
        autowire = true;
        }
}