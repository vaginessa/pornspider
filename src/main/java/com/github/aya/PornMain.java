package com.github.aya;

import com.geccocrawler.gecco.GeccoEngine;
import com.geccocrawler.gecco.downloader.proxy.FileProxys;
import com.geccocrawler.gecco.downloader.proxy.Proxys;
import com.geccocrawler.gecco.spring.SpringPipelineFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by Administrator on 2017/5/3.
 */
public class PornMain {
    public static void main(String[] args) throws IOException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        GeccoEngine.create()
//                .proxy(true)
                .pipelineFactory(applicationContext.getBean(SpringPipelineFactory.class))
                //工程的包路径
                .classpath("com.github.aya")
                //开始抓取的页面地址
                .start("https://www.pornhub.com/")
//                .start("http://www.vip.com/")
                //开启几个爬虫线程
                .thread(1)
                //单个爬虫每次抓取完一个请求后的间隔时间
                .interval(2000)
                //使用pc端userAgent
                .mobile(false)
                //非阻塞方式运行
                .start();

        System.in.read();
    }
}
