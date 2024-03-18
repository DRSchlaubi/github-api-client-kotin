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

import org.openapitools.client.models.IntegrationInstallationRequestAccount
import org.openapitools.client.models.SimpleUser

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * Request to install an integration on a target
 *
 * @param id Unique identifier of the request installation.
 * @param account 
 * @param requester 
 * @param createdAt 
 * @param nodeId 
 */
@Serializable

data class IntegrationInstallationRequest (

    /* Unique identifier of the request installation. */
    @SerialName(value = "id")
    val id: kotlin.Int,

    @SerialName(value = "account")
    val account: IntegrationInstallationRequestAccount,

    @SerialName(value = "requester")
    val requester: SimpleUser,

    @Contextual @SerialName(value = "created_at")
    val createdAt: kotlinx.datetime.Instant,

    @SerialName(value = "node_id")
    val nodeId: kotlin.String? = null

)

