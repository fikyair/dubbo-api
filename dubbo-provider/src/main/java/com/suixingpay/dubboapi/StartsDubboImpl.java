package com.suixingpay.dubboapi;

/**
 * Created by fisherman on 2017/11/14.
 */
public class StartsDubboImpl implements StartsDubbo {

    @Override
    public String getStart() {
        String str = "恭喜你获得五星好评！！";
        return str;
    }
}
