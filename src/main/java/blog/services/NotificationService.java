package blog.services;

/**
 * Created by Grzegorz on 03.06.2017.
 */
public interface NotificationService {
    void addInfoMessage(String msg);
    void addErrorMessage(String msg);
}
