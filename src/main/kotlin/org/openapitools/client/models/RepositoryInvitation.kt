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

import org.openapitools.client.models.IntegrationOwner
import org.openapitools.client.models.MinimalRepository

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * Repository invitations let you manage who you collaborate with.
 *
 * @param id Unique identifier of the repository invitation.
 * @param repository 
 * @param invitee 
 * @param inviter 
 * @param permissions The permission associated with the invitation.
 * @param createdAt 
 * @param url URL for the repository invitation
 * @param htmlUrl 
 * @param nodeId 
 * @param expired Whether or not the invitation has expired
 */
@Serializable

data class RepositoryInvitation (

    /* Unique identifier of the repository invitation. */
    @SerialName(value = "id")
    val id: kotlin.Int,

    @SerialName(value = "repository")
    val repository: MinimalRepository,

    @SerialName(value = "invitee")
    val invitee: IntegrationOwner,

    @SerialName(value = "inviter")
    val inviter: IntegrationOwner,

    /* The permission associated with the invitation. */
    @SerialName(value = "permissions")
    val permissions: RepositoryInvitation.Permissions,

    @Contextual @SerialName(value = "created_at")
    val createdAt: kotlinx.datetime.Instant,

    /* URL for the repository invitation */
    @SerialName(value = "url")
    val url: kotlin.String,

    @SerialName(value = "html_url")
    val htmlUrl: kotlin.String,

    @SerialName(value = "node_id")
    val nodeId: kotlin.String,

    /* Whether or not the invitation has expired */
    @SerialName(value = "expired")
    val expired: kotlin.Boolean? = null

) {

    /**
     * The permission associated with the invitation.
     *
     * Values: read,write,admin,triage,maintain
     */
    @Serializable
    enum class Permissions(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write"),
        @SerialName(value = "admin") admin("admin"),
        @SerialName(value = "triage") triage("triage"),
        @SerialName(value = "maintain") maintain("maintain");
    }
}

