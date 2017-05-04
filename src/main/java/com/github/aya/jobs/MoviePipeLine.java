package com.github.aya.jobs;

import com.geccocrawler.gecco.pipeline.Pipeline;
import com.geccocrawler.gecco.scheduler.StartSchedulerContext;
import com.geccocrawler.gecco.spider.SpiderBean;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/5/4.
 */
@Service
public class MoviePipeLine  implements Pipeline<Pages> {
    public void process(Pages bean) {
        for(Page page:bean.getPageList()){
            bean.getHttpRequest().addCookie("platform","pc");
            bean.getHttpRequest().addCookie("ss","472953750941526944");
            bean.getHttpRequest().addCookie("bs","aq3l55nn6wdryzz7iiv9c3yorpe4nhiq");
            bean.getHttpRequest().addCookie("RNLBSERVERID","ded6698");
            bean.getHttpRequest().addCookie("FPSRN","11");
            bean.getHttpRequest().addCookie("desired_username","ls9527%7C364173778%40qq.com");
            bean.getHttpRequest().addCookie("il","v1k3lgJ-XAS18YVxo1z5_zjGY9SU74FDmilMV0hZ2E9bQxNDkzOTExNTc5MzIzNjA3NDQx");
            bean.getHttpRequest().addCookie("expiredEnterModalShown","1");
            bean.getHttpRequest().addCookie("adBlockAlertHidden","1");
            StartSchedulerContext.into(bean.getHttpRequest().subRequest(page.getUrl()));
        }
    }
}
