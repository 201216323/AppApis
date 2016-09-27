package com.lnyp.api.juzi;

/**
 * 精选句集
 */
public class SentenceCollection {

    private String title;
    private String desc;
    private String imgUrl;
    private String detailUrl;
    private String username;
    private String count;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getDetailUrl() {
        return detailUrl;
    }

    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "SentenceCollection{" +
                "title='" + title + '\'' +
                ", desc='" + desc + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", detailUrl='" + detailUrl + '\'' +
                ", username='" + username + '\'' +
                ", count='" + count + '\'' +
                '}';
    }
}
