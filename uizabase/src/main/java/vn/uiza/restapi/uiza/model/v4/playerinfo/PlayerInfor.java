
package vn.uiza.restapi.uiza.model.v4.playerinfo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PlayerInfor {

    @SerializedName("data")
    @Expose
    private Data data;
    @SerializedName("version")
    @Expose
    private long version;
    @SerializedName("datetime")
    @Expose
    private String datetime;
    @SerializedName("policy")
    @Expose
    private String policy;
    @SerializedName("requestId")
    @Expose
    private String requestId;
    @SerializedName("serviceName")
    @Expose
    private String serviceName;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("code")
    @Expose
    private long code;
    @SerializedName("type")
    @Expose
    private String type;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
