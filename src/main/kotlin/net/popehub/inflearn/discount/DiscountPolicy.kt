package net.popehub.inflearn.discount

import net.popehub.inflearn.member.Member

interface DiscountPolicy {

    fun discount(member: Member, price: Int): Int
}