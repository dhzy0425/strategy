package com.sky.strategy.service.impl;

import com.sky.strategy.behavior.impl.CacheRedisImpl;
import com.sky.strategy.behavior.impl.PcRenderImpl;
import com.sky.strategy.service.BaseAbsServcie;

/**
 * Created by gantianxing on 2017/8/23.
 */
public class PcActServiceImpl extends BaseAbsServcie {
    private static final String PC_ACT_CACHE_PRE="pc_act_page_";

    public PcActServiceImpl(PcRenderImpl renderBehavior, CacheRedisImpl cacheBehavior){
        super.setRenderBehavior(renderBehavior);
        super.setCacheBehavior(cacheBehavior);
    }

    @Override
    protected void setParam(String pageId) {
        System.out.println("设置pc活动页缓存key");
        String cacheKey = PC_ACT_CACHE_PRE+pageId;
        super.setCacheKey(cacheKey);

        System.out.println("设置pc活动页cdn缓存URL");
        //根据pageId调用接口 获取页面链接
        String cdnUrl = "sale.jd.com/pc/act/"+pageId+".html";
        super.setCdnUrl(cdnUrl);
    }
}
