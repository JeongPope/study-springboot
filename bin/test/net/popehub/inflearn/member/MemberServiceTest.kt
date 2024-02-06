package net.popehub.inflearn.member

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MemberServiceTest {

    private var memberService = MemberServiceImpl()

    @Test
    fun join() {
        // given
        var member = Member(1L, "memberA", Grade.BASIC)

        // when
        memberService.join(member)
        var findMember = memberService.findMember(1L)

        // then
        assertThat(member).isEqualTo(findMember)
    }
}