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

import org.openapitools.client.models.User
import org.openapitools.client.models.WebhookPackagePublishedPackagePackageVersionDockerMetadataInner
import org.openapitools.client.models.WebhookPackageUpdatedPackagePackageVersionPackageFilesInner
import org.openapitools.client.models.WebhookPackageUpdatedPackagePackageVersionRelease
import org.openapitools.client.models.WebhookRubygemsMetadata

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param author 
 * @param body 
 * @param bodyHtml 
 * @param createdAt 
 * @param description 
 * @param htmlUrl 
 * @param id 
 * @param installationCommand 
 * @param metadata 
 * @param name 
 * @param packageFiles 
 * @param summary 
 * @param targetCommitish 
 * @param targetOid 
 * @param updatedAt 
 * @param version 
 * @param dockerMetadata 
 * @param draft 
 * @param manifest 
 * @param packageUrl 
 * @param prerelease 
 * @param release 
 * @param rubygemsMetadata 
 * @param sourceUrl 
 * @param tagName 
 */
@Serializable

data class WebhookPackageUpdatedPackagePackageVersion (

    @SerialName(value = "author")
    val author: User,

    @SerialName(value = "body")
    val body: kotlin.String,

    @SerialName(value = "body_html")
    val bodyHtml: kotlin.String,

    @SerialName(value = "created_at")
    val createdAt: kotlin.String,

    @SerialName(value = "description")
    val description: kotlin.String,

    @Contextual @SerialName(value = "html_url")
    val htmlUrl: java.net.URI,

    @SerialName(value = "id")
    val id: kotlin.Int,

    @SerialName(value = "installation_command")
    val installationCommand: kotlin.String,

    @SerialName(value = "metadata")
    val metadata: kotlin.collections.List<@Contextual kotlin.Any>,

    @SerialName(value = "name")
    val name: kotlin.String,

    @SerialName(value = "package_files")
    val packageFiles: kotlin.collections.List<WebhookPackageUpdatedPackagePackageVersionPackageFilesInner>,

    @SerialName(value = "summary")
    val summary: kotlin.String,

    @SerialName(value = "target_commitish")
    val targetCommitish: kotlin.String,

    @SerialName(value = "target_oid")
    val targetOid: kotlin.String,

    @SerialName(value = "updated_at")
    val updatedAt: kotlin.String,

    @SerialName(value = "version")
    val version: kotlin.String,

    @SerialName(value = "docker_metadata")
    val dockerMetadata: kotlin.collections.List<WebhookPackagePublishedPackagePackageVersionDockerMetadataInner>? = null,

    @SerialName(value = "draft")
    val draft: kotlin.Boolean? = null,

    @SerialName(value = "manifest")
    val manifest: kotlin.String? = null,

    @SerialName(value = "package_url")
    val packageUrl: kotlin.String? = null,

    @SerialName(value = "prerelease")
    val prerelease: kotlin.Boolean? = null,

    @SerialName(value = "release")
    val release: WebhookPackageUpdatedPackagePackageVersionRelease? = null,

    @SerialName(value = "rubygems_metadata")
    val rubygemsMetadata: kotlin.collections.List<WebhookRubygemsMetadata>? = null,

    @Contextual @SerialName(value = "source_url")
    val sourceUrl: java.net.URI? = null,

    @SerialName(value = "tag_name")
    val tagName: kotlin.String? = null

)

