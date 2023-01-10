package com.example.cryptocurrencyapp.domain.model

import com.example.cryptocurrencyapp.data.remote.dto.*

data class CoinDetail(
    val description: String,
    val coinId: String,
    val name: String,
    val rank: Int,
    val isActive: Boolean,
    val symbol: String,
    val tags: List<String>,
    val team: List<TeamMember>,
)
