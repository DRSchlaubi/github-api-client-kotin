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
 * The object used to create GitHub Pages deployment
 *
 * @param pagesBuildVersion A unique string that represents the version of the build for this deployment.
 * @param oidcToken The OIDC token issued by GitHub Actions certifying the origin of the deployment.
 * @param artifactId The ID of an artifact that contains the .zip or .tar of static assets to deploy. The artifact belongs to the repository. Either `artifact_id` or `artifact_url` are required.
 * @param artifactUrl The URL of an artifact that contains the .zip or .tar of static assets to deploy. The artifact belongs to the repository. Either `artifact_id` or `artifact_url` are required.
 * @param environment The target environment for this GitHub Pages deployment.
 */
@Serializable

data class ReposCreatePagesDeploymentRequest (

    /* A unique string that represents the version of the build for this deployment. */
    @SerialName(value = "pages_build_version")
    val pagesBuildVersion: kotlin.String = "GITHUB_SHA",

    /* The OIDC token issued by GitHub Actions certifying the origin of the deployment. */
    @SerialName(value = "oidc_token")
    val oidcToken: kotlin.String,

    /* The ID of an artifact that contains the .zip or .tar of static assets to deploy. The artifact belongs to the repository. Either `artifact_id` or `artifact_url` are required. */
    @Contextual @SerialName(value = "artifact_id")
    val artifactId: java.math.BigDecimal? = null,

    /* The URL of an artifact that contains the .zip or .tar of static assets to deploy. The artifact belongs to the repository. Either `artifact_id` or `artifact_url` are required. */
    @SerialName(value = "artifact_url")
    val artifactUrl: kotlin.String? = null,

    /* The target environment for this GitHub Pages deployment. */
    @SerialName(value = "environment")
    val environment: kotlin.String? = "github-pages"

)

