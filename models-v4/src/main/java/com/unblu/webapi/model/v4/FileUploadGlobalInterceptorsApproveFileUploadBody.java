
package com.unblu.webapi.model.v4;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request body for the &#39;fileUploadGlobalInterceptorsApproveFileUpload&#39; operation
 */
@ApiModel(description = "Request body for the 'fileUploadGlobalInterceptorsApproveFileUpload' operation")

@JsonPropertyOrder({
	FileUploadGlobalInterceptorsApproveFileUploadBody.JSON_PROPERTY_TOKEN,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class FileUploadGlobalInterceptorsApproveFileUploadBody {
	public static final String JSON_PROPERTY_TOKEN = "token";
	@JsonProperty(JSON_PROPERTY_TOKEN)
	private String token;

	public FileUploadGlobalInterceptorsApproveFileUploadBody token(String token) {
		this.token = token;
		return this;
	}

	/**
	 * The token used to identify the file this action applies to. The token is received when approval is requested through a
	 * &lt;code&gt;file_upload_interceptor.new_file&lt;/code&gt; webhook. Each file upload approval request contains a unique token.
	 * 
	 * @return token
	 **/
	@ApiModelProperty(value = "The token used to identify the file this action applies to. The token is received when approval is requested through a <code>file_upload_interceptor.new_file</code> webhook. Each file upload approval request contains a unique token.")
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		FileUploadGlobalInterceptorsApproveFileUploadBody fileUploadGlobalInterceptorsApproveFileUploadBody = (FileUploadGlobalInterceptorsApproveFileUploadBody) o;
		return Objects.equals(this.token, fileUploadGlobalInterceptorsApproveFileUploadBody.token);
	}

	@Override
	public int hashCode() {
		return Objects.hash(token);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class FileUploadGlobalInterceptorsApproveFileUploadBody {\n");
		sb.append("    token: ").append(toIndentedString(token)).append("\n");
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
