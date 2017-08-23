package com.sky.strategy.service;

import com.sky.strategy.behavior.CacheBehavior;
import com.sky.strategy.behavior.RenderBehavior;

/**
 * Created by gantianxing on 2017/8/20.
 */
public abstract class BaseAbsServcie implements BaseService {

    private RenderBehavior renderBehavior;

    private CacheBehavior cacheBehavior;

    private String cacheKey;

    private String cdnUrl;

    //页面渲染主流程
    public String render(String pageId){
        setParam(pageId);
        try{
            //渲染页面
            String pageHtml = renderBehavior.doRender(pageId);
            if(pageHtml != null){
                //缓存处理
                cacheBehavior.handerCache(cacheKey,pageHtml,cdnUrl);
            }

        }catch (Exception e){
            return "111";//失败
        }
        return  "000";//成功
    }

    protected abstract void setParam(String pageId);

    public void setRenderBehavior(RenderBehavior renderBehavior) {
        this.renderBehavior = renderBehavior;
    }

    public void setCacheBehavior(CacheBehavior cacheBehavior) {
        this.cacheBehavior = cacheBehavior;
    }

    public void setCacheKey(String cacheKey) {
        this.cacheKey = cacheKey;
    }

    public void setCdnUrl(String cdnUrl) {
        this.cdnUrl = cdnUrl;
    }
}
