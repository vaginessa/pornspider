package com.github.aya.jobs;

import com.geccocrawler.gecco.annotation.*;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.spider.HtmlBean;

/**
 * Created by Administrator on 2017/5/3.
 */
public class Page implements HtmlBean {



    @Attr("data-mediumthumb")
    @HtmlField(cssPath = "div.img.videoPreviewBg > a > img")
    private String thumb;

    @Href
    @HtmlField(cssPath = "div.phimage > a.img")
    private String url;

    @HtmlField(cssPath = "div.thumbnail-info-wrapper.clearfix a")
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getThumb() {
        return thumb;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }
}
