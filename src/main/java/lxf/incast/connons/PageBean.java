package lxf.incast.connons;

import java.io.Serializable;
import java.util.List;

import lxf.incast.entity.GradeTable;

/*
 * 用于封装分页的数据对象
 * */
public class PageBean implements Serializable {

	List<GradeTable> data; // 当前页数据
	int firstPage; // 首页
	int prePage; // 上一页
	int nextPage;// 下一页
	int totalPage;// 末页/总页数
	int currentPage;// 当前页
	int totalCount;// 总记录数
	int pageSize;// 每页显示记录数
	public List<GradeTable> getData() {
		return data;
	}
	public void setData(List<GradeTable> data) {
		this.data = data;
	}
	public int getFirstPage() {
		return 1;
	}
	
	//1.3 上一页     算法：如果当前页是首页，则为1，否则为（当前页-1）
	public int getPrePage() {
		return this.getCurrentPage()==this.getFirstPage()
				?1:
				this.getCurrentPage()-1;
	}
	
	public int getNextPage() {
		return this.getCurrentPage()==this.getTotalPage()
				? this.getTotalPage()
				: this.getCurrentPage()+1;
	}
	
	//1.6 末页/总页数    算法：  如果   总记录数%每页显示记录数能够整除 ,则为（总记录数/每页显示记录数），否则  （总记录数/每页显示记录数+1）
	public int getTotalPage() {
		return this.getTotalCount()%this.getPageSize()==0
				? this.getTotalCount()/this.getPageSize()
				: this.getTotalCount()/this.getPageSize()+1;
	}
	
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getPageSize() {
		return 10;
	}
	
	
	
}
