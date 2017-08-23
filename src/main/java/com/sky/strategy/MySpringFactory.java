package com.sky.strategy;

import com.sky.strategy.service.BaseAbsServcie;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by gantianxing on 2017/8/23.
 */
public class MySpringFactory {
    private Map<String, BaseAbsServcie> servcieMap = new HashMap();

    public Map<String, BaseAbsServcie> getServcieMap() {
        return servcieMap;
    }

    public void setServcieMap(Map<String, BaseAbsServcie> servcieMap) {
        this.servcieMap = servcieMap;
    }

    public void doRender(String strType,String pageId) {
        this.servcieMap.get(strType).render(pageId);
    }
}
