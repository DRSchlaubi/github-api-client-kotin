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

import org.openapitools.client.models.EnterpriseWebhooks
import org.openapitools.client.models.Issue2
import org.openapitools.client.models.Label
import org.openapitools.client.models.OrganizationSimpleWebhooks
import org.openapitools.client.models.RepositoryWebhooks
import org.openapitools.client.models.SimpleInstallation
import org.openapitools.client.models.SimpleUserWebhooks
import org.openapitools.client.models.WebhookIssuesEditedChanges

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param action 
 * @param changes 
 * @param issue 
 * @param repository 
 * @param sender 
 * @param enterprise 
 * @param installation 
 * @param label 
 * @param organization 
 */
@Serializable

data class WebhookIssuesEdited (

    @SerialName(value = "action")
    val action: WebhookIssuesEdited.Action,

    @SerialName(value = "changes")
    val changes: WebhookIssuesEditedChanges,

    @SerialName(value = "issue")
    val issue: Issue2,

    @SerialName(value = "repository")
    val repository: RepositoryWebhooks,

    @SerialName(value = "sender")
    val sender: SimpleUserWebhooks,

    @SerialName(value = "enterprise")
    val enterprise: EnterpriseWebhooks? = null,

    @SerialName(value = "installation")
    val installation: SimpleInstallation? = null,

    @SerialName(value = "label")
    val label: Label? = null,

    @SerialName(value = "organization")
    val organization: OrganizationSimpleWebhooks? = null

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

