package com.github.aya.jobs;

import com.geccocrawler.gecco.pipeline.Pipeline;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/5/4.
 */
@Service
public class EndPipeLine implements Pipeline<Movie> {
    public void process(Movie bean) {
        for(String url : bean.getUrls()){
            System.out.println("downloadUrl:"+url);
        }
    }
}
