package company.team.infrastructure;

import company.team.domain.Member;
import company.team.domain.MemberRepository;

public class JPAMemberRepository implements MemberRepository {

    private final MemberEntityRepository  memberEntityRepository;

    public JPAMemberRepository(MemberEntityRepository memberEntityRepository) {
        this.memberEntityRepository = memberEntityRepository;
    }

    @Override
    public Member save(Member member) {
        MemberEntity entity = new MemberEntity(member.getId().uuid(), member.getName(), member.getSurname(), member.getEmail().email(), member.getSalary(), member.getCurrency().getCurrencyCode(), member.isAdmin());
        memberEntityRepository.save(entity);
        return member;
    }
}
