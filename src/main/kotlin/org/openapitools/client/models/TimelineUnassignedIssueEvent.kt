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

import org.openapitools.client.models.IssuePerformedViaGithubApp
import org.openapitools.client.models.SimpleUser

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * Timeline Unassigned Issue Event
 *
 * @param id 
 * @param nodeId 
 * @param url 
 * @param actor 
 * @param event 
 * @param commitId 
 * @param commitUrl 
 * @param createdAt 
 * @param performedViaGithubApp 
 * @param assignee 
 */
@Serializable

data class TimelineUnassignedIssueEvent (

    @SerialName(value = "id")
    val id: kotlin.Int,

    @SerialName(value = "node_id")
    val nodeId: kotlin.String,

    @SerialName(value = "url")
    val url: kotlin.String,

    @SerialName(value = "actor")
    val actor: SimpleUser,

    @SerialName(value = "event")
    val event: kotlin.String,

    @SerialName(value = "commit_id")
    val commitId: kotlin.String?,

    @SerialName(value = "commit_url")
    val commitUrl: kotlin.String?,

    @SerialName(value = "created_at")
    val createdAt: kotlin.String,

    @SerialName(value = "performed_via_github_app")
    val performedViaGithubApp: IssuePerformedViaGithubApp,

    @SerialName(value = "assignee")
    val assignee: SimpleUser

)

