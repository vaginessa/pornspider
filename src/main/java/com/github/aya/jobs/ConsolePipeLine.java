package com.github.aya.jobs;

import com.alibaba.fastjson.JSON;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.geccocrawler.gecco.spider.SpiderBean;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/5/3.
 */
@Service
public class ConsolePipeLine implements Pipeline<SpiderBean> {
    public void process(SpiderBean spiderBean) {
        System.out.println(JSON.toJSONString(spiderBean));
    }
}
