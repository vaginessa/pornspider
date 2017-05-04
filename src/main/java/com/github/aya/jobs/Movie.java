package com.github.aya.jobs;

import com.geccocrawler.gecco.annotation.*;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.spider.HtmlBean;

import java.util.List;

/**
 * Created by Administrator on 2017/5/4.
 */
@Gecco(matchUrl = "https://www.pornhub.com/view_video.php?viewkey={viewKey}",pipelines = {"consolePipeLine","endPipeLine"})
public class Movie implements HtmlBean {
@RequestParameter
    private String viewKey;

@Request
    HttpRequest request;

    @Href
    @HtmlField(cssPath = "div.video-action-tab.download-tab > a")
    private List<String> urls;

    @HtmlField(cssPath = "div.video-action-tab.download-tab > a")
    private String url;


    public List<String> getUrls() {
        return urls;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getViewKey() {
        return viewKey;
    }

    public void setViewKey(String viewKey) {
        this.viewKey = viewKey;
    }
}
