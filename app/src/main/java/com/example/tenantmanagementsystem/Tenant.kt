package com.example.tenantmanagementsystemgroupc

data class Tenant(
    val name: String,
    val phone: String,
    val rent: String
) {
    fun summary(): String {
        return "Tenant: $name\nPhone: $phone\nRent Paid: KSh $rent"
    }
}