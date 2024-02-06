package net.popehub.inflearn.order

import net.popehub.inflearn.member.Grade
import net.popehub.inflearn.member.Member
import net.popehub.inflearn.member.MemberServiceImpl
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class OrderServiceTest {

    private var memberService = MemberServiceImpl()
    private val orderService = OrderServiceImpl()

    @Test fun createOrderTest() {
        // given
        var memberId: Long = 1L
        var itemName: String = "itemA"
        var itemPrice: Int = 10000

        var member = Member(memberId, "memberA", Grade.VIP)
        memberService.join(member)

        // when
        var order = orderService.createOrder(memberId, itemName, itemPrice)

        // then
        assertThat(order.getDiscountPrice()).isEqualTo(1000)
    }
}