package com.sky.strategy.behavior.impl;

import com.sky.strategy.behavior.RenderBehavior;

/**
 * Created by gantianxing on 2017/8/23.
 */
public class MRenderImpl implements RenderBehavior {

    @Override
    public String doRender(String pageId) {
        System.out.println("m页面渲染");
        return "<html>m</html>";
    }
}
