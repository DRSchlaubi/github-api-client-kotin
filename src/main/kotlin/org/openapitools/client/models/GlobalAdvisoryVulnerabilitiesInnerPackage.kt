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

import org.openapitools.client.models.SecurityAdvisoryEcosystems

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * The name of the package affected by the vulnerability.
 *
 * @param ecosystem 
 * @param name The unique package name within its ecosystem.
 */
@Serializable

data class GlobalAdvisoryVulnerabilitiesInnerPackage (

    @Contextual @SerialName(value = "ecosystem")
    val ecosystem: SecurityAdvisoryEcosystems,

    /* The unique package name within its ecosystem. */
    @SerialName(value = "name")
    val name: kotlin.String?

)

