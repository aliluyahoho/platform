package com.spring.database.entity;

public class ServiceInfo {
    private Integer id;

    private String interfaceName;

    private String version;

    private Integer timeout;

    public ServiceInfo() {
    }

    public ServiceInfo(Integer id, String interfaceName, String version, Integer timeout) {
        this.id = id;
        this.interfaceName = interfaceName;
        this.version = version;
        this.timeout = timeout;
    }

    public ServiceInfo(String interfaceName, String version, Integer timeout) {
        this.interfaceName = interfaceName;
        this.version = version;
        this.timeout = timeout;
    }

    public ServiceInfo(String interfaceName, String version) {
        this.interfaceName = interfaceName;
        this.version = version;
    }

    public ServiceInfo(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName == null ? null : interfaceName.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    @Override
    public String toString() {
        if(id != null){
            return "ServiceInfo ={" +
                    "id=" + id +
                    ", interfaceName='" + interfaceName + '\'' +
                    ", version='" + version + '\'' +
                    ", timeout=" + timeout +
                    '}';
        }else {
            return "ServiceInfo ={" +
                    "interfaceName='" + interfaceName + '\'' +
                    ", version='" + version + '\'' +
                    ", timeout=" + timeout +
                    '}';
        }

    }
}