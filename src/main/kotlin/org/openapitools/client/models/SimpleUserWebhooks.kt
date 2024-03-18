/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models


import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * The GitHub user that triggered the event. This property is included in every webhook payload.
 *
 * @param login 
 * @param id 
 * @param nodeId 
 * @param avatarUrl 
 * @param gravatarId 
 * @param url 
 * @param htmlUrl 
 * @param followersUrl 
 * @param followingUrl 
 * @param gistsUrl 
 * @param starredUrl 
 * @param subscriptionsUrl 
 * @param organizationsUrl 
 * @param reposUrl 
 * @param eventsUrl 
 * @param receivedEventsUrl 
 * @param type 
 * @param siteAdmin 
 * @param name 
 * @param email 
 * @param starredAt 
 */
@Serializable

data class SimpleUserWebhooks (

    @SerialName(value = "login")
    val login: kotlin.String,

    @SerialName(value = "id")
    val id: kotlin.Int,

    @SerialName(value = "node_id")
    val nodeId: kotlin.String,

    @Contextual @SerialName(value = "avatar_url")
    val avatarUrl: java.net.URI,

    @SerialName(value = "gravatar_id")
    val gravatarId: kotlin.String?,

    @Contextual @SerialName(value = "url")
    val url: java.net.URI,

    @Contextual @SerialName(value = "html_url")
    val htmlUrl: java.net.URI,

    @Contextual @SerialName(value = "followers_url")
    val followersUrl: java.net.URI,

    @SerialName(value = "following_url")
    val followingUrl: kotlin.String,

    @SerialName(value = "gists_url")
    val gistsUrl: kotlin.String,

    @SerialName(value = "starred_url")
    val starredUrl: kotlin.String,

    @Contextual @SerialName(value = "subscriptions_url")
    val subscriptionsUrl: java.net.URI,

    @Contextual @SerialName(value = "organizations_url")
    val organizationsUrl: java.net.URI,

    @Contextual @SerialName(value = "repos_url")
    val reposUrl: java.net.URI,

    @SerialName(value = "events_url")
    val eventsUrl: kotlin.String,

    @Contextual @SerialName(value = "received_events_url")
    val receivedEventsUrl: java.net.URI,

    @SerialName(value = "type")
    val type: kotlin.String,

    @SerialName(value = "site_admin")
    val siteAdmin: kotlin.Boolean,

    @SerialName(value = "name")
    val name: kotlin.String? = null,

    @SerialName(value = "email")
    val email: kotlin.String? = null,

    @SerialName(value = "starred_at")
    val starredAt: kotlin.String? = null

)
