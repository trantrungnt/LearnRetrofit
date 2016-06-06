package techkids.mad3.learnretrofit;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by TrungNT on 6/6/2016.
 */
public interface LoginService {
    @GET("api/techkids/login")
    Call<LoginResult> login(@Query("username") String username, @Query("password") String password);
}
