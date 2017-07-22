package com.example.android.books;

import java.io.Serializable;

/**
 * {@link Book} is a custom class that store information about
 * a book such as: title, author, publisher, published date.
 */

public class Book implements Serializable {

    /**  Variable to store the image link of the book */
    private String mImageLink;

    /** Variable to store the title of the book */
    private String mTitle;

    /** Variable to store the author name of the book */
    private String mAuthor;

    /** Variable to store the publisher and the published date of the book */
    private String mPublisherAndDate;

    /**  Variable to store the description of the book */
    private String mDescription;

    /** variables to store the average rating of the book */
    private float mAverageRating;

    /**  Variable to store the ratings number of the book */
    private String mRatingsCount;


    /**
     * Construct a new {@link Book} object.
     * @param title is the title of the book.
     * @param author is the author of the book.
     * @param publisherAndDate is the publisher and the published date of the book.
     * @param imageLink is the image link of the book.
     * @param averageRating is the average rating of the book.
     */
    public Book (String imageLink, String title, String author, String publisherAndDate, String description, float averageRating, String ratingsCount) {
        mImageLink = imageLink;
        mTitle = title;
        mAuthor = author;
        mPublisherAndDate = publisherAndDate;
        mDescription = description;
        mAverageRating = averageRating;
        mRatingsCount = ratingsCount;
    }

    /**
     * Get the title of the book.
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Get the author name of the book.
     */
    public String getAuthor() {
        return mAuthor;
    }

    /**
     * Get the publisher and the published date of the book.
     */
    public String getPublisherAndDate() {
        return mPublisherAndDate;
    }

    /**
     * Get the image link of the book.
     */
    public String getImageLink() {
        return mImageLink;
    }

    /**
     * Get the image link of the book.
     */
    public float getAverageRating() {
        return mAverageRating;
    }

    /**
     * Get the description of the book.
     */
    public String getDescription() {
        return mDescription;
    }

    /**
     * Get the ratings numbers of the book.
     */
    public String getRatingsCount() {
        return mRatingsCount;
    }
}
