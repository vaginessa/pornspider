package com.github.aya.jobs;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.Html;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Request;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.spider.HtmlBean;

import java.util.List;

/**
 * Created by Administrator on 2017/5/3.
 */
@Gecco(matchUrl = "https://www.pornhub.com/" ,pipelines = {"consolePipeLine","moviePipeLine"})
public class Pages implements HtmlBean {
    @HtmlField(cssPath = ".sectionWrapper  li.videoblock")
    private List<Page> pageList;
    @Request
    HttpRequest httpRequest;



    public List<Page> getPageList() {
        return pageList;
    }

    public void setPageList(List<Page> pageList) {
        this.pageList = pageList;
    }

    public HttpRequest getHttpRequest() {
        return httpRequest;
    }

    public void setHttpRequest(HttpRequest httpRequest) {
        this.httpRequest = httpRequest;
    }
}
