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
import org.openapitools.client.models.Issue5
import org.openapitools.client.models.OrganizationSimpleWebhooks
import org.openapitools.client.models.RepositoryWebhooks
import org.openapitools.client.models.SimpleInstallation
import org.openapitools.client.models.SimpleUserWebhooks
import org.openapitools.client.models.WebhookIssuesOpenedChanges

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param action 
 * @param issue 
 * @param repository 
 * @param sender 
 * @param changes 
 * @param enterprise 
 * @param installation 
 * @param organization 
 */
@Serializable

data class WebhookIssuesOpened (

    @SerialName(value = "action")
    val action: WebhookIssuesOpened.Action,

    @SerialName(value = "issue")
    val issue: Issue5,

    @SerialName(value = "repository")
    val repository: RepositoryWebhooks,

    @SerialName(value = "sender")
    val sender: SimpleUserWebhooks,

    @SerialName(value = "changes")
    val changes: WebhookIssuesOpenedChanges? = null,

    @SerialName(value = "enterprise")
    val enterprise: EnterpriseWebhooks? = null,

    @SerialName(value = "installation")
    val installation: SimpleInstallation? = null,

    @SerialName(value = "organization")
    val organization: OrganizationSimpleWebhooks? = null

) {

    /**
     * 
     *
     * Values: opened
     */
    @Serializable
    enum class Action(val value: kotlin.String) {
        @SerialName(value = "opened") opened("opened");
    }
}

