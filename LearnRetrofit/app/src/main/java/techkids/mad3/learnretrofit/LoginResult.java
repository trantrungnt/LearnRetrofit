package techkids.mad3.learnretrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by TrungNT on 6/6/2016.
 */
public class LoginResult {
    @SerializedName("login_message")
    @Expose
    public String loginMessage;
    @SerializedName("login_status")
    @Expose
    public Integer loginStatus;
    @SerializedName("link")
    @Expose
    public String link;
}
