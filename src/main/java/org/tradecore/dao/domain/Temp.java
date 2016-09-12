package org.tradecore.dao.domain;

public class Temp extends BaseDomain {

    /**  */
    private static final long serialVersionUID = 1921514699633724117L;

    /**
     *  null, TEMP.ID
     */
    private String            id;

    /**
     *  null, TEMP.USER_NAME
     */
    private String            userName;

    /**
     *  null, TEMP.USER_AGE
     */
    private Short             userAge;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Short getUserAge() {
        return userAge;
    }

    public void setUserAge(Short userAge) {
        this.userAge = userAge;
    }
}