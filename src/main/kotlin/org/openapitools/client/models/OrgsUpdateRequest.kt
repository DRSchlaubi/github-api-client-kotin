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
 * @param billingEmail Billing email address. This address is not publicized.
 * @param company The company name.
 * @param email The publicly visible email address.
 * @param twitterUsername The Twitter username of the company.
 * @param location The location.
 * @param name The shorthand name of the company.
 * @param description The description of the company.
 * @param hasOrganizationProjects Whether an organization can use organization projects.
 * @param hasRepositoryProjects Whether repositories that belong to the organization can use repository projects.
 * @param defaultRepositoryPermission Default permission level members have for organization repositories.
 * @param membersCanCreateRepositories Whether of non-admin organization members can create repositories. **Note:** A parameter can override this parameter. See `members_allowed_repository_creation_type` in this table for details.
 * @param membersCanCreateInternalRepositories Whether organization members can create internal repositories, which are visible to all enterprise members. You can only allow members to create internal repositories if your organization is associated with an enterprise account using GitHub Enterprise Cloud or GitHub Enterprise Server 2.20+. For more information, see \"[Restricting repository creation in your organization](https://docs.github.com/github/setting-up-and-managing-organizations-and-teams/restricting-repository-creation-in-your-organization)\" in the GitHub Help documentation.
 * @param membersCanCreatePrivateRepositories Whether organization members can create private repositories, which are visible to organization members with permission. For more information, see \"[Restricting repository creation in your organization](https://docs.github.com/github/setting-up-and-managing-organizations-and-teams/restricting-repository-creation-in-your-organization)\" in the GitHub Help documentation.
 * @param membersCanCreatePublicRepositories Whether organization members can create public repositories, which are visible to anyone. For more information, see \"[Restricting repository creation in your organization](https://docs.github.com/github/setting-up-and-managing-organizations-and-teams/restricting-repository-creation-in-your-organization)\" in the GitHub Help documentation.
 * @param membersAllowedRepositoryCreationType Specifies which types of repositories non-admin organization members can create. `private` is only available to repositories that are part of an organization on GitHub Enterprise Cloud.  **Note:** This parameter is deprecated and will be removed in the future. Its return value ignores internal repositories. Using this parameter overrides values set in `members_can_create_repositories`. See the parameter deprecation notice in the operation description for details.
 * @param membersCanCreatePages Whether organization members can create GitHub Pages sites. Existing published sites will not be impacted.
 * @param membersCanCreatePublicPages Whether organization members can create public GitHub Pages sites. Existing published sites will not be impacted.
 * @param membersCanCreatePrivatePages Whether organization members can create private GitHub Pages sites. Existing published sites will not be impacted.
 * @param membersCanForkPrivateRepositories Whether organization members can fork private organization repositories.
 * @param webCommitSignoffRequired Whether contributors to organization repositories are required to sign off on commits they make through GitHub's web interface.
 * @param blog 
 * @param advancedSecurityEnabledForNewRepositories Whether GitHub Advanced Security is automatically enabled for new repositories.  To use this parameter, you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see \"[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).\"  You can check which security and analysis features are currently enabled by using a `GET /orgs/{org}` request.
 * @param dependabotAlertsEnabledForNewRepositories Whether Dependabot alerts is automatically enabled for new repositories.  To use this parameter, you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see \"[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).\"  You can check which security and analysis features are currently enabled by using a `GET /orgs/{org}` request.
 * @param dependabotSecurityUpdatesEnabledForNewRepositories Whether Dependabot security updates is automatically enabled for new repositories.  To use this parameter, you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see \"[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).\"  You can check which security and analysis features are currently enabled by using a `GET /orgs/{org}` request.
 * @param dependencyGraphEnabledForNewRepositories Whether dependency graph is automatically enabled for new repositories.  To use this parameter, you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see \"[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).\"  You can check which security and analysis features are currently enabled by using a `GET /orgs/{org}` request.
 * @param secretScanningEnabledForNewRepositories Whether secret scanning is automatically enabled for new repositories.  To use this parameter, you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see \"[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).\"  You can check which security and analysis features are currently enabled by using a `GET /orgs/{org}` request.
 * @param secretScanningPushProtectionEnabledForNewRepositories Whether secret scanning push protection is automatically enabled for new repositories.  To use this parameter, you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see \"[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).\"  You can check which security and analysis features are currently enabled by using a `GET /orgs/{org}` request.
 * @param secretScanningPushProtectionCustomLinkEnabled Whether a custom link is shown to contributors who are blocked from pushing a secret by push protection.
 * @param secretScanningPushProtectionCustomLink If `secret_scanning_push_protection_custom_link_enabled` is true, the URL that will be displayed to contributors who are blocked from pushing a secret.
 */
