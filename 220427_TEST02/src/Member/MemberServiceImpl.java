package Member;

public class MemberServiceImpl implements MemberService {

	@Override
	public void memberJoin(String member) {
		System.out.println("회원가입");
	}

	@Override
	public void idCheck(String memberId) {
		System.out.println("아이디 중복 검사");
	}

	@Override
	public void memberLogin(String member) {
		System.out.println("로그인");
	}

	@Override
	public void getMemberInfo(String memberId) {
		System.out.println("주문자 정보");
	}
	
	

}
