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
import org.openapitools.client.models.TeamProjectPermissions

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * A team's access to a project.
 *
 * @param ownerUrl 
 * @param url 
 * @param htmlUrl 
 * @param columnsUrl 
 * @param id 
 * @param nodeId 
 * @param name 
 * @param body 
 * @param number 
 * @param state 
 * @param creator 
 * @param createdAt 
 * @param updatedAt 
 * @param permissions 
 * @param organizationPermission The organization permission for this project. Only present when owner is an organization.
 * @param `private` Whether the project is private or not. Only present when owner is an organization.
 */
@Serializable

data class TeamProject (

    @SerialName(value = "owner_url")
    val ownerUrl: kotlin.String,

    @SerialName(value = "url")
    val url: kotlin.String,

    @SerialName(value = "html_url")
    val htmlUrl: kotlin.String,

    @SerialName(value = "columns_url")
    val columnsUrl: kotlin.String,

    @SerialName(value = "id")
    val id: kotlin.Int,

    @SerialName(value = "node_id")
    val nodeId: kotlin.String,

    @SerialName(value = "name")
    val name: kotlin.String,

    @SerialName(value = "body")
    val body: kotlin.String?,

    @SerialName(value = "number")
    val number: kotlin.Int,

    @SerialName(value = "state")
    val state: kotlin.String,

    @SerialName(value = "creator")
    val creator: SimpleUser,

    @SerialName(value = "created_at")
    val createdAt: kotlin.String,

    @SerialName(value = "updated_at")
    val updatedAt: kotlin.String,

    @SerialName(value = "permissions")
    val permissions: TeamProjectPermissions,

    /* The organization permission for this project. Only present when owner is an organization. */
    @SerialName(value = "organization_permission")
    val organizationPermission: kotlin.String? = null,

    /* Whether the project is private or not. Only present when owner is an organization. */
    @SerialName(value = "private")
    val `private`: kotlin.Boolean? = null

)

