package net.popehub.inflearn.discount

import net.popehub.inflearn.AppConfig
import net.popehub.inflearn.member.Grade
import net.popehub.inflearn.member.Member
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class RateDiscountPolicyTest {

    private lateinit var discountPolicy: DiscountPolicy

    @BeforeEach
    fun beforeEach() {
        discountPolicy = AppConfig().DiscountPolicy()
    }

    @Test
    @DisplayName("VIP는 10% 할인이 적용되어야 한다.")
    fun vip_o() {
        // given
        var member = Member(1L, "memberA", Grade.VIP)

        // when
        var discountPrice = discountPolicy.discount(member, 10000)

        // then
        assertThat(discountPrice).isEqualTo(1000)
    }

    @Test
    @DisplayName("VIP가 아니면 할인이 적용되지 않아야 한다.")
    fun vip_x() {
        // given
        var member = Member(2L, "memberB", Grade.BASIC)

        // when
        var discountPrice = discountPolicy.discount(member, 10000)

        // then
        assertThat(discountPrice).isEqualTo(0)
    }
}