package Game;

/**
 * Created by duckman on 18/06/2016.
 */
public enum GlobalSettings
{
    INSTANCE;

    boolean debugMode = true;
    boolean rebuildProxies = true;
    private boolean disableHUD = false;
    private boolean discoverFileNames = false;

    public boolean debugMode() {
        return debugMode;
    }

    public void setDebugMode(boolean debugMode) {
        this.debugMode = debugMode;
    }

    /**
     * True if ccFiles should save proxie files when loaded.
     */
    public boolean rebuildProxies() {
        return rebuildProxies;
    }
    public void setRebuildProxies(boolean rebuildProxies) {
        this.rebuildProxies = rebuildProxies;
    }

    public void setDisableHUD(boolean disableHUD) {
        this.disableHUD = disableHUD;
    }

    public boolean isHUDDisabled() {
        return disableHUD;
    }

    public boolean discoverFileNames() {
        return discoverFileNames;
    }
}
