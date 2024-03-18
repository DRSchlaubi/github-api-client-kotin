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

import org.openapitools.client.models.User1

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param reviewer 
 * @param type 
 */
@Serializable

data class WebhookDeploymentReviewRequestedReviewersInner (

    @SerialName(value = "reviewer")
    val reviewer: User1? = null,

    @SerialName(value = "type")
    val type: WebhookDeploymentReviewRequestedReviewersInner.Type? = null

) {

    /**
     * 
     *
     * Values: User,Team
     */
    @Serializable
    enum class Type(val value: kotlin.String) {
        @SerialName(value = "User") User("User"),
        @SerialName(value = "Team") Team("Team");
    }
}

