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
 * The set of permissions for the GitHub app
 *
 * @param actions 
 * @param administration 
 * @param checks 
 * @param contentReferences 
 * @param contents 
 * @param deployments 
 * @param discussions 
 * @param emails 
 * @param environments 
 * @param issues 
 * @param propertyKeys 
 * @param members 
 * @param metadata 
 * @param organizationAdministration 
 * @param organizationHooks 
 * @param organizationPackages 
 * @param organizationPlan 
 * @param organizationProjects 
 * @param organizationSecrets 
 * @param organizationSelfHostedRunners 
 * @param organizationUserBlocking 
 * @param packages 
 * @param pages 
 * @param pullRequests 
 * @param repositoryHooks 
 * @param repositoryProjects 
 * @param secretScanningAlerts 
 * @param secrets 
 * @param securityEvents 
 * @param securityScanningAlert 
 * @param singleFile 
 * @param statuses 
 * @param teamDiscussions 
 * @param vulnerabilityAlerts 
 * @param workflows 
 */
@Serializable

data class App3Permissions (

    @SerialName(value = "actions")
    val actions: App3Permissions.Actions? = null,

    @SerialName(value = "administration")
    val administration: App3Permissions.Administration? = null,

    @SerialName(value = "checks")
    val checks: App3Permissions.Checks? = null,

    @SerialName(value = "content_references")
    val contentReferences: App3Permissions.ContentReferences? = null,

    @SerialName(value = "contents")
    val contents: App3Permissions.Contents? = null,

    @SerialName(value = "deployments")
    val deployments: App3Permissions.Deployments? = null,

    @SerialName(value = "discussions")
    val discussions: App3Permissions.Discussions? = null,

    @SerialName(value = "emails")
    val emails: App3Permissions.Emails? = null,

    @SerialName(value = "environments")
    val environments: App3Permissions.Environments? = null,

    @SerialName(value = "issues")
    val issues: App3Permissions.Issues? = null,

    @SerialName(value = "keys")
    val propertyKeys: App3Permissions.PropertyKeys? = null,

    @SerialName(value = "members")
    val members: App3Permissions.Members? = null,

    @SerialName(value = "metadata")
    val metadata: App3Permissions.Metadata? = null,

    @SerialName(value = "organization_administration")
    val organizationAdministration: App3Permissions.OrganizationAdministration? = null,

    @SerialName(value = "organization_hooks")
    val organizationHooks: App3Permissions.OrganizationHooks? = null,

    @SerialName(value = "organization_packages")
    val organizationPackages: App3Permissions.OrganizationPackages? = null,

    @SerialName(value = "organization_plan")
    val organizationPlan: App3Permissions.OrganizationPlan? = null,

    @SerialName(value = "organization_projects")
    val organizationProjects: App3Permissions.OrganizationProjects? = null,

    @SerialName(value = "organization_secrets")
    val organizationSecrets: App3Permissions.OrganizationSecrets? = null,

    @SerialName(value = "organization_self_hosted_runners")
    val organizationSelfHostedRunners: App3Permissions.OrganizationSelfHostedRunners? = null,

    @SerialName(value = "organization_user_blocking")
    val organizationUserBlocking: App3Permissions.OrganizationUserBlocking? = null,

    @SerialName(value = "packages")
    val packages: App3Permissions.Packages? = null,

    @SerialName(value = "pages")
    val pages: App3Permissions.Pages? = null,

    @SerialName(value = "pull_requests")
    val pullRequests: App3Permissions.PullRequests? = null,

    @SerialName(value = "repository_hooks")
    val repositoryHooks: App3Permissions.RepositoryHooks? = null,

    @SerialName(value = "repository_projects")
    val repositoryProjects: App3Permissions.RepositoryProjects? = null,

    @SerialName(value = "secret_scanning_alerts")
    val secretScanningAlerts: App3Permissions.SecretScanningAlerts? = null,

    @SerialName(value = "secrets")
    val secrets: App3Permissions.Secrets? = null,

    @SerialName(value = "security_events")
    val securityEvents: App3Permissions.SecurityEvents? = null,

    @SerialName(value = "security_scanning_alert")
    val securityScanningAlert: App3Permissions.SecurityScanningAlert? = null,

    @SerialName(value = "single_file")
    val singleFile: App3Permissions.SingleFile? = null,

    @SerialName(value = "statuses")
    val statuses: App3Permissions.Statuses? = null,

    @SerialName(value = "team_discussions")
    val teamDiscussions: App3Permissions.TeamDiscussions? = null,

    @SerialName(value = "vulnerability_alerts")
    val vulnerabilityAlerts: App3Permissions.VulnerabilityAlerts? = null,

    @SerialName(value = "workflows")
    val workflows: App3Permissions.Workflows? = null

) {

    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class Actions(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class Administration(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class Checks(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class ContentReferences(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class Contents(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class Deployments(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class Discussions(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class Emails(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class Environments(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class Issues(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class PropertyKeys(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class Members(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class Metadata(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class OrganizationAdministration(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class OrganizationHooks(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class OrganizationPackages(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class OrganizationPlan(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class OrganizationProjects(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class OrganizationSecrets(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class OrganizationSelfHostedRunners(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class OrganizationUserBlocking(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class Packages(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class Pages(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class PullRequests(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class RepositoryHooks(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class RepositoryProjects(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class SecretScanningAlerts(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class Secrets(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class SecurityEvents(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class SecurityScanningAlert(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class SingleFile(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class Statuses(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class TeamDiscussions(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class VulnerabilityAlerts(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class Workflows(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
}

