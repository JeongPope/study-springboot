package net.popehub.inflearn

import net.popehub.inflearn.discount.DiscountPolicy
import net.popehub.inflearn.discount.FixDiscountPolicy
import net.popehub.inflearn.discount.RateDiscountPolicy
import net.popehub.inflearn.member.MemberService
import net.popehub.inflearn.member.MemberServiceImpl
import net.popehub.inflearn.member.MemoryMemberRepository
import net.popehub.inflearn.order.OrderService
import net.popehub.inflearn.order.OrderServiceImpl

class AppConfig {

    private var memberRepository = MemoryMemberRepository()
//    private var discountPolicy = FixDiscountPolicy()
    private var discountPolicy = RateDiscountPolicy()

    fun MemberService(): MemberService {
        return MemberServiceImpl(memberRepository)
    }

    fun DiscountPolicy(): DiscountPolicy {
        return discountPolicy
    }

    fun OrderService(): OrderService {
        return OrderServiceImpl(memberRepository, discountPolicy)
    }
}