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
 * @param accessToken The OAuth access token used to authenticate to the GitHub API.
 */
@Serializable

data class AppsDeleteAuthorizationRequest (

    /* The OAuth access token used to authenticate to the GitHub API. */
    @SerialName(value = "access_token")
    val accessToken: kotlin.String

)

