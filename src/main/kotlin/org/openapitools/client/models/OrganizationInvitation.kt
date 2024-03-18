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

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * Organization Invitation
 *
 * @param id 
 * @param login 
 * @param email 
 * @param role 
 * @param createdAt 
 * @param inviter 
 * @param teamCount 
 * @param nodeId 
 * @param invitationTeamsUrl 
 * @param failedAt 
 * @param failedReason 
 * @param invitationSource 
 */
@Serializable

data class OrganizationInvitation (

    @SerialName(value = "id")
    val id: kotlin.Int,

    @SerialName(value = "login")
    val login: kotlin.String?,

    @SerialName(value = "email")
    val email: kotlin.String?,

    @SerialName(value = "role")
    val role: kotlin.String,

    @SerialName(value = "created_at")
    val createdAt: kotlin.String,

    @SerialName(value = "inviter")
    val inviter: SimpleUser,

    @SerialName(value = "team_count")
    val teamCount: kotlin.Int,

    @SerialName(value = "node_id")
    val nodeId: kotlin.String,

    @SerialName(value = "invitation_teams_url")
    val invitationTeamsUrl: kotlin.String,

    @SerialName(value = "failed_at")
    val failedAt: kotlin.String? = null,

    @SerialName(value = "failed_reason")
    val failedReason: kotlin.String? = null,

    @SerialName(value = "invitation_source")
    val invitationSource: kotlin.String? = null

)
