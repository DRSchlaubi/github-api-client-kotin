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
 * @param self 
 * @param git 
 * @param html 
 */
@Serializable

data class FileCommitContentLinks (

    @SerialName(value = "self")
    val self: kotlin.String? = null,

    @SerialName(value = "git")
    val git: kotlin.String? = null,

    @SerialName(value = "html")
    val html: kotlin.String? = null

)
