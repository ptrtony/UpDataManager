package com.dophintek.updatamanager;

/**
 * Created by Dafen on 2018/9/10.
 */

public interface OnUpdataListener {
    public void onUpdataListener();
    public void toLoginActivity();
    public void onStatusNextActivity(int type); // type:1 登录  2：认证  3：认证中  4 ：主页
}
