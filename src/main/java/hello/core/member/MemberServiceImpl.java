package hello.core.member;

public class MemberServiceImpl implements MemberService{
    //구현 객체 지정해야 nullpointexception 발생x
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
