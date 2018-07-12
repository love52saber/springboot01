package com.model;

import java.util.List;

public class PageBean<T> {
    public Integer pageNum;//当前页
    public Integer pageSize;//每页数量
    public Integer totalCount;//查询总数
    public Integer totalPage;//总页数
    public List<T> list;//分页结果

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public PageBean(Integer pageNum, Integer pageSize, Integer totalCount, List<T> list) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.totalCount = totalCount;
        this.list = list;
        this.totalPage = (totalCount + pageSize - 1) / pageSize;
    }
}
