package com.lnyp.api.jiandan;

import java.util.List;

/**
 * Created by lining on 2016/8/26.
 */
public class MeizhiDatas {
    // 当前页
    public String current_comment_page;

    public List<MeizhiBean> meizhiBeanList;


    @Override
    public String toString() {
        return "MeizhiDatas{" +
                "current_comment_page='" + current_comment_page + '\'' +
                ", meizhiBeanList=" + meizhiBeanList +
                '}';
    }
}
