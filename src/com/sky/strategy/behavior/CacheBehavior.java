package com.sky.strategy.behavior;

/**
 * Created by gantianxing on 2017/8/23.
 */
public interface CacheBehavior {
    void handerCache(String key, String content, String cdnUrl);
}
