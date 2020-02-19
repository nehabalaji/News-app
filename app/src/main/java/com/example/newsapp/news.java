package com.example.newsapp;

public class news {
private String mtitle;
private String mPublisherDetails;
private String mUrl;

public news(String title, String publisherDetails, String Url){
    mtitle = title;
    mPublisherDetails = publisherDetails;
    mUrl = Url;
}

private String getMtitle(){
    return mtitle;
}
private String getmPublisherDetails(){
    return mPublisherDetails;
}
private String getmUrl(){
    return mUrl;
}
}
