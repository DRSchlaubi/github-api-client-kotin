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


import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param inviteeId **Required unless you provide `email`**. GitHub user ID for the person you are inviting.
 * @param email **Required unless you provide `invitee_id`**. Email address of the person you are inviting, which can be an existing GitHub user.
 * @param role The role for the new member.   * `admin` - Organization owners with full administrative rights to the organization and complete access to all repositories and teams.    * `direct_member` - Non-owner organization members with ability to see other members and join teams by invitation.    * `billing_manager` - Non-owner organization members with ability to manage the billing settings of your organization.   * `reinstate` - The previous role assigned to the invitee before they were removed from your organization. Can be one of the roles listed above. Only works if the invitee was previously part of your organization.
 * @param teamIds Specify IDs for the teams you want to invite new members to.
 */
@Serializable

data class OrgsCreateInvitationRequest (

    /* **Required unless you provide `email`**. GitHub user ID for the person you are inviting. */
    @SerialName(value = "invitee_id")
    val inviteeId: kotlin.Int? = null,

    /* **Required unless you provide `invitee_id`**. Email address of the person you are inviting, which can be an existing GitHub user. */
    @SerialName(value = "email")
    val email: kotlin.String? = null,

    /* The role for the new member.   * `admin` - Organization owners with full administrative rights to the organization and complete access to all repositories and teams.    * `direct_member` - Non-owner organization members with ability to see other members and join teams by invitation.    * `billing_manager` - Non-owner organization members with ability to manage the billing settings of your organization.   * `reinstate` - The previous role assigned to the invitee before they were removed from your organization. Can be one of the roles listed above. Only works if the invitee was previously part of your organization. */
    @SerialName(value = "role")
    val role: OrgsCreateInvitationRequest.Role? = Role.direct_member,

    /* Specify IDs for the teams you want to invite new members to. */
    @SerialName(value = "team_ids")
    val teamIds: kotlin.collections.List<kotlin.Int>? = null

) {

    /**
     * The role for the new member.   * `admin` - Organization owners with full administrative rights to the organization and complete access to all repositories and teams.    * `direct_member` - Non-owner organization members with ability to see other members and join teams by invitation.    * `billing_manager` - Non-owner organization members with ability to manage the billing settings of your organization.   * `reinstate` - The previous role assigned to the invitee before they were removed from your organization. Can be one of the roles listed above. Only works if the invitee was previously part of your organization.
     *
     * Values: admin,direct_member,billing_manager,reinstate
     */
    @Serializable
    enum class Role(val value: kotlin.String) {
        @SerialName(value = "admin") admin("admin"),
        @SerialName(value = "direct_member") direct_member("direct_member"),
        @SerialName(value = "billing_manager") billing_manager("billing_manager"),
        @SerialName(value = "reinstate") reinstate("reinstate");
    }
}
