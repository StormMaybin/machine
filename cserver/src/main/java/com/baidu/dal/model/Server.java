package com.baidu.dal.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 * <p>Created by mayongbin01 on 2017/1/17.</p>
 *
 * @author mayongbin01
 */
@Entity
public class Server implements Serializable {

    /**
     * id
     */
    @Id
    @GeneratedValue
    private int id;

    /**
     * dest ip
     */
    private String destIp;

    /**
     * login name
     */
    private String destLoginname;

    /**
     * password
     */
    private String destPassword;

    /**
     * dest type
     */
    private String destType;

    /**
     * port
     */
    private int destPort;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    @JoinColumn(name = "server_id")
    private List<ServerInfo> serverInfos = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDestIp() {
        return destIp;
    }

    public void setDestIp(String destIp) {
        this.destIp = destIp;
    }

    public String getDestLoginname() {
        return destLoginname;
    }

    public void setDestLoginname(String destLoginname) {
        this.destLoginname = destLoginname;
    }

    public String getDestPassword() {
        return destPassword;
    }

    public void setDestPassword(String destPassword) {
        this.destPassword = destPassword;
    }

    public String getDestType() {
        return destType;
    }

    public void setDestType(String destType) {
        this.destType = destType;
    }

    public Integer getDestPort() {
        return destPort;
    }

    public void setDestPort(int destPort) {
        this.destPort = destPort;
    }

    public List<ServerInfo> getServerInfos() {
        return serverInfos;
    }

    public void setServerInfos(List<ServerInfo> serverInfos) {
        this.serverInfos = serverInfos;
    }

    @Override
    public String toString() {
        return "Server[id: " + id + ", destIp: " + destIp + ", destLoginname: "
                + destLoginname + ", destPassword: "
                + destPassword + ", destType: " + destType + ", destPort"
                + destPort + " " + this.getServerInfos().toString() + " ]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Server)) {
            return false;
        }

        Server server = (Server) o;

        if (getId() == server.getId()) {
            return true;
        }
        return false;
    }
}
