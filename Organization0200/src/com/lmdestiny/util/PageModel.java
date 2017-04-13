package com.lmdestiny.util;

import java.util.List;

/**
 *	分页模型
 * @author wangbin
 *
 */
public class PageModel<E> {
	//当前页
	private Integer pageNo;
	//每页的记录条数
	private Integer pageSize;
	//总共的记录数
	private Integer totalNo;
	//总共的页数
	private Integer totalPage;
	private List<E> items;
	
	public Integer getPageNo() {
		return pageNo;
	}
	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getTotalNo() {
		return totalNo;
	}
	public void setTotalNo(Integer totalNo) {
		this.totalNo = totalNo;
	}
	public Integer getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
	public List<E> getItems() {
		return items;
	}
	public void setItems(List<E> items) {
		this.items = items;
	}   
}
