
import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;


public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("BbYh5UDfisjcxE4HJfvK6T7Kt7Nltij6EFBpESAY")
                .clientKey("C1AycB18ePJD2Td6nRYn0deZISZzyERr90TArw70")
                .server("https://parseapi.back4app.com")
                .build()

        );
    }
}
