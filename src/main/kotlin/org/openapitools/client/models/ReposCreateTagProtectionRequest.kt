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
 * @param pattern An optional glob pattern to match against when enforcing tag protection.
 */
@Serializable

data class ReposCreateTagProtectionRequest (

    /* An optional glob pattern to match against when enforcing tag protection. */
    @SerialName(value = "pattern")
    val pattern: kotlin.String

)
