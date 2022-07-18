package Member;

public interface MemberService {
	
	public void memberJoin(String member); /* 회원가입 */
	public void idCheck(String memberId); /* 아이디 중복 검사 */
	public void memberLogin(String member); /* 로그인 */
	public void getMemberInfo(String memberId); /* 주문자 정보 */

}
