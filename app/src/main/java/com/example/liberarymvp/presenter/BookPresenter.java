package com.example.liberarymvp.presenter;

import com.example.liberarymvp.model.BookModel;
import com.example.liberarymvp.ui.BookInterface;

/**
 * Created By Mohamed A. Dahab on 4/5/2021
 **/
public class BookPresenter {
    BookInterface bookInterface ;
    //constructors
    public BookPresenter(BookInterface bookInterface) {
        this.bookInterface = bookInterface;
    }

    //retriving book  from the model
    private BookModel getBookData(){

        return new BookModel(1,"# Divergent Series Book","- Fantacy Book");

    }

    //sending the book details to the interface
    public void shareBookDetails(){
        //formating the [text] String
        String booKDetails = getBookData().getTitle() +"\n"+ getBookData().getDiscriptions();
        //share the details
        bookInterface.onGetBook(booKDetails);

    }
}
