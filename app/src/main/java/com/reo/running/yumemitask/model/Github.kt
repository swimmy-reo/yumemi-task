package com.reo.running.yumemitask.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Contributor(
    @PrimaryKey
    val id: Long,
    val login: String,
    val node_id: String,
    val avatar_url: String,
    val gravatar_id: String,
    val url: String,
    val html_url: String,
    val followers_url: String,
    val following_url: String,
    val gists_url: String,
    val starred_url: String,
    val subscriptions_url: String,
    val organizations_url: String,
    val repos_url: String,
    val events_url: String,
    val received_events_url: String,
    val type: String,
    val site_admin: Boolean,
    val contributions: Long,
) {
    fun idText(): String = id.toString()
    fun contributionsText(): String = contributions.toString()
    fun siteAdminText(): String = site_admin.toString()
}