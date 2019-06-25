package app;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiMethods {
    @GET("{cep}/json")
    Call<Cep> getCep(@Path("cep")String cep);

}
