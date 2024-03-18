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
import org.openapitools.client.models.SimpleInstallation
import org.openapitools.client.models.SimpleUserWebhooks
import org.openapitools.client.models.WebhookMetaDeletedHook
import org.openapitools.client.models.WebhookMetaDeletedRepository

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param action 
 * @param hook 
 * @param hookId The id of the modified webhook.
 * @param enterprise 
 * @param installation 
 * @param organization 
 * @param repository 
 * @param sender 
 */
@Serializable

data class WebhookMetaDeleted (

    @SerialName(value = "action")
    val action: WebhookMetaDeleted.Action,

    @SerialName(value = "hook")
    val hook: WebhookMetaDeletedHook,

    /* The id of the modified webhook. */
    @SerialName(value = "hook_id")
    val hookId: kotlin.Int,

    @SerialName(value = "enterprise")
    val enterprise: EnterpriseWebhooks? = null,

    @SerialName(value = "installation")
    val installation: SimpleInstallation? = null,

    @SerialName(value = "organization")
    val organization: OrganizationSimpleWebhooks? = null,

    @SerialName(value = "repository")
    val repository: WebhookMetaDeletedRepository? = null,

    @SerialName(value = "sender")
    val sender: SimpleUserWebhooks? = null

) {

    /**
     * 
     *
     * Values: deleted
     */
    @Serializable
    enum class Action(val value: kotlin.String) {
        @SerialName(value = "deleted") deleted("deleted");
    }
}
