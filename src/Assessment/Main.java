package Assessment;

public class Main {

    public static void main(String[] args) {
           Author author=new Author("koen","koen.griffion@capgemini",26,"m");
           Author author1=new Author("Alice Munrno","Alice@gmial.com",88,"f");
           Book book=new Book("select Stories",16.99,150000000,author,1996);
           Book book1=new Book("The Moon Of Jupiter",14.99,1000000,author1,1988);
           Book koen=new Book("thoughts on java",1.99,1,author,2020);
           Book koen1=new Book("Thoughts on Dotnet",4.99, 1,author,2020);
        System.out.println("Author:"+author+ "\n Author1:"+author1);
        System.out.println("book:"+book+"\n Book:"+book1);
        System.out.println("Koen:"+koen+"\n Koen1:"+koen1);

        Library library=new Library();
        library.add(author);
        library.add(author1);
        library.add(book);
        library.add(book1);


    }
}
