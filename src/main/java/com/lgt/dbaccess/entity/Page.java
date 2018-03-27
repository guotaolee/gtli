package com.lgt.dbaccess.entity;

public class Page {
    private int totalNumber;//总条数

    private int currentPage;//当前页

    private int totalPage;//总页数

    private int pageNumber = 5;//每页显示条数

    private int dbIndex;//数据库中limit的参数，从第几条开始取

    private int dbNumber;//数据库中limit的参数，一共取多少条

    /**
     * 计算总页数
     */
    public void count(){
        int totalPageTemp = this.totalNumber / this.pageNumber;
        int plus = (this.totalNumber % this.pageNumber) == 0 ? 0 : 1;
        totalPageTemp = totalPageTemp + plus;
        if(totalPageTemp <= 0){
            totalPageTemp = 1;
        }
        this.totalPage = totalPageTemp;

        if (totalPage < currentPage){
            currentPage = totalPage;
        }

        if (currentPage < 1){
            currentPage = 1;
        }

        /**
         * 设置limit参数
         */
        this.dbIndex = (this.currentPage - 1) * totalNumber;
        this.dbNumber = this.pageNumber;

    }

    public int getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(int totalNumber) {
        this.totalNumber = totalNumber;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getDbIndex() {
        return dbIndex;
    }

    public void setDbIndex(int dbIndex) {
        this.dbIndex = dbIndex;
    }

    public int getDbNumber() {
        return dbNumber;
    }

    public void setDbNumber(int dbNumber) {
        this.dbNumber = dbNumber;
    }
}
