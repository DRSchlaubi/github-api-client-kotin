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

import org.openapitools.client.models.CodeSearchResultItem

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param totalCount 
 * @param incompleteResults 
 * @param items 
 */
@Serializable

data class SearchCode200Response (

    @SerialName(value = "total_count")
    val totalCount: kotlin.Int,

    @SerialName(value = "incomplete_results")
    val incompleteResults: kotlin.Boolean,

    @SerialName(value = "items")
    val items: kotlin.collections.List<CodeSearchResultItem>

)

