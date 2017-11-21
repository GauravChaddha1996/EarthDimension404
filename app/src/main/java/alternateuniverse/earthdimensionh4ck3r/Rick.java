package alternateuniverse.earthdimensionh4ck3r;

class Rick {
    boolean rickiest;
    PortalGun portalGun;
    Morty morty;

    Rick(boolean rickiest, PortalGun portalGun, Morty morty) {
        this.rickiest = rickiest;
        this.portalGun = portalGun;
        this.morty = morty;
    }

    void goOnAdventure() {
        exploitTime();
    }

    private void exploitTime() {
        portalGun.goToEarthDimension("C137");
    }

}
