package com.enpassio.databindingwithnewsapi.utils;

import com.enpassio.databindingwithnewsapi.BuildConfig;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

final class Constants {

    private Constants() {
        //Make it impossible to instantiate this class
        throw new AssertionError();
    }

    // Constants and keys related to News Api
    static final String ARTICLES_ARRAY = "articles";
    static final String NEWS_API_KEY = "apiKey";
    static final String NEWS_API_VALUE = BuildConfig.NEWS_API_DOT_ORG_KEY;
    static final String EVERYTHING_ENDPOINT = "everything";
    static final String PAGE_SIZE_PARAM = "pageSize";
    static final String SORT_BY_PARAM = "sortBy";
    static final String FROM_DATE_PARAM = "from";
    static final String LANGUAGE_PARAM = "language";
    static final String QUERY_PARAM = "q";
    static final String SOURCE = "source";
    static final String SOURCE_NAME = "name";
    static final String AUTHOR = "author";
    static final String TITLE = "title";
    static final String DESCRIPTION = "description";
    static final String IMAGE_URL = "urlToImage";
    static final String PUBLISHING_TIME = "publishedAt";
    static final String ARTICLE_BODY = "content";

    //Sample values used for building a url, which can be changed
    static final String BASE_URL = "https://newsapi.org/v2/";
    static final String SAMPLE_QUERY = "technology";
    static final String SAMPLE_DATE = getTheDateOfLastWeek();
    static final String SAMPLE_PAGE_SIZE = "10";
    static final String ENGLISH = "en";

    private static String getTheDateOfLastWeek() {
        //Get today's date and then go back 7 days
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, -7);
        SimpleDateFormat newFormat = new SimpleDateFormat("yyyy-MM-dd");
        return newFormat.format(new Date(calendar.getTimeInMillis()));
    }
}
