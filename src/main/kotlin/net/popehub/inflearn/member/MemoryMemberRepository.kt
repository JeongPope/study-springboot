package net.popehub.inflearn.member

class MemoryMemberRepository : MemberRepository {

    private companion object {
        val store = hashMapOf<Long, Member>()
    }

    override fun save(member: Member) {
        store[member.getId()] = member
    }

    override fun findById(memberId: Long): Member {
        return store[memberId]!!
    }
}