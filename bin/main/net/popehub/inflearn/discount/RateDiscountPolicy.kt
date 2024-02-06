package net.popehub.inflearn.discount

import net.popehub.inflearn.member.Grade
import net.popehub.inflearn.member.Member

class RateDiscountPolicy : DiscountPolicy {

    private val discountPercent = 10

    override fun discount(member: Member, price: Int): Int {
        return if (member.getGrade() == Grade.VIP) {
            price * discountPercent / 100
        } else {
            0
        }
    }
}