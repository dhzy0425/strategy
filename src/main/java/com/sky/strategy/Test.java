package com.sky.strategy;

import com.sky.strategy.behavior.impl.CacheNoImpl;
import com.sky.strategy.behavior.impl.CacheRedisImpl;
import com.sky.strategy.behavior.impl.MRenderImpl;
import com.sky.strategy.service.impl.MActServiceImpl;

/**
 * Created by gantianxing on 2017/8/23.
 */
public class Test {

    private MySpringFactory mySpringFactory;

    public void commonRender(String type,String pageId){
        mySpringFactory.doRender(type,pageId);
    }

    public static void main(String[] args) {
        MActServiceImpl mact = new MActServiceImpl(new MRenderImpl(),new CacheRedisImpl());
        mact.setCacheBehavior(new CacheNoImpl());
        String pageId="sdfsdfsfd";
        mact.render(pageId);
    }

}
