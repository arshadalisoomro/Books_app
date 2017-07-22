package com.example.android.books;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;


/**
 * <p>
 * An {@link BookAdapter} knows how to create a list item layout for each book
 * in the data source (a list of {@link Book} objects).
 * <p>
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */

public class BookAdapter extends ArrayAdapter {

    /**
     * Tag for log messages
     */
    private static final String LOG_TAG = BookAdapter.class.getSimpleName();

    /**
     * Constructs a new {@link BookAdapter}.
     *
     * @param context of the app
     * @param books   is the list of books, which is the data source of the adapter
     */
    public BookAdapter(Activity context, ArrayList<Book> books) {
        super(context, 0, books);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_list, parent, false);
        }

        // Find the book at the given position on th list of books
        Book currentBook = (Book) getItem(position);

        // Find the ImageView with ID image
        ImageView image = (ImageView) listItemView.findViewById(R.id.image);

        // Load the image with Picasso library
        Picasso.with(getContext())
                .load(currentBook.getImageLink())
                .resize(128,155).into(image);

        // Find the TextView with ID title
        TextView titleView = (TextView) listItemView.findViewById(R.id.title);

        // Display the title of the current book in that TextView
        titleView.setText(currentBook.getTitle());

        // Find the TextView with ID author
        TextView authorView = (TextView) listItemView.findViewById(R.id.author);

        // Display the author name of the current book in that TextView
        authorView.setText("by " + currentBook.getAuthor());

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }

}
