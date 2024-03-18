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

import org.openapitools.client.models.SimpleUser
import org.openapitools.client.models.Team
import org.openapitools.client.models.TeamParent
import org.openapitools.client.models.TeamPermissions

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param name 
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
 * @param slug 
 * @param description 
 * @param permission 
 * @param membersUrl 
 * @param repositoriesUrl 
 * @param parent 
 * @param email 
 * @param starredAt 
 * @param privacy 
 * @param notificationSetting 
 * @param permissions 
 */
@Serializable

data class PendingDeploymentReviewersInnerReviewer (

    @Contextual @SerialName(value = "name")
    val name: kotlin.Any?,

    @Contextual @SerialName(value = "login")
    val login: kotlin.Any?,

    @Contextual @SerialName(value = "id")
    val id: kotlin.Any?,

    @Contextual @SerialName(value = "node_id")
    val nodeId: kotlin.Any?,

    @Contextual @SerialName(value = "avatar_url")
    val avatarUrl: kotlin.Any?,

    @Contextual @SerialName(value = "gravatar_id")
    val gravatarId: kotlin.Any?,

    @Contextual @SerialName(value = "url")
    val url: kotlin.Any?,

    @Contextual @SerialName(value = "html_url")
    val htmlUrl: kotlin.Any?,

    @Contextual @SerialName(value = "followers_url")
    val followersUrl: kotlin.Any?,

    @Contextual @SerialName(value = "following_url")
    val followingUrl: kotlin.Any?,

    @Contextual @SerialName(value = "gists_url")
    val gistsUrl: kotlin.Any?,

    @Contextual @SerialName(value = "starred_url")
    val starredUrl: kotlin.Any?,

    @Contextual @SerialName(value = "subscriptions_url")
    val subscriptionsUrl: kotlin.Any?,

    @Contextual @SerialName(value = "organizations_url")
    val organizationsUrl: kotlin.Any?,

    @Contextual @SerialName(value = "repos_url")
    val reposUrl: kotlin.Any?,

    @Contextual @SerialName(value = "events_url")
    val eventsUrl: kotlin.Any?,

    @Contextual @SerialName(value = "received_events_url")
    val receivedEventsUrl: kotlin.Any?,

    @Contextual @SerialName(value = "type")
    val type: kotlin.Any?,

    @Contextual @SerialName(value = "site_admin")
    val siteAdmin: kotlin.Any?,

    @Contextual @SerialName(value = "slug")
    val slug: kotlin.Any?,

    @Contextual @SerialName(value = "description")
    val description: kotlin.Any?,

    @Contextual @SerialName(value = "permission")
    val permission: kotlin.Any?,

    @Contextual @SerialName(value = "members_url")
    val membersUrl: kotlin.Any?,

    @Contextual @SerialName(value = "repositories_url")
    val repositoriesUrl: kotlin.Any?,

    @SerialName(value = "parent")
    val parent: TeamParent,

    @Contextual @SerialName(value = "email")
    val email: kotlin.Any? = null,

    @Contextual @SerialName(value = "starred_at")
    val starredAt: kotlin.Any? = null,

    @Contextual @SerialName(value = "privacy")
    val privacy: kotlin.Any? = null,

    @Contextual @SerialName(value = "notification_setting")
    val notificationSetting: kotlin.Any? = null,

    @SerialName(value = "permissions")
    val permissions: TeamPermissions? = null

)
