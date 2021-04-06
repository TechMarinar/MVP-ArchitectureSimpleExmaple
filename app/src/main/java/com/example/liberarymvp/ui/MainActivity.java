package com.example.liberarymvp.ui;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.liberarymvp.R;
import com.example.liberarymvp.presenter.BookPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements OnClickListener , BookInterface {

    @BindView(R.id.button)
    Button getBookBTN;
    @BindView(R.id.textBookview)
    TextView bookTView;
    //var
    BookPresenter bookPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        //set button click listener
        getBookBTN.setOnClickListener(this);
        //init
        bookPresenter = new BookPresenter(this);
    }

    @Override
    public void onClick(View v) {
        //call shareBook method to send the book details to the interface
       bookPresenter.shareBookDetails();
    }

    @Override
    public void onGetBook(String bookTitle) {
        bookTView.setText(bookTitle);
    }
}