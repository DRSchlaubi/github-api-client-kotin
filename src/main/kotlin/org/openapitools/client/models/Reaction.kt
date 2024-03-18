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

import org.openapitools.client.models.IntegrationOwner

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * Reactions to conversations provide a way to help people express their feelings more simply and effectively.
 *
 * @param id 
 * @param nodeId 
 * @param user 
 * @param content The reaction to use
 * @param createdAt 
 */
@Serializable

data class Reaction (

    @SerialName(value = "id")
    val id: kotlin.Int,

    @SerialName(value = "node_id")
    val nodeId: kotlin.String,

    @SerialName(value = "user")
    val user: IntegrationOwner,

    /* The reaction to use */
    @SerialName(value = "content")
    val content: Reaction.Content,

    @Contextual @SerialName(value = "created_at")
    val createdAt: kotlinx.datetime.Instant

) {

    /**
     * The reaction to use
     *
     * Values: Plus1,Minus1,laugh,confused,heart,hooray,rocket,eyes
     */
    @Serializable
    enum class Content(val value: kotlin.String) {
        @SerialName(value = "+1") Plus1("+1"),
        @SerialName(value = "-1") Minus1("-1"),
        @SerialName(value = "laugh") laugh("laugh"),
        @SerialName(value = "confused") confused("confused"),
        @SerialName(value = "heart") heart("heart"),
        @SerialName(value = "hooray") hooray("hooray"),
        @SerialName(value = "rocket") rocket("rocket"),
        @SerialName(value = "eyes") eyes("eyes");
    }
}
