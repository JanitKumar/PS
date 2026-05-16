class library_working{
    String[] availableBooks={};
    String[] issuedBooks={};
    int available_count;
    int issued_count;
   public library_working(){
        this.availableBooks=new String[100];
        this.issuedBooks=new String[100];
        this.available_count=0;
        this.issued_count=0;
    }

    //add books

    public void add_book(String book){
        availableBooks[available_count]=book;
        available_count++;
        System.out.println(book+" has been added to library catalogue.");
    }

    public void issuebook(String book){
        boolean found=false;
        for(int i=0;i<available_count;i++){
            if(availableBooks[i].equals(book)){
                found=true;
                issuedBooks[issued_count]=book;
                issued_count++;

                //remove from available count
                for(int j=i;j<available_count-1;j++){
                    availableBooks[j]=availableBooks[j+1];
                }
                available_count--;

                System.out.println("Book "+book+" has been issued. Please return it within 15 days.");
                break;
            }
        }
       if(!found){
        System.out.println("Sorry "+book+" is not available.");
       } 
    }

    // return book method

    public void returnBook(String book){
        boolean found =false;
        for(int i=0;i<issued_count;i++){
            if(issuedBooks[i].equals(book)){
                found=true;
                availableBooks[available_count]=book;
                available_count++;

                //remove returned book from issued books
                for(int j=i;j<issued_count;j++){
                    issuedBooks[j]=issuedBooks[j+1];
                }
                issued_count--;

                System.out.println("Thank You for returning the book "+ book);
            }
        }
        if(!found){
            System.out.println("this book was not issued from this library!!");
        }

    }

    public void show_available(){
        System.out.println(available_count);
    }
}





public class library {
    public static void main(String[] args){
        library_working Delhi_library=new library_working();
        Delhi_library.add_book("Harry Potter");
        Delhi_library.add_book("Game of Thrones");
        Delhi_library.add_book("The White Tiger");
        Delhi_library.issuebook("Harry Potter");
        System.out.println();
        Delhi_library.show_available();
        
    }
}