@Serializable

data class OrgsUpdateRequest (

    /* Billing email address. This address is not publicized. */
    @SerialName(value = "billing_email")
    val billingEmail: kotlin.String? = null,

    /* The company name. */
    @SerialName(value = "company")
    val company: kotlin.String? = null,

    /* The publicly visible email address. */
    @SerialName(value = "email")
    val email: kotlin.String? = null,

    /* The Twitter username of the company. */
    @SerialName(value = "twitter_username")
    val twitterUsername: kotlin.String? = null,

    /* The location. */
    @SerialName(value = "location")
    val location: kotlin.String? = null,

    /* The shorthand name of the company. */
    @SerialName(value = "name")
    val name: kotlin.String? = null,

    /* The description of the company. */
    @SerialName(value = "description")
    val description: kotlin.String? = null,

    /* Whether an organization can use organization projects. */
    @SerialName(value = "has_organization_projects")
    val hasOrganizationProjects: kotlin.Boolean? = null,

    /* Whether repositories that belong to the organization can use repository projects. */
    @SerialName(value = "has_repository_projects")
    val hasRepositoryProjects: kotlin.Boolean? = null,

    /* Default permission level members have for organization repositories. */
    @SerialName(value = "default_repository_permission")
    val defaultRepositoryPermission: OrgsUpdateRequest.DefaultRepositoryPermission? = DefaultRepositoryPermission.read,

    /* Whether of non-admin organization members can create repositories. **Note:** A parameter can override this parameter. See `members_allowed_repository_creation_type` in this table for details. */
    @SerialName(value = "members_can_create_repositories")
    val membersCanCreateRepositories: kotlin.Boolean? = true,

    /* Whether organization members can create internal repositories, which are visible to all enterprise members. You can only allow members to create internal repositories if your organization is associated with an enterprise account using GitHub Enterprise Cloud or GitHub Enterprise Server 2.20+. For more information, see \"[Restricting repository creation in your organization](https://docs.github.com/github/setting-up-and-managing-organizations-and-teams/restricting-repository-creation-in-your-organization)\" in the GitHub Help documentation. */
    @SerialName(value = "members_can_create_internal_repositories")
    val membersCanCreateInternalRepositories: kotlin.Boolean? = null,

    /* Whether organization members can create private repositories, which are visible to organization members with permission. For more information, see \"[Restricting repository creation in your organization](https://docs.github.com/github/setting-up-and-managing-organizations-and-teams/restricting-repository-creation-in-your-organization)\" in the GitHub Help documentation. */
    @SerialName(value = "members_can_create_private_repositories")
    val membersCanCreatePrivateRepositories: kotlin.Boolean? = null,

    /* Whether organization members can create public repositories, which are visible to anyone. For more information, see \"[Restricting repository creation in your organization](https://docs.github.com/github/setting-up-and-managing-organizations-and-teams/restricting-repository-creation-in-your-organization)\" in the GitHub Help documentation. */
    @SerialName(value = "members_can_create_public_repositories")
    val membersCanCreatePublicRepositories: kotlin.Boolean? = null,

    /* Specifies which types of repositories non-admin organization members can create. `private` is only available to repositories that are part of an organization on GitHub Enterprise Cloud.  **Note:** This parameter is deprecated and will be removed in the future. Its return value ignores internal repositories. Using this parameter overrides values set in `members_can_create_repositories`. See the parameter deprecation notice in the operation description for details. */
    @SerialName(value = "members_allowed_repository_creation_type")
    val membersAllowedRepositoryCreationType: OrgsUpdateRequest.MembersAllowedRepositoryCreationType? = null,

    /* Whether organization members can create GitHub Pages sites. Existing published sites will not be impacted. */
    @SerialName(value = "members_can_create_pages")
    val membersCanCreatePages: kotlin.Boolean? = true,

    /* Whether organization members can create public GitHub Pages sites. Existing published sites will not be impacted. */
    @SerialName(value = "members_can_create_public_pages")
    val membersCanCreatePublicPages: kotlin.Boolean? = true,

    /* Whether organization members can create private GitHub Pages sites. Existing published sites will not be impacted. */
    @SerialName(value = "members_can_create_private_pages")
    val membersCanCreatePrivatePages: kotlin.Boolean? = true,

    /* Whether organization members can fork private organization repositories. */
    @SerialName(value = "members_can_fork_private_repositories")
    val membersCanForkPrivateRepositories: kotlin.Boolean? = false,

    /* Whether contributors to organization repositories are required to sign off on commits they make through GitHub's web interface. */
    @SerialName(value = "web_commit_signoff_required")
    val webCommitSignoffRequired: kotlin.Boolean? = false,

    @SerialName(value = "blog")
    val blog: kotlin.String? = null,

    /* Whether GitHub Advanced Security is automatically enabled for new repositories.  To use this parameter, you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see \"[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).\"  You can check which security and analysis features are currently enabled by using a `GET /orgs/{org}` request. */
    @SerialName(value = "advanced_security_enabled_for_new_repositories")
    val advancedSecurityEnabledForNewRepositories: kotlin.Boolean? = null,

    /* Whether Dependabot alerts is automatically enabled for new repositories.  To use this parameter, you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see \"[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).\"  You can check which security and analysis features are currently enabled by using a `GET /orgs/{org}` request. */
    @SerialName(value = "dependabot_alerts_enabled_for_new_repositories")
    val dependabotAlertsEnabledForNewRepositories: kotlin.Boolean? = null,

    /* Whether Dependabot security updates is automatically enabled for new repositories.  To use this parameter, you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see \"[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).\"  You can check which security and analysis features are currently enabled by using a `GET /orgs/{org}` request. */
    @SerialName(value = "dependabot_security_updates_enabled_for_new_repositories")
    val dependabotSecurityUpdatesEnabledForNewRepositories: kotlin.Boolean? = null,

    /* Whether dependency graph is automatically enabled for new repositories.  To use this parameter, you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see \"[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).\"  You can check which security and analysis features are currently enabled by using a `GET /orgs/{org}` request. */
    @SerialName(value = "dependency_graph_enabled_for_new_repositories")
    val dependencyGraphEnabledForNewRepositories: kotlin.Boolean? = null,

    /* Whether secret scanning is automatically enabled for new repositories.  To use this parameter, you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see \"[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).\"  You can check which security and analysis features are currently enabled by using a `GET /orgs/{org}` request. */
    @SerialName(value = "secret_scanning_enabled_for_new_repositories")
    val secretScanningEnabledForNewRepositories: kotlin.Boolean? = null,

    /* Whether secret scanning push protection is automatically enabled for new repositories.  To use this parameter, you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see \"[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).\"  You can check which security and analysis features are currently enabled by using a `GET /orgs/{org}` request. */
    @SerialName(value = "secret_scanning_push_protection_enabled_for_new_repositories")
    val secretScanningPushProtectionEnabledForNewRepositories: kotlin.Boolean? = null,

    /* Whether a custom link is shown to contributors who are blocked from pushing a secret by push protection. */
    @SerialName(value = "secret_scanning_push_protection_custom_link_enabled")
    val secretScanningPushProtectionCustomLinkEnabled: kotlin.Boolean? = null,

    /* If `secret_scanning_push_protection_custom_link_enabled` is true, the URL that will be displayed to contributors who are blocked from pushing a secret. */
    @SerialName(value = "secret_scanning_push_protection_custom_link")
    val secretScanningPushProtectionCustomLink: kotlin.String? = null

) {

    /**
     * Default permission level members have for organization repositories.
     *
     * Values: read,write,admin,none
     */
    @Serializable
    enum class DefaultRepositoryPermission(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write"),
        @SerialName(value = "admin") admin("admin"),
        @SerialName(value = "none") none("none");
    }
    /**
     * Specifies which types of repositories non-admin organization members can create. `private` is only available to repositories that are part of an organization on GitHub Enterprise Cloud.  **Note:** This parameter is deprecated and will be removed in the future. Its return value ignores internal repositories. Using this parameter overrides values set in `members_can_create_repositories`. See the parameter deprecation notice in the operation description for details.
     *
     * Values: all,`private`,none
     */
    @Serializable
    enum class MembersAllowedRepositoryCreationType(val value: kotlin.String) {
        @SerialName(value = "all") all("all"),
        @SerialName(value = "private") `private`("private"),
        @SerialName(value = "none") none("none");
    }
}

