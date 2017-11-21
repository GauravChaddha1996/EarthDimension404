package alternateuniverse.earthdimensionh4ck3r;

import android.util.Log;

public class PortalGun {

    void goToEarthDimension(String portal) {
        if (!dangerousPortal(portal)) {
            Log.d("Message from Rick", "Your earth is depending on you to save it from E-Corp, " +
                    "can you figure this out? Ah I guess you aren't all that smart.");
        }
    }

    private boolean dangerousPortal(String portal) {
        /* Another comment to check*/
        switch (portal) {
            case "Z145":
                return true;
            case "H785":
                return true;
            case "C256":
                return true;
            case "Y895":
                return true;
            case "E685":
                return true;
            case "M765":
                return true;
            case "V234":
                return true;
            default:
                return false;
        }
    }
}
