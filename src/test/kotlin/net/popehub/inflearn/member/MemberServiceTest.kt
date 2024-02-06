package net.popehub.inflearn.member

import net.popehub.inflearn.AppConfig
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class MemberServiceTest {

    private lateinit var memberService: MemberService

    @BeforeEach
    fun beforeEach() {
        memberService = AppConfig().MemberService()
    }

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