package alternateuniverse.earthdimensionh4ck3r;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class AlternateUniverse404 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Hey elliot", "Thanks for breaking this earth dimension. A rogue rick was hiding here." +
                "Go on find your flag now. I'll sit to watch intergalactic TV live.");
        Rick rick = new Rick(true, new PortalGun(), new Morty());
        rick.goOnAdventure();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }
}
