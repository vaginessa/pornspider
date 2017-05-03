package com.github.aya.jobs;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Image;
import com.geccocrawler.gecco.spider.HtmlBean;

import java.util.List;

/**
 * Created by Administrator on 2017/5/3.
 */
@Gecco(matchUrl = "http://www.vip.com/",pipelines = {"consolePipeLine"})
public class WeipiPages implements HtmlBean {
    @HtmlField(cssPath = ".nav-title")
    private String imgs;

    public String getImgs() {
        return imgs;
    }

    public void setImgs(String imgs) {
        this.imgs = imgs;
    }
}
