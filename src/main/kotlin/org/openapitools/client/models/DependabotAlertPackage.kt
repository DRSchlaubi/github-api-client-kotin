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
 * Details for the vulnerable package.
 *
 * @param ecosystem The package's language or package management ecosystem.
 * @param name The unique package name within its ecosystem.
 */
@Serializable

data class DependabotAlertPackage (

    /* The package's language or package management ecosystem. */
    @SerialName(value = "ecosystem")
    val ecosystem: kotlin.String,

    /* The unique package name within its ecosystem. */
    @SerialName(value = "name")
    val name: kotlin.String

)

