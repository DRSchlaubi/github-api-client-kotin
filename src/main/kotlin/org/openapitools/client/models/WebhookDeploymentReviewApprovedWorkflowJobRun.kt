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
 * @param conclusion 
 * @param createdAt 
 * @param environment 
 * @param htmlUrl 
 * @param id 
 * @param name 
 * @param status 
 * @param updatedAt 
 */
@Serializable

data class WebhookDeploymentReviewApprovedWorkflowJobRun (

    @Contextual @SerialName(value = "conclusion")
    val conclusion: kotlin.Any?,

    @SerialName(value = "created_at")
    val createdAt: kotlin.String,

    @SerialName(value = "environment")
    val environment: kotlin.String,

    @SerialName(value = "html_url")
    val htmlUrl: kotlin.String,

    @SerialName(value = "id")
    val id: kotlin.Int,

    @Contextual @SerialName(value = "name")
    val name: kotlin.Any?,

    @SerialName(value = "status")
    val status: kotlin.String,

    @SerialName(value = "updated_at")
    val updatedAt: kotlin.String

)

