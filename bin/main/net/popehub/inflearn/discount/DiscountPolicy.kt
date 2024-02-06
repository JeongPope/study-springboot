package net.popehub.inflearn.discount

import net.popehub.inflearn.member.Member

interface DiscountPolicy {

    /**
     * @param member
     * @param price
     * @return
     */
    fun discount(member: Member, price: Int): Int
}