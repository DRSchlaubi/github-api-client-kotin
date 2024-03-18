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

import org.openapitools.client.models.WebhookRegistryPackagePublishedRegistryPackageOwner

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param author 
 * @param createdAt 
 * @param draft 
 * @param htmlUrl 
 * @param id 
 * @param name 
 * @param prerelease 
 * @param publishedAt 
 * @param tagName 
 * @param targetCommitish 
 * @param url 
 */
@Serializable

data class WebhookRegistryPackageUpdatedRegistryPackagePackageVersionRelease (

    @SerialName(value = "author")
    val author: WebhookRegistryPackagePublishedRegistryPackageOwner,

    @SerialName(value = "created_at")
    val createdAt: kotlin.String,

    @SerialName(value = "draft")
    val draft: kotlin.Boolean,

    @SerialName(value = "html_url")
    val htmlUrl: kotlin.String,

    @SerialName(value = "id")
    val id: kotlin.Int,

    @SerialName(value = "name")
    val name: kotlin.String,

    @SerialName(value = "prerelease")
    val prerelease: kotlin.Boolean,

    @SerialName(value = "published_at")
    val publishedAt: kotlin.String,

    @SerialName(value = "tag_name")
    val tagName: kotlin.String,

    @SerialName(value = "target_commitish")
    val targetCommitish: kotlin.String,

    @SerialName(value = "url")
    val url: kotlin.String

)

