public class BookApp {

    public static void main (String[] args) {

        Book b1 = new Book();
        b1.setAuthor("J.K. Rowling");
        b1.setTitle("Harry Potter");
        b1.setDesc("Fiction book about wizards and witches");
        System.out.println(b1.getDisplayText());
    }
}
