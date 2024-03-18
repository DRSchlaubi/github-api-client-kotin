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

import org.openapitools.client.models.WebhookMemberEditedChangesPermission
import org.openapitools.client.models.WebhookProjectsV2ProjectEditedChangesPublic
import org.openapitools.client.models.WebhookProjectsV2ProjectEditedChangesTitle

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param description 
 * @param `public` 
 * @param shortDescription 
 * @param title 
 */
@Serializable

data class WebhookProjectsV2ProjectEditedChanges (

    @SerialName(value = "description")
    val description: WebhookMemberEditedChangesPermission? = null,

    @SerialName(value = "public")
    val `public`: WebhookProjectsV2ProjectEditedChangesPublic? = null,

    @SerialName(value = "short_description")
    val shortDescription: WebhookMemberEditedChangesPermission? = null,

    @SerialName(value = "title")
    val title: WebhookProjectsV2ProjectEditedChangesTitle? = null

)

