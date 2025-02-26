
package com.unblu.webapi.model.v4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * &lt;p&gt;This type is in preview mode.&lt;/p&gt;Model of a person visibility rule.
 */
@ApiModel(description = "<p>This type is in preview mode.</p>Model of a person visibility rule.")

@JsonPropertyOrder({
	PersonVisibilityRuleData.JSON_PROPERTY_$_TYPE,
	PersonVisibilityRuleData.JSON_PROPERTY_ID,
	PersonVisibilityRuleData.JSON_PROPERTY_ACCOUNT_ID,
	PersonVisibilityRuleData.JSON_PROPERTY_NAME,
	PersonVisibilityRuleData.JSON_PROPERTY_ENABLED,
	PersonVisibilityRuleData.JSON_PROPERTY_DESCRIPTION,
	PersonVisibilityRuleData.JSON_PROPERTY_AGENT_LABEL_SELECTION,
	PersonVisibilityRuleData.JSON_PROPERTY_AGENT_LABEL_NAMES,
	PersonVisibilityRuleData.JSON_PROPERTY_VISITOR_LABEL_SELECTION,
	PersonVisibilityRuleData.JSON_PROPERTY_VISITOR_LABEL_NAMES,
	PersonVisibilityRuleData.JSON_PROPERTY_CREATION_TIMESTAMP,
	PersonVisibilityRuleData.JSON_PROPERTY_MODIFICATION_TIMESTAMP,
	PersonVisibilityRuleData.JSON_PROPERTY_VERSION,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class PersonVisibilityRuleData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		PERSONVISIBILITYRULEDATA("PersonVisibilityRuleData");

		private String value;

		TypeEnum(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static TypeEnum fromValue(String value) {
			for (TypeEnum b : TypeEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			return TypeEnum.PERSONVISIBILITYRULEDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.PERSONVISIBILITYRULEDATA;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_NAME = "name";
	@JsonProperty(JSON_PROPERTY_NAME)
	private String name;

	public static final String JSON_PROPERTY_ENABLED = "enabled";
	@JsonProperty(JSON_PROPERTY_ENABLED)
	private Boolean enabled;

	public static final String JSON_PROPERTY_DESCRIPTION = "description";
	@JsonProperty(JSON_PROPERTY_DESCRIPTION)
	private String description;

	public static final String JSON_PROPERTY_AGENT_LABEL_SELECTION = "agentLabelSelection";
	@JsonProperty(JSON_PROPERTY_AGENT_LABEL_SELECTION)
	private EPersonVisibilityLabelSelection agentLabelSelection;

	public static final String JSON_PROPERTY_AGENT_LABEL_NAMES = "agentLabelNames";
	@JsonProperty(JSON_PROPERTY_AGENT_LABEL_NAMES)
	private List<String> agentLabelNames = null;

	public static final String JSON_PROPERTY_VISITOR_LABEL_SELECTION = "visitorLabelSelection";
	@JsonProperty(JSON_PROPERTY_VISITOR_LABEL_SELECTION)
	private EPersonVisibilityLabelSelection visitorLabelSelection;

	public static final String JSON_PROPERTY_VISITOR_LABEL_NAMES = "visitorLabelNames";
	@JsonProperty(JSON_PROPERTY_VISITOR_LABEL_NAMES)
	private List<String> visitorLabelNames = null;

	public static final String JSON_PROPERTY_CREATION_TIMESTAMP = "creationTimestamp";
	@JsonProperty(JSON_PROPERTY_CREATION_TIMESTAMP)
	private Long creationTimestamp;

	public static final String JSON_PROPERTY_MODIFICATION_TIMESTAMP = "modificationTimestamp";
	@JsonProperty(JSON_PROPERTY_MODIFICATION_TIMESTAMP)
	private Long modificationTimestamp;

	public static final String JSON_PROPERTY_VERSION = "version";
	@JsonProperty(JSON_PROPERTY_VERSION)
	private Long version;

	public PersonVisibilityRuleData $type(TypeEnum $type) {
		this.$type = $type;
		return this;
	}

	/**
	 * Get $type
	 * 
	 * @return $type
	 **/
	@ApiModelProperty(value = "")
	public TypeEnum get$Type() {
		return $type;
	}

	public void set$Type(TypeEnum $type) {
		this.$type = $type;
	}

	public PersonVisibilityRuleData id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * The person&#39;s unique ID. When creating a person this property can be omitted, it&#39;s generated by the server.
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "The person's unique ID. When creating a person this property can be omitted, it's generated by the server.")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public PersonVisibilityRuleData accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * ID of the Unblu account the person belongs to. When creating an entity this property can be omitted. Unblu automatically fills it with the account ID of the
	 * user currently logged in. When editing an entity, you must include the account ID.
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "ID of the Unblu account the person belongs to. When creating an entity this property can be omitted. Unblu automatically fills it with the account ID of the user currently logged in. When editing an entity, you must include the account ID.")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public PersonVisibilityRuleData name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Unique name of the visibility rule. Maximum length of 250 characters. Mandatory.
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "Unique name of the visibility rule. Maximum length of 250 characters. Mandatory.")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PersonVisibilityRuleData enabled(Boolean enabled) {
		this.enabled = enabled;
		return this;
	}

	/**
	 * Flag indicating whether the rule is enabled or not. The default value is true.
	 * 
	 * @return enabled
	 **/
	@ApiModelProperty(value = "Flag indicating whether the rule is enabled or not. The default value is true.")
	public Boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public PersonVisibilityRuleData description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Description of the visibility rule. Maximum length of 500 characters. Optional.
	 * 
	 * @return description
	 **/
	@ApiModelProperty(value = "Description of the visibility rule. Maximum length of 500 characters. Optional.")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public PersonVisibilityRuleData agentLabelSelection(EPersonVisibilityLabelSelection agentLabelSelection) {
		this.agentLabelSelection = agentLabelSelection;
		return this;
	}

	/**
	 * Get agentLabelSelection
	 * 
	 * @return agentLabelSelection
	 **/
	@ApiModelProperty(value = "")
	public EPersonVisibilityLabelSelection getAgentLabelSelection() {
		return agentLabelSelection;
	}

	public void setAgentLabelSelection(EPersonVisibilityLabelSelection agentLabelSelection) {
		this.agentLabelSelection = agentLabelSelection;
	}

	public PersonVisibilityRuleData agentLabelNames(List<String> agentLabelNames) {
		this.agentLabelNames = agentLabelNames;
		return this;
	}

	public PersonVisibilityRuleData addAgentLabelNamesItem(String agentLabelNamesItem) {
		if (this.agentLabelNames == null) {
			this.agentLabelNames = new ArrayList<>();
		}
		this.agentLabelNames.add(agentLabelNamesItem);
		return this;
	}

	/**
	 * A list of all the person labels an agent needs to have so that they&#39;re selected by the visibility rule. For any given scope, the list may only contain
	 * one label in that scope. Mandatory when agentLabelSelection &#x3D; DEFINED_LIST.
	 * 
	 * @return agentLabelNames
	 **/
	@ApiModelProperty(value = "A list of all the person labels an agent needs to have so that they're selected by the visibility rule. For any given scope, the list may only contain one label in that scope. Mandatory when agentLabelSelection = DEFINED_LIST.")
	public List<String> getAgentLabelNames() {
		return agentLabelNames;
	}

	public void setAgentLabelNames(List<String> agentLabelNames) {
		this.agentLabelNames = agentLabelNames;
	}

	public PersonVisibilityRuleData visitorLabelSelection(EPersonVisibilityLabelSelection visitorLabelSelection) {
		this.visitorLabelSelection = visitorLabelSelection;
		return this;
	}

	/**
	 * Get visitorLabelSelection
	 * 
	 * @return visitorLabelSelection
	 **/
	@ApiModelProperty(value = "")
	public EPersonVisibilityLabelSelection getVisitorLabelSelection() {
		return visitorLabelSelection;
	}

	public void setVisitorLabelSelection(EPersonVisibilityLabelSelection visitorLabelSelection) {
		this.visitorLabelSelection = visitorLabelSelection;
	}

	public PersonVisibilityRuleData visitorLabelNames(List<String> visitorLabelNames) {
		this.visitorLabelNames = visitorLabelNames;
		return this;
	}

	public PersonVisibilityRuleData addVisitorLabelNamesItem(String visitorLabelNamesItem) {
		if (this.visitorLabelNames == null) {
			this.visitorLabelNames = new ArrayList<>();
		}
		this.visitorLabelNames.add(visitorLabelNamesItem);
		return this;
	}

	/**
	 * A list of all the person labels a visitor needs to have so that they&#39;re selected by the visibility rule. For any given scope, the list may only contain
	 * one label in that scope. Mandatory when visitorLabelSelection &#x3D; DEFINED_LIST.
	 * 
	 * @return visitorLabelNames
	 **/
	@ApiModelProperty(value = "A list of all the person labels a visitor needs to have so that they're selected by the visibility rule. For any given scope, the list may only contain one label in that scope. Mandatory when visitorLabelSelection = DEFINED_LIST.")
	public List<String> getVisitorLabelNames() {
		return visitorLabelNames;
	}

	public void setVisitorLabelNames(List<String> visitorLabelNames) {
		this.visitorLabelNames = visitorLabelNames;
	}

	public PersonVisibilityRuleData creationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
		return this;
	}

	/**
	 * Creation timestamp of the entity. It is defined when the entity is first stored in Unblu. Any value sent to the Unblu server is ignored, so it can be
	 * omitted. Note: If you set this property, Unblu returns the same value, but it isn&#39;t written to storage and doesn&#39;t affect data consistency.
	 * 
	 * @return creationTimestamp
	 **/
	@ApiModelProperty(value = "Creation timestamp of the entity. It is defined when the entity is first stored in Unblu. Any value sent to the Unblu server is ignored, so it can be omitted. Note: If you set this property, Unblu returns the same value, but it isn't written to storage and doesn't affect data consistency.")
	public Long getCreationTimestamp() {
		return creationTimestamp;
	}

	public void setCreationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	public PersonVisibilityRuleData modificationTimestamp(Long modificationTimestamp) {
		this.modificationTimestamp = modificationTimestamp;
		return this;
	}

	/**
	 * Timestamp of the last modification. This property is always optional and can be omitted when sending data to the server. If sent to the server, it is
	 * ignored. It is only informational in character. Note: If you set this property, it returns the same value but it isn&#39;t written to storage and doesn&#39;t
	 * affect the data consistency.
	 * 
	 * @return modificationTimestamp
	 **/
	@ApiModelProperty(value = "Timestamp of the last modification. This property is always optional and can be omitted when sending data to the server. If sent to the server, it is ignored. It is only informational in character. Note: If you set this property, it returns the same value but it isn't written to storage and doesn't affect the data consistency.")
	public Long getModificationTimestamp() {
		return modificationTimestamp;
	}

	public void setModificationTimestamp(Long modificationTimestamp) {
		this.modificationTimestamp = modificationTimestamp;
	}

	public PersonVisibilityRuleData version(Long version) {
		this.version = version;
		return this;
	}

	/**
	 * Version of the entity. The version is incremented on each change. Entity updates that aren&#39;t based on the latest version are rejected. When creating an
	 * object, the version can be omitted.
	 * 
	 * @return version
	 **/
	@ApiModelProperty(value = "Version of the entity. The version is incremented on each change. Entity updates that aren't based on the latest version are rejected. When creating an object, the version can be omitted.")
	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PersonVisibilityRuleData personVisibilityRuleData = (PersonVisibilityRuleData) o;
		return Objects.equals(this.$type, personVisibilityRuleData.$type) &&
				Objects.equals(this.id, personVisibilityRuleData.id) &&
				Objects.equals(this.accountId, personVisibilityRuleData.accountId) &&
				Objects.equals(this.name, personVisibilityRuleData.name) &&
				Objects.equals(this.enabled, personVisibilityRuleData.enabled) &&
				Objects.equals(this.description, personVisibilityRuleData.description) &&
				Objects.equals(this.agentLabelSelection, personVisibilityRuleData.agentLabelSelection) &&
				Objects.equals(this.agentLabelNames, personVisibilityRuleData.agentLabelNames) &&
				Objects.equals(this.visitorLabelSelection, personVisibilityRuleData.visitorLabelSelection) &&
				Objects.equals(this.visitorLabelNames, personVisibilityRuleData.visitorLabelNames) &&
				Objects.equals(this.creationTimestamp, personVisibilityRuleData.creationTimestamp) &&
				Objects.equals(this.modificationTimestamp, personVisibilityRuleData.modificationTimestamp) &&
				Objects.equals(this.version, personVisibilityRuleData.version);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, accountId, name, enabled, description, agentLabelSelection, agentLabelNames, visitorLabelSelection, visitorLabelNames, creationTimestamp, modificationTimestamp, version);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PersonVisibilityRuleData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    agentLabelSelection: ").append(toIndentedString(agentLabelSelection)).append("\n");
		sb.append("    agentLabelNames: ").append(toIndentedString(agentLabelNames)).append("\n");
		sb.append("    visitorLabelSelection: ").append(toIndentedString(visitorLabelSelection)).append("\n");
		sb.append("    visitorLabelNames: ").append(toIndentedString(visitorLabelNames)).append("\n");
		sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
		sb.append("    modificationTimestamp: ").append(toIndentedString(modificationTimestamp)).append("\n");
		sb.append("    version: ").append(toIndentedString(version)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

}
