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

import org.openapitools.client.models.WebhookConfigInsecureSsl

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param url The URL to which the payloads will be delivered.
 * @param contentType The media type used to serialize the payloads. Supported values include `json` and `form`. The default is `form`.
 * @param secret If provided, the `secret` will be used as the `key` to generate the HMAC hex digest value for [delivery signature headers](https://docs.github.com/webhooks/event-payloads/#delivery-headers).
 * @param insecureSsl 
 */
@Serializable

data class ReposUpdateWebhookConfigForRepoRequest (

    /* The URL to which the payloads will be delivered. */
    @Contextual @SerialName(value = "url")
    val url: java.net.URI? = null,

    /* The media type used to serialize the payloads. Supported values include `json` and `form`. The default is `form`. */
    @SerialName(value = "content_type")
    val contentType: kotlin.String? = null,

    /* If provided, the `secret` will be used as the `key` to generate the HMAC hex digest value for [delivery signature headers](https://docs.github.com/webhooks/event-payloads/#delivery-headers). */
    @SerialName(value = "secret")
    val secret: kotlin.String? = null,

    @SerialName(value = "insecure_ssl")
    val insecureSsl: WebhookConfigInsecureSsl? = null

)

