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

import org.openapitools.client.models.WebhookMemberEditedChangesOldPermission
import org.openapitools.client.models.WebhookMemberEditedChangesPermission

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * The changes to the collaborator permissions
 *
 * @param oldPermission 
 * @param permission 
 */
@Serializable

data class WebhookMemberEditedChanges (

    @SerialName(value = "old_permission")
    val oldPermission: WebhookMemberEditedChangesOldPermission? = null,

    @SerialName(value = "permission")
    val permission: WebhookMemberEditedChangesPermission? = null

)
