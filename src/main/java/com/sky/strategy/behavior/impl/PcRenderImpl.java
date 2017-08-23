package com.sky.strategy.behavior.impl;

import com.sky.strategy.behavior.RenderBehavior;

/**
 * Created by gantianxing on 2017/8/23.
 */
public class PcRenderImpl implements RenderBehavior {

    @Override
    public String doRender(String pageId) {
        System.out.println("pc页面渲染");
        return "<html>pc</html>";
    }
}
