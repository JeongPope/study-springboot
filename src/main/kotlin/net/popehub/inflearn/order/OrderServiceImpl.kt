package net.popehub.inflearn.order

import net.popehub.inflearn.discount.DiscountPolicy
import net.popehub.inflearn.discount.FixDiscountPolicy
import net.popehub.inflearn.discount.RateDiscountPolicy
import net.popehub.inflearn.member.Member
import net.popehub.inflearn.member.MemberRepository
import net.popehub.inflearn.member.MemoryMemberRepository

class OrderServiceImpl : OrderService {

    private val memberRepository: MemberRepository
//    private val discountPolicy = FixDiscountPolicy()
//    private val discountPolicy = RateDiscountPolicy()
    private val discountPolicy: DiscountPolicy

    constructor(memberRepository: MemberRepository, discountPolicy: DiscountPolicy) {
        this.memberRepository = memberRepository
        this.discountPolicy = discountPolicy
    }

    override fun createOrder(memberId: Long, itemName: String, itemPrice: Int): Order {
        val member = memberRepository.findById(memberId)
        val discountPrice = discountPolicy.discount(member, itemPrice)

        return Order(memberId, itemName, itemPrice, discountPrice)
    }
}