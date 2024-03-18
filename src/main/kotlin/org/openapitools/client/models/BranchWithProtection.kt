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

import org.openapitools.client.models.BranchProtection
import org.openapitools.client.models.BranchWithProtectionLinks
import org.openapitools.client.models.Commit

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * Branch With Protection
 *
 * @param name 
 * @param commit 
 * @param links 
 * @param `protected` 
 * @param protection 
 * @param protectionUrl 
 * @param pattern 
 * @param requiredApprovingReviewCount 
 */
@Serializable

data class BranchWithProtection (

    @SerialName(value = "name")
    val name: kotlin.String,

    @SerialName(value = "commit")
    val commit: Commit,

    @SerialName(value = "_links")
    val links: BranchWithProtectionLinks,

    @SerialName(value = "protected")
    val `protected`: kotlin.Boolean,

    @SerialName(value = "protection")
    val protection: BranchProtection,

    @Contextual @SerialName(value = "protection_url")
    val protectionUrl: java.net.URI,

    @SerialName(value = "pattern")
    val pattern: kotlin.String? = null,

    @SerialName(value = "required_approving_review_count")
    val requiredApprovingReviewCount: kotlin.Int? = null

)
