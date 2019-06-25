package app;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class Methods {

    public Cep getCep(String cep){
        Cep cepl = null;

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://viacep.com.br/ws/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiMethods api = retrofit.create(ApiMethods.class);


        try {
            Call<Cep> call = api.getCep(cep);

            Response<Cep> r = call.execute();

            Cep t = r.body();

            cepl = t;


        } catch (Exception e) {
            e.printStackTrace();
        }

    return cepl;
    }
}
