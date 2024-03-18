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
 * Check Automated Security Fixes
 *
 * @param enabled Whether automated security fixes are enabled for the repository.
 * @param paused Whether automated security fixes are paused for the repository.
 */
@Serializable

data class CheckAutomatedSecurityFixes (

    /* Whether automated security fixes are enabled for the repository. */
    @SerialName(value = "enabled")
    val enabled: kotlin.Boolean,

    /* Whether automated security fixes are paused for the repository. */
    @SerialName(value = "paused")
    val paused: kotlin.Boolean

)

