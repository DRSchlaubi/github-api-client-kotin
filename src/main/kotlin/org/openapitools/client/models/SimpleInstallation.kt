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
 * The GitHub App installation. Webhook payloads contain the `installation` property when the event is configured for and sent to a GitHub App. For more information, see \"[Using webhooks with GitHub Apps](https://docs.github.com/apps/creating-github-apps/registering-a-github-app/using-webhooks-with-github-apps).\"
 *
 * @param id The ID of the installation.
 * @param nodeId The global node ID of the installation.
 */
@Serializable

data class SimpleInstallation (

    /* The ID of the installation. */
    @SerialName(value = "id")
    val id: kotlin.Int,

    /* The global node ID of the installation. */
    @SerialName(value = "node_id")
    val nodeId: kotlin.String

)

