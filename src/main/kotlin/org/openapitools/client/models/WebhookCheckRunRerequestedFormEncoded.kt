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
 * The check_run.rerequested webhook encoded with URL encoding
 *
 * @param payload A URL-encoded string of the check_run.rerequested JSON payload. The decoded payload is a JSON object.
 */
@Serializable

data class WebhookCheckRunRerequestedFormEncoded (

    /* A URL-encoded string of the check_run.rerequested JSON payload. The decoded payload is a JSON object. */
    @SerialName(value = "payload")
    val payload: kotlin.String

)

