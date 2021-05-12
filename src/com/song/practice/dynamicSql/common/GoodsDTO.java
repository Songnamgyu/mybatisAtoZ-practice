package com.song.practice.dynamicSql.common;

import java.util.Date;

public class GoodsDTO implements java.io.Serializable {
	
	private int no;
	private String name;
	private int price;
	private int writerNo;
	private int typeNo;
	private java.util.Date createdDate;
	private String status;
	private java.util.Date modifiedDate;

	public GoodsDTO() {}

	public GoodsDTO(int no, String name, int price, int writerNo, int typeNo, Date createdDate, String status,
			Date modifiedDate) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
		this.writerNo = writerNo;
		this.typeNo = typeNo;
		this.createdDate = createdDate;
		this.status = status;
		this.modifiedDate = modifiedDate;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getWriterNo() {
		return writerNo;
	}

	public void setWriterNo(int writerNo) {
		this.writerNo = writerNo;
	}

	public int getTypeNo() {
		return typeNo;
	}

	public void setTypeNo(int typeNo) {
		this.typeNo = typeNo;
	}

	public java.util.Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(java.util.Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public java.util.Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(java.util.Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	@Override
	public String toString() {
		return "GoodsDTO [no=" + no + ", name=" + name + ", price=" + price + ", writerNo=" + writerNo + ", typeNo="
				+ typeNo + ", createdDate=" + createdDate + ", status=" + status + ", modifiedDate=" + modifiedDate
				+ "]";
	}
	
	
	
	

}
