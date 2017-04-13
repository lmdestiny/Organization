package com.lmdestiny.util;

import java.util.List;

/**
 *	��ҳģ��
 * @author wangbin
 *
 */
public class PageModel<E> {
	//��ǰҳ
	private Integer pageNo;
	//ÿҳ�ļ�¼����
	private Integer pageSize;
	//�ܹ��ļ�¼��
	private Integer totalNo;
	//�ܹ���ҳ��
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
