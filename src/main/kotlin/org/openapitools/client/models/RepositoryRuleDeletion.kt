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
 * Only allow users with bypass permissions to delete matching refs.
 *
 * @param type 
 */
@Serializable

data class RepositoryRuleDeletion (

    @SerialName(value = "type")
    val type: RepositoryRuleDeletion.Type

) {

    /**
     * 
     *
     * Values: deletion
     */
    @Serializable
    enum class Type(val value: kotlin.String) {
        @SerialName(value = "deletion") deletion("deletion");
    }
}

