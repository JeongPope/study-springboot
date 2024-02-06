package net.popehub.inflearn.discount

import net.popehub.inflearn.member.Grade
import net.popehub.inflearn.member.Member

class FixDiscountPolicy : DiscountPolicy {

    private var discountFixAmount: Int = 1000

    override fun discount(member: Member, price: Int): Int {
        return if (member.getGrade() == Grade.VIP) {
            discountFixAmount
        } else {
            0
        }
    }
}