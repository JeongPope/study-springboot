package net.popehub.inflearn.order

class Order {

    private var memberId: Long = 0
    private var itemName: String = ""
    private var itemPrice: Int = 0
    private var discountPrice: Int = 0

    constructor(memberId: Long, itemName: String, itemPrice: Int, discountPrice: Int) {
        this.memberId = memberId
        this.itemName = itemName
        this.itemPrice = itemPrice
        this.discountPrice = discountPrice
    }

    fun calculatePrice(): Int {
        return itemPrice - discountPrice
    }

    fun getMemberId(): Long {
        return memberId
    }

    fun setMemberId(memberId: Long) {
        this.memberId = memberId
    }

    fun getItemName(): String {
        return itemName
    }

    fun setItemName(itemName: String) {
        this.itemName = itemName
    }

    fun getItemPrice(): Int {
        return itemPrice
    }

    fun setItemPrice(itemPrice: Int) {
        this.itemPrice = itemPrice
    }

    fun getDiscountPrice(): Int {
        return discountPrice
    }

    fun setDiscountPrice(discountPrice: Int) {
        this.discountPrice = discountPrice
    }

    override fun toString(): String {
        return "Order{memberId=$memberId, itemName='$itemName', itemPrice=$itemPrice, discountPrice=$discountPrice}"
    }
}