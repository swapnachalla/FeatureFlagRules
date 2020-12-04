package com.myspace.mdp_rules;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class StrategyParameters implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "STRATEGYPARAMETERS_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(sequenceName = "STRATEGYPARAMETERS_ID_SEQ", name = "STRATEGYPARAMETERS_ID_GENERATOR")
	private java.lang.Long id;

	@org.kie.api.definition.type.Label("Role Name")
	@javax.persistence.ElementCollection(fetch = javax.persistence.FetchType.EAGER)
	private java.util.List<java.lang.String> roleName;

	@org.kie.api.definition.type.Label("Permission Name")
	@javax.persistence.ElementCollection(fetch = javax.persistence.FetchType.EAGER)
	private java.util.List<java.lang.String> permissionName;

	@org.kie.api.definition.type.Label("State Code")
	@javax.persistence.ElementCollection(fetch = javax.persistence.FetchType.EAGER)
	private java.util.List<java.lang.String> state;

	@org.kie.api.definition.type.Label("Release Name")
	@javax.persistence.ElementCollection(fetch = javax.persistence.FetchType.EAGER)
	private java.util.List<java.lang.String> releaseName;

	@org.kie.api.definition.type.Label("User ID")
	@javax.persistence.ElementCollection(fetch = javax.persistence.FetchType.EAGER)
	private java.util.List<java.lang.String> userId;

	@javax.persistence.ElementCollection(fetch = javax.persistence.FetchType.EAGER)
	@org.kie.api.definition.type.Label(value = "User Group")
	private java.util.List<java.lang.String> usergroup;

	public StrategyParameters() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.util.List<java.lang.String> getRoleName() {
		return this.roleName;
	}

	public void setRoleName(java.util.List<java.lang.String> roleName) {
		this.roleName = roleName;
	}

	public java.util.List<java.lang.String> getPermissionName() {
		return this.permissionName;
	}

	public void setPermissionName(
			java.util.List<java.lang.String> permissionName) {
		this.permissionName = permissionName;
	}

	public java.util.List<java.lang.String> getState() {
		return this.state;
	}

	public void setState(java.util.List<java.lang.String> state) {
		this.state = state;
	}

	public java.util.List<java.lang.String> getReleaseName() {
		return this.releaseName;
	}

	public void setReleaseName(java.util.List<java.lang.String> releaseName) {
		this.releaseName = releaseName;
	}

	public java.util.List<java.lang.String> getUserId() {
		return this.userId;
	}

	public void setUserId(java.util.List<java.lang.String> userId) {
		this.userId = userId;
	}

	public java.util.List<java.lang.String> getUsergroup() {
		return this.usergroup;
	}

	public void setUsergroup(java.util.List<java.lang.String> usergroup) {
		this.usergroup = usergroup;
	}

	public StrategyParameters(java.lang.Long id,
			java.util.List<java.lang.String> roleName,
			java.util.List<java.lang.String> permissionName,
			java.util.List<java.lang.String> state,
			java.util.List<java.lang.String> releaseName,
			java.util.List<java.lang.String> userId,
			java.util.List<java.lang.String> usergroup) {
		this.id = id;
		this.roleName = roleName;
		this.permissionName = permissionName;
		this.state = state;
		this.releaseName = releaseName;
		this.userId = userId;
		this.usergroup = usergroup;
	}

}
