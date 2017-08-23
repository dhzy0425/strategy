package com.sky.strategy.behavior.impl;

import com.sky.strategy.behavior.CacheBehavior;

/**
 * Created by gantianxing on 2017/8/23.
 */
public class CacheNoImpl implements CacheBehavior {

    @Override
    public void handerCache(String key,String content,String cdnUrl) {
        System.out.println("无缓存");
    }
}
