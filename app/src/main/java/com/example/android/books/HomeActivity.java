package com.example.android.books;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.SearchView;

public class HomeActivity extends AppCompatActivity {

    /** Store the edit text from the layout in a variable */
    private SearchView mSearchView;

    /** A string variable to store the query text  */
    private String queryText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Find the edit text in the layout with ID editText
        mSearchView = (SearchView) findViewById(R.id.search_view);

        mSearchView.setOnQueryTextListener(
                new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                queryText = mSearchView.getQuery().toString();
                Intent intent = new Intent(HomeActivity.this, BooksActivity.class);
                intent.putExtra("QUERY_TEXT", queryText);
                startActivity(intent);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                return false;
            }
        });

    }
}
