package Book;

public interface BookService {
	
	public void getGoodsList(String cri); /* 상품 검색 */
	public void goodsGetTotal(String cri); /* 상품 총 갯수 */
	public void getCateCode1(); /* 국내 카테고리 리스트 */
	public void getCateCode2(); /* 외국 카테고리 리스트 */
	public void getGoodsInfo(int bookId); /* 상품 정보 */
	public void getBookIdName(int bookId); /* 상품 id 이름 */
	public void authorEnroll(String author); /* 작가 등록 */

}
