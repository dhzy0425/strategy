package com.sky.strategy.service.impl;

import com.sky.strategy.behavior.impl.CacheDiskImpl;
import com.sky.strategy.behavior.impl.MRenderImpl;
import com.sky.strategy.service.BaseAbsServcie;

/**
 * Created by gantianxing on 2017/8/23.
 */
public class MShopServiceImpl extends BaseAbsServcie {
    private static final String M_SHOP_CACHE_PRE="m_shop_page_";

    public MShopServiceImpl(MRenderImpl renderBehavior, CacheDiskImpl cacheBehavior){
        super.setRenderBehavior(renderBehavior);
        super.setCacheBehavior(cacheBehavior);
    }

    @Override
    protected void setParam(String pageId) {
        System.out.println("设置m店铺页缓存key");
        String cacheKey = M_SHOP_CACHE_PRE+pageId;
        super.setCacheKey(cacheKey);

        System.out.println("设置m店铺页cdn缓存URL");
        //根据pageId调用接口 获取页面链接
        String cdnUrl = "m.shop.jd.com/"+pageId+".html";
        super.setCdnUrl(cdnUrl);
    }
}
