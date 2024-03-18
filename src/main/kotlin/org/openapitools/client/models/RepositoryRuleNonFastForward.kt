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
 * Prevent users with push access from force pushing to refs.
 *
 * @param type 
 */
@Serializable

data class RepositoryRuleNonFastForward (

    @SerialName(value = "type")
    val type: RepositoryRuleNonFastForward.Type

) {

    /**
     * 
     *
     * Values: non_fast_forward
     */
    @Serializable
    enum class Type(val value: kotlin.String) {
        @SerialName(value = "non_fast_forward") non_fast_forward("non_fast_forward");
    }
}
