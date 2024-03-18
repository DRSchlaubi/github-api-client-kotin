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
 * @param permissions The permissions that the associated user will have on the repository. Valid values are `read`, `write`, `maintain`, `triage`, and `admin`.
 */
@Serializable

data class ReposUpdateInvitationRequest (

    /* The permissions that the associated user will have on the repository. Valid values are `read`, `write`, `maintain`, `triage`, and `admin`. */
    @SerialName(value = "permissions")
    val permissions: ReposUpdateInvitationRequest.Permissions? = null

) {

    /**
     * The permissions that the associated user will have on the repository. Valid values are `read`, `write`, `maintain`, `triage`, and `admin`.
     *
     * Values: read,write,maintain,triage,admin
     */
    @Serializable
    enum class Permissions(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write"),
        @SerialName(value = "maintain") maintain("maintain"),
        @SerialName(value = "triage") triage("triage"),
        @SerialName(value = "admin") admin("admin");
    }
}

