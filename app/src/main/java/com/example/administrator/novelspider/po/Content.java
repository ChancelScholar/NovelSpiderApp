package com.example.administrator.novelspider.po;

/**
 * Created by Administrator on 2018/10/9 0009.
 * 小说文本内容
 */

public class Content {
    private String chapterName;     //章节名
    private String content;          //文本内容
    private String lastChapterLink;    //上一章链接
    private String nextChapterLink;    //下一章链接
    private String bookName;         //书名

    public String getLastChapterLink() {
        return lastChapterLink;
    }

    public void setLastChapterLink(String lastChapterLink) {
        this.lastChapterLink = lastChapterLink;
    }

    public String getNextChapterLink() {
        return nextChapterLink;
    }

    public void setNextChapterLink(String nextChapterLink) {
        this.nextChapterLink = nextChapterLink;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getChapterName(){
        return chapterName;
    }

    public String getContent(){
        return content;
    }

    public void setChapterName(String chapterName){
        this.chapterName = chapterName;
    }

    public void setContent(String content){
        this.content = content;
    }
}