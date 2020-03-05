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

	@org.kie.api.definition.type.Label(value = "Release Name")
	private java.lang.String releaseName;

	@org.kie.api.definition.type.Label(value = "State Code")
	private java.lang.String state;

	@javax.persistence.ElementCollection(fetch = javax.persistence.FetchType.EAGER)
	@org.kie.api.definition.type.Label(value = "Role Name")
	private java.util.List<java.lang.String> roleName;

	@javax.persistence.ElementCollection(fetch = javax.persistence.FetchType.EAGER)
	@org.kie.api.definition.type.Label(value = "Permission Name")
	private java.util.List<java.lang.String> permissionName;

	@javax.persistence.ElementCollection(fetch = javax.persistence.FetchType.EAGER)
	@org.kie.api.definition.type.Label(value = "Labeler Code")
	private java.util.List<java.lang.String> ndc1_cd;

	@org.kie.api.definition.type.Label(value = "User ID")
	private int userId;

	public StrategyParameters() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getReleaseName() {
		return this.releaseName;
	}

	public void setReleaseName(java.lang.String releaseName) {
		this.releaseName = releaseName;
	}

	public java.lang.String getState() {
		return this.state;
	}

	public void setState(java.lang.String state) {
		this.state = state;
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

	public java.util.List<java.lang.String> getNdc1_cd() {
		return this.ndc1_cd;
	}

	public void setNdc1_cd(java.util.List<java.lang.String> ndc1_cd) {
		this.ndc1_cd = ndc1_cd;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public StrategyParameters(java.lang.Long id, java.lang.String releaseName,
			java.lang.String state, java.util.List<java.lang.String> roleName,
			java.util.List<java.lang.String> permissionName,
			java.util.List<java.lang.String> ndc1_cd, int userId) {
		this.id = id;
		this.releaseName = releaseName;
		this.state = state;
		this.roleName = roleName;
		this.permissionName = permissionName;
		this.ndc1_cd = ndc1_cd;
		this.userId = userId;
	}

}