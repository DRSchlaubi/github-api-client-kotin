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
import org.openapitools.client.models.Team
import org.openapitools.client.models.User

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param action 
 * @param member 
 * @param organization 
 * @param scope The scope of the membership. Currently, can only be `team`.
 * @param sender 
 * @param team 
 * @param enterprise 
 * @param installation 
 * @param repository 
 */
@Serializable

data class WebhookMembershipAdded (

    @SerialName(value = "action")
    val action: WebhookMembershipAdded.Action,

    @SerialName(value = "member")
    val member: User,

    @SerialName(value = "organization")
    val organization: OrganizationSimpleWebhooks,

    /* The scope of the membership. Currently, can only be `team`. */
    @SerialName(value = "scope")
    val scope: WebhookMembershipAdded.Scope,

    @SerialName(value = "sender")
    val sender: User,

    @SerialName(value = "team")
    val team: Team,

    @SerialName(value = "enterprise")
    val enterprise: EnterpriseWebhooks? = null,

    @SerialName(value = "installation")
    val installation: SimpleInstallation? = null,

    @SerialName(value = "repository")
    val repository: RepositoryWebhooks? = null

) {

    /**
     * 
     *
     * Values: added
     */
    @Serializable
    enum class Action(val value: kotlin.String) {
        @SerialName(value = "added") added("added");
    }
    /**
     * The scope of the membership. Currently, can only be `team`.
     *
     * Values: team
     */
    @Serializable
    enum class Scope(val value: kotlin.String) {
        @SerialName(value = "team") team("team");
    }
}

