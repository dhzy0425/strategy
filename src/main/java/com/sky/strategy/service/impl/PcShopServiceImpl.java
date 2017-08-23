package com.sky.strategy.service.impl;

import com.sky.strategy.behavior.impl.CacheDiskImpl;
import com.sky.strategy.behavior.impl.PcRenderImpl;
import com.sky.strategy.service.BaseAbsServcie;

/**
 * Created by gantianxing on 2017/8/23.
 */
public class PcShopServiceImpl extends BaseAbsServcie {
    private static final String PC_SHOP_CACHE_PRE="pc_shop_page_";

    public PcShopServiceImpl(PcRenderImpl renderBehavior, CacheDiskImpl cacheBehavior){
        super.setRenderBehavior(renderBehavior);
        super.setCacheBehavior(cacheBehavior);
    }

    @Override
    protected void setParam(String pageId) {
        System.out.println("设置pc店铺页缓存key");
        String cacheKey = PC_SHOP_CACHE_PRE+pageId;
        super.setCacheKey(cacheKey);

        System.out.println("设置pc店铺页cdn缓存URL");
        //根据pageId调用接口 获取页面链接
        String cdnUrl = "shop.jd.com/"+pageId+".html";
        super.setCdnUrl(cdnUrl);
    }
}
