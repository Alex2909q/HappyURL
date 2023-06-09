package academy.prog;

import java.util.Date;

public class UrlStatDTO extends UrlResultDTO {
    private long redirects;
    private Date lastAccess; // TODO: set normal format
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public long getRedirects() {
        return redirects;
    }

    public String getMessage() {
        return message;
    }

    public void setRedirects(long redirects) {
        this.redirects = redirects;
    }

    public Date getLastAccess() {
        return lastAccess;
    }

    public void setLastAccess(Date lastAccess) {
        this.lastAccess = lastAccess;
    }
}
