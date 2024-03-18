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

import org.openapitools.client.models.OrganizationSimpleWebhooks
import org.openapitools.client.models.ProjectsV2
import org.openapitools.client.models.SimpleInstallation
import org.openapitools.client.models.SimpleUserWebhooks
import org.openapitools.client.models.WebhookProjectsV2ProjectEditedChanges

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param action 
 * @param changes 
 * @param organization 
 * @param projectsV2 
 * @param sender 
 * @param installation 
 */
@Serializable

data class WebhookProjectsV2ProjectEdited (

    @SerialName(value = "action")
    val action: WebhookProjectsV2ProjectEdited.Action,

    @SerialName(value = "changes")
    val changes: WebhookProjectsV2ProjectEditedChanges,

    @SerialName(value = "organization")
    val organization: OrganizationSimpleWebhooks,

    @SerialName(value = "projects_v2")
    val projectsV2: ProjectsV2,

    @SerialName(value = "sender")
    val sender: SimpleUserWebhooks,

    @SerialName(value = "installation")
    val installation: SimpleInstallation? = null

) {

    /**
     * 
     *
     * Values: edited
     */
    @Serializable
    enum class Action(val value: kotlin.String) {
        @SerialName(value = "edited") edited("edited");
    }
}

