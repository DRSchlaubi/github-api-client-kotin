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

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * Project Collaborator Permission
 *
 * @param permission 
 * @param user 
 */
@Serializable

data class ProjectCollaboratorPermission (

    @SerialName(value = "permission")
    val permission: kotlin.String,

    @SerialName(value = "user")
    val user: IntegrationOwner

)

