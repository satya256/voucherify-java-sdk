package pl.rspective.voucherify.client.model;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Customer {
    
    private String id;
    
    @SerializedName("source_id")
    private String sourceId;
    
    private String name;
    
    private String email;
    
    private String description;
    
    @SerializedName("created_at")
    private Date createdAt;
    
    private Map<String, Object> metadata;
    
    private String object;
    
    public String getId() {
        return id;
    }
    
    public String getSourceId() {
        return sourceId;
    }
    
    public String getName() {
        return name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getDescription() {
        return description;
    }
    
    public Date getCreatedAt() {
        return createdAt;
    }
    
    public Map<String, Object> getMetadata() {
        return metadata;
    }
    
    public String getObject() {
        return object;
    }
    
    public static class Builder {
        private String sourceId;
        private String name;
        private String email;
        private String description;
        private Map<String, Object> metadata;
              
        public Builder setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        
        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        
        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }
        
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }
        
        public Builder setMetadata(Map<String, Object> metadata) {
            this.metadata = metadata;
            return this;
        }
        
        public Builder addMetadata(String key, Object value) {
            if (metadata == null) {
                metadata = new HashMap<>();
            }
            metadata.put(key, value);
            return this;
        }
        
        public Customer build() {
            Customer customer = new Customer();
            customer.sourceId = sourceId;
            customer.name = name;
            customer.email = email;
            customer.description = description;
            customer.metadata = metadata;
            customer.object = "customer";
            return customer;
        }
        
    }
}
