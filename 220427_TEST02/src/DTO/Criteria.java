package DTO;

public class Criteria {
	
	int pageNum; 
	int amount; 
	String type; 
	String keyword; 
	String[] authorArr; 
	String cateCode; 
	int bookId;
	
	
	public Criteria() {
		super();
	}
	
	
	public Criteria(int pageNum, int amount) {
		super();
		this.pageNum = pageNum;
		this.amount = amount;
	}


	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String[] getAuthorArr() {
		return authorArr;
	}
	public void setAuthorArr(String[] authorArr) {
		this.authorArr = authorArr;
	}
	public String getCateCode() {
		return cateCode;
	}
	public void setCateCode(String cateCode) {
		this.cateCode = cateCode;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	} 
	
	
}
