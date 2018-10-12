package com.boot.util;

import java.util.List;

public class PageBean<T> {

    private int pageSize;  //每页显示多少条

    private int pageNum;   //当前第几页

    private int totalRecord; //总记录数

    private int totalPage; //总页数

    private int startIndex; //从数据库第几条开始查询

    private List<T> list;  //从数据库获取list集合

    private int start;  //总共能显示多少页，从那一页开始

    private int end;   //到那一页结尾


    public PageBean(int pageNum, int pageSize, int totalRecord) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.totalRecord = totalRecord;
        if (totalRecord % pageSize == 0) {
            totalPage = totalRecord / pageSize;
        } else {
            totalPage = totalRecord / pageSize + 1;
        }

        this.startIndex = (pageNum -1) * pageSize;
        this.start = 1;
        this.end = 5;

        if (totalPage < 5) {
            this.end = this.totalPage;
        } else {
            this.start = pageNum - 2;
            this.end = pageNum + 2;

            if (start < 0) {
                this.start = 1;
                this.end = 5;
            }
            if (end > totalPage) {
                this.start = totalPage - 5;
                this.end = totalPage;

            }

        }

    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }
}
