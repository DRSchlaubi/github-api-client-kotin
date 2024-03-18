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

import org.openapitools.client.models.WebhookSecurityAdvisoryPublishedSecurityAdvisoryCvss
import org.openapitools.client.models.WebhookSecurityAdvisoryPublishedSecurityAdvisoryCwesInner
import org.openapitools.client.models.WebhookSecurityAdvisoryPublishedSecurityAdvisoryIdentifiersInner
import org.openapitools.client.models.WebhookSecurityAdvisoryPublishedSecurityAdvisoryReferencesInner
import org.openapitools.client.models.WebhookSecurityAdvisoryPublishedSecurityAdvisoryVulnerabilitiesInner

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * The details of the security advisory, including summary, description, and severity.
 *
 * @param cvss 
 * @param cwes 
 * @param description 
 * @param ghsaId 
 * @param identifiers 
 * @param publishedAt 
 * @param references 
 * @param severity 
 * @param summary 
 * @param updatedAt 
 * @param vulnerabilities 
 * @param withdrawnAt 
 */
@Serializable

data class WebhookSecurityAdvisoryPublishedSecurityAdvisory (

    @SerialName(value = "cvss")
    val cvss: WebhookSecurityAdvisoryPublishedSecurityAdvisoryCvss,

    @SerialName(value = "cwes")
    val cwes: kotlin.collections.List<WebhookSecurityAdvisoryPublishedSecurityAdvisoryCwesInner>,

    @SerialName(value = "description")
    val description: kotlin.String,

    @SerialName(value = "ghsa_id")
    val ghsaId: kotlin.String,

    @SerialName(value = "identifiers")
    val identifiers: kotlin.collections.List<WebhookSecurityAdvisoryPublishedSecurityAdvisoryIdentifiersInner>,

    @SerialName(value = "published_at")
    val publishedAt: kotlin.String,

    @SerialName(value = "references")
    val references: kotlin.collections.List<WebhookSecurityAdvisoryPublishedSecurityAdvisoryReferencesInner>,

    @SerialName(value = "severity")
    val severity: kotlin.String,

    @SerialName(value = "summary")
    val summary: kotlin.String,

    @SerialName(value = "updated_at")
    val updatedAt: kotlin.String,

    @SerialName(value = "vulnerabilities")
    val vulnerabilities: kotlin.collections.List<WebhookSecurityAdvisoryPublishedSecurityAdvisoryVulnerabilitiesInner>,

    @SerialName(value = "withdrawn_at")
    val withdrawnAt: kotlin.String?

)

