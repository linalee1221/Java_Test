package Book;

public class BookServiceImpl implements BookService {

	@Override
	public void getGoodsList(String cri) {
		System.out.println("상품 검색");
	}

	@Override
	public void goodsGetTotal(String cri) {
		System.out.println("상품 총 개수");
	}

	@Override
	public void getCateCode1() {
		System.out.println("국내 카테고리 리스트");
	}

	@Override
	public void getCateCode2() {
		System.out.println("외국 카테고리 리스트");
	}

	@Override
	public void getGoodsInfo(int bookId) {
		System.out.println("상품 정보");
	}

	@Override
	public void getBookIdName(int bookId) {
		System.out.println("상품 id 이름");
	}

	@Override
	public void authorEnroll(String author) {
		System.out.println("작가 등록");
	}
	
}
