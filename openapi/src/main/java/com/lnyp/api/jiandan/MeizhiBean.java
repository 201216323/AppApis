package com.lnyp.api.jiandan;

import java.util.List;

/**
 * 妹子图
 */
public class MeizhiBean {
    public String author;
    public String lastUpdateTime;
    public List<String> imgs;

    @Override
    public String toString() {
        return "MeizhiBean{" +
                "author='" + author + '\'' +
                ", lastUpdateTime='" + lastUpdateTime + '\'' +
                ", imgs=" + imgs +
                '}';
    }
}
