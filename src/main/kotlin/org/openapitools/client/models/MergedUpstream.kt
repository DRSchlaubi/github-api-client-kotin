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
 * Results of a successful merge upstream request
 *
 * @param message 
 * @param mergeType 
 * @param baseBranch 
 */
@Serializable

data class MergedUpstream (

    @SerialName(value = "message")
    val message: kotlin.String? = null,

    @SerialName(value = "merge_type")
    val mergeType: MergedUpstream.MergeType? = null,

    @SerialName(value = "base_branch")
    val baseBranch: kotlin.String? = null

) {

    /**
     * 
     *
     * Values: merge,fastMinusForward,none
     */
    @Serializable
    enum class MergeType(val value: kotlin.String) {
        @SerialName(value = "merge") merge("merge"),
        @SerialName(value = "fast-forward") fastMinusForward("fast-forward"),
        @SerialName(value = "none") none("none");
    }
}
