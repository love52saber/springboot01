package com.query;

public class BaseQuery {

    //默认每页展示10条
    private Integer pageSize = 10;

    //默认当前页
    private Integer pageNum = 1;

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }
}
