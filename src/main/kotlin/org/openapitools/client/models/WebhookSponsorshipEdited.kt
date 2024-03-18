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
import org.openapitools.client.models.OrganizationSimpleWebhooks
import org.openapitools.client.models.RepositoryWebhooks
import org.openapitools.client.models.SimpleInstallation
import org.openapitools.client.models.SimpleUserWebhooks
import org.openapitools.client.models.WebhookSponsorshipCancelledSponsorship
import org.openapitools.client.models.WebhookSponsorshipEditedChanges

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param action 
 * @param changes 
 * @param sender 
 * @param sponsorship 
 * @param enterprise 
 * @param installation 
 * @param organization 
 * @param repository 
 */
@Serializable

data class WebhookSponsorshipEdited (

    @SerialName(value = "action")
    val action: WebhookSponsorshipEdited.Action,

    @SerialName(value = "changes")
    val changes: WebhookSponsorshipEditedChanges,

    @SerialName(value = "sender")
    val sender: SimpleUserWebhooks,

    @SerialName(value = "sponsorship")
    val sponsorship: WebhookSponsorshipCancelledSponsorship,

    @SerialName(value = "enterprise")
    val enterprise: EnterpriseWebhooks? = null,

    @SerialName(value = "installation")
    val installation: SimpleInstallation? = null,

    @SerialName(value = "organization")
    val organization: OrganizationSimpleWebhooks? = null,

    @SerialName(value = "repository")
    val repository: RepositoryWebhooks? = null

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

